package com.workflow.demo.controller.fhim;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.service.fhim.HismsgService;
import com.workflow.demo.util.Jurisdiction;
import com.workflow.demo.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 聊天记录
 * @Author: Elvis
 * @Date: 2019/9/5 1:34
 */
@Controller
@RequestMapping("/hismsg")
public class HismsgController extends BaseController {

    @Autowired
    private HismsgService hismsgService;

    /**删除
     * @param out
     * @throws Exception
     */
    @RequestMapping(value="/delete")
    @ResponseBody
    public Object delete() throws Exception{
        Map<String,String> map = new HashMap<String,String>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        hismsgService.delete(pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**打开聊天记录窗口获取数据
     * @param page
     * @throws Exception
     */
    @RequestMapping(value="/himsglist")
    @ResponseBody
    public Object himsgList(Page page) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("TOID", pd.getString("id"));								//目标(好友或者群)
        pd.put("TYPE", pd.getString("type"));							//类型
        pd.put("USERNAME", Jurisdiction.getUsername());					//当前用户(发送者)
        page.setPd(pd);
        List<PageData>	varList = hismsgService.datalistPage(page);		//列出Hismsg列表
        map.put("varList", varList);
        map.put("page", page);
        map.put("pd", pd);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**列表
     * @param page
     * @throws Exception
     */
    @RequestMapping(value="/list")
    @ResponseBody
    public Object list(Page page) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        pd.put("TOID", pd.getString("id"));								//目标(好友或者群)
        pd.put("TYPE", pd.getString("type"));							//类型
        pd.put("USERNAME", Jurisdiction.getUsername());					//当前用户(发送者)
        page.setPd(pd);
        List<PageData> varList = hismsgService.datalistPage(page);		//列出Hismsg列表
        map.put("varList", varList);
        map.put("page", page);
        map.put("result", errInfo);				//返回结果
        return map;
    }

    /**批量删除
     * @param
     * @throws Exception
     */
    @RequestMapping(value="/deleteAll")
    @ResponseBody
    public Object deleteAll() throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        String errInfo = "success";
        PageData pd = new PageData();
        pd = this.getPageData();
        String DATA_IDS = pd.getString("DATA_IDS");
        if(Tools.notEmpty(DATA_IDS)){
            String ArrayDATA_IDS[] = DATA_IDS.split(",");
            hismsgService.deleteAll(ArrayDATA_IDS);
        }else{
            errInfo = "error";
        }
        map.put("result", errInfo);				//返回结果
        return map;
    }
}
