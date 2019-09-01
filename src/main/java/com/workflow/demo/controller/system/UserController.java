package com.workflow.demo.controller.system;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.system.Role;
import com.workflow.demo.service.system.FhlogService;
import com.workflow.demo.service.system.RoleService;
import com.workflow.demo.service.system.UeditorService;
import com.workflow.demo.service.system.UserService;
import com.workflow.demo.util.Jurisdiction;
import com.workflow.demo.util.Tools;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UeditorService ueditorService;

    @Autowired
    private FhlogService FHLOG;

    /**
     * 用户列表
     * @param page
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @RequiresPermissions("user:list")
    @ResponseBody
    public Object listUser(Page page)throws Exception{
        Map<String, Object> map = new HashMap<String, Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();

        String ROLE_ID = pd.getString("ROLE_ID");
        String KEYWORDS = pd.getString("KEYWORDS");
        if(Tools.notEmpty(KEYWORDS))pd.put("KEYWORDS", KEYWORDS.trim());
        String STRARTTIME = pd.getString("STRARTTIME");					//开始时间
        String ENDTIME = pd.getString("ENDTIME");						//结束时间
        if(Tools.notEmpty(STRARTTIME))pd.put("STRARTTIME", STRARTTIME+" 00:00:00");
        if(Tools.notEmpty(ENDTIME))pd.put("ENDTIME", ENDTIME+" 00:00:00");

        page.setPd(pd);
        List<PageData> userList = userService.userlistPage(page);		//列出用户列表
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);		//列出所有系统用户角色

        map.put("userList", userList);
        map.put("roleList", roleList);
        map.put("ROLE_ID", ROLE_ID);
        map.put("page", page);
        map.put("pd", pd);

        map.put("result", errInfo);
        return map;

    }

    /**
     * 新增用户页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/goAddUser")
    @RequiresPermissions("user:add")
    @ResponseBody
    public Object goAddUser()throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);		//列出所有系统用户角色
        map.put("roleList", roleList);
        map.put("result", errInfo);
        return map;
    }

    /**
     * 去修改用户页面(从系统用户页面修改)
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/goEditUser")
    @RequiresPermissions("user:edit")
    @ResponseBody
    public Object goEditUser() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        if("1".equals(pd.getString("USER_ID"))){return null;}		//不能修改admin用户
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);	//列出所有系统用户角色
        pd = userService.findById(pd);								//根据ID读取
        String ROLE_IDS = pd.getString("ROLE_IDS");					//副职角色ID
        if(Tools.notEmpty(ROLE_IDS)){
            String arryROLE_ID[] = ROLE_IDS.split(",");
            for(int i=0;i<roleList.size();i++){
                Role role = roleList.get(i);
                String roleId = role.getROLE_ID();
                for(int n=0;n<arryROLE_ID.length;n++){
                    if(arryROLE_ID[n].equals(roleId)){
                        role.setRIGHTS("1");	//此时的目的是为了修改用户信息上，能看到副职角色都有哪些
                        break;
                    }
                }
            }
        }
        map.put("pd", pd);
        map.put("roleList", roleList);
        map.put("result", errInfo);
        return map;
    }

    /**
     * 修改用户页面(个人资料修改)
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/goEditMyInfo")
    @ResponseBody
    public Object goEditMyInfo() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("ROLE_ID", "1");
        List<Role> roleList = roleService.listAllRolesByPId(pd);	//列出所有系统用户角色
        pd.put("USERNAME", Jurisdiction.getUsername());
        pd = userService.findByUsername(pd);						//根据用户名读取
        map.put("pd", pd);
        map.put("roleList", roleList);
        map.put("result", errInfo);
        return map;
    }

    /**
     * 修改用户(系统用户列表修改)
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/editUser")
    @RequiresPermissions("user:edit")
    @ResponseBody
    public Object editUser() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        FHLOG.save(Jurisdiction.getUsername(), "从系统用户中修改"+pd.getString("USERNAME")+"的资料");				//记录日志
        if(!Jurisdiction.getUsername().equals(pd.getString("USERNAME"))){ //如果当前登录用户修改用户资料提交的用户名非本人
            if("admin".equals(pd.getString("USERNAME")) && !"admin".equals(Jurisdiction.getUsername())){return null;}	//非admin用户不能修改admin
        }else{	//如果当前登录用户修改用户资料提交的用户名是本人，则不能修改本人的角色ID
            PageData upd = new PageData();
            upd = userService.findByUsername(pd);
            pd.put("ROLE_ID", upd.getString("ROLE_ID")); //对角色ID还原本人角色ID
            pd.put("ROLE_IDS", Tools.notEmpty(upd.getString("ROLE_IDS"))?upd.get("ROLE_IDS"):""); //对角色ID还原本人副职角色ID
        }
        if(pd.getString("PASSWORD") != null && !"".equals(pd.getString("PASSWORD"))){
            pd.put("PASSWORD", new SimpleHash("SHA-1", pd.getString("USERNAME"), pd.getString("PASSWORD")).toString());
        }
        userService.editUser(pd);	//执行修改
        map.put("result", errInfo);
        return map;
    }






	
}
