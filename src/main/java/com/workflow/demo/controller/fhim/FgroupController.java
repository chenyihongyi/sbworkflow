package com.workflow.demo.controller.fhim;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.service.fhim.FgroupService;
import com.workflow.demo.util.Jurisdiction;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 好友分组
 * @Author: Elvis
 * @Date: 2019/9/4 21:24
 */
@Controller
@RequestMapping("/fgroup")
public class FgroupController extends BaseController {

    @Autowired
    private FgroupService fgroupService;

    /**保存
     * @param
     * @throws Exception
     */
    @RequestMapping(value="/add")
    @RequiresPermissions("fgroup:add")
    @ResponseBody
    public Object save() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("FGROUP_ID", this.get32UUID());			//主键
        pd.put("USERNAME", Jurisdiction.getUsername());	//用户名
        fgroupService.save(pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**删除
     * @param out
     * @throws Exception
     */
    @RequestMapping(value="/delete")
    @RequiresPermissions("fgroup:del")
    @ResponseBody
    public Object delete() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        fgroupService.delete(pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**修改
     * @param
     * @throws Exception
     */
    @RequestMapping(value="/edit")
    @RequiresPermissions("fgroup:edit")
    @ResponseBody
    public Object edit() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        fgroupService.edit(pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**列表
     * @param page
     * @throws Exception
     */
    @RequestMapping(value="/list")
    @RequiresPermissions("fgroup:list")
    @ResponseBody
    public Object list(Page page) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("USERNAME", Jurisdiction.getUsername());
        page.setPd(pd);
        List<PageData> varList = fgroupService.datalistPage(page);	//列出Fgroup列表
        map.put("varList", varList);
        map.put("page", page);
        map.put("pd", pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**去修改页面
     * @param
     * @throws Exception
     */
    @RequestMapping(value="/goEdit")
    @ResponseBody
    public Object goEdit()throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd = fgroupService.findById(pd);	//根据ID读取
        map.put("pd", pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**获取分组列表
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/getFgroup")
    @ResponseBody
    public Object getLevels() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        PageData pd = new PageData();
        String errInfo = "success";
        pd = this.getPageData();
        pd.put("USERNAME", Jurisdiction.getUsername());	//用户名
        List<PageData> varList = fgroupService.listAll(pd);
        map.put("list", varList);
        map.put("result", errInfo);				//返回结果
        return map;
    }

}
