package com.workflow.demo.controller.system;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.service.system.FhlogService;
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
 * 操作日志记录处理类
 * @author chenyihongyi
 * @since 2019-09-01
 */
@Controller
@RequestMapping("/fhlog")
public class FhlogController extends BaseController {

    @Autowired
    private FhlogService fHlogService;

    /**列表
     * @param page
     * @throws Exception
     */
    @RequestMapping(value="/list")
    @RequiresPermissions("fhlog:list")
    @ResponseBody
    public Object list(Page page) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        String KEYWORDS = pd.getString("KEYWORDS");		//关键词检索条件
        if(Tools.notEmpty(KEYWORDS))pd.put("KEYWORDS", KEYWORDS.trim());
        String STRARTTIME = pd.getString("STRARTTIME");					//开始时间
        String ENDTIME = pd.getString("ENDTIME");						//结束时间
        if(Tools.notEmpty(STRARTTIME))pd.put("STRARTTIME", STRARTTIME+" 00:00:00");
        if(Tools.notEmpty(ENDTIME))pd.put("ENDTIME", ENDTIME+" 00:00:00");
        page.setPd(pd);
        List<PageData> varList = fHlogService.list(page);		//列出FHlog列表
        map.put("varList", varList);
        map.put("page", page);
        map.put("pd", pd);
        map.put("result", errInfo);
        return map;
    }

    /**删除
     * @param out
     * @throws Exception
     */
    @RequestMapping(value="/delete")
    @RequiresPermissions("fhlog:del")
    @ResponseBody
    public Object delete() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        PageData pd = new PageData();
        pd = this.getPageData();
        fHlogService.delete(pd);
        map.put("result", "success");				//返回结果
        return map;
    }

    /**批量删除
     * @param
     * @throws Exception
     */
    @RequestMapping(value="/deleteAll")
    @RequiresPermissions("fhlog:del")
    @ResponseBody
    public Object deleteAll() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        String DATA_IDS = pd.getString("DATA_IDS");
        if(null != DATA_IDS && !"".equals(DATA_IDS)){
            String ArrayDATA_IDS[] = DATA_IDS.split(",");
            fHlogService.deleteAll(ArrayDATA_IDS);
        }else{
            errInfo = "error";
        }
        map.put("result", errInfo);				//返回结果
        return map;
    }
	
}
