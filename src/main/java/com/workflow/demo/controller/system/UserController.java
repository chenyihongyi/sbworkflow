package com.workflow.demo.controller.system;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.system.Role;
import com.workflow.demo.service.system.FhlogService;
import com.workflow.demo.service.system.RoleService;
import com.workflow.demo.service.system.UeditorService;
import com.workflow.demo.service.system.UserService;
import com.workflow.demo.util.Tools;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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







	
}
