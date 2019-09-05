package com.workflow.demo.controller.act.rutask;

import com.workflow.demo.controller.act.AcBusinessController;
import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.service.act.HiprocdefService;
import com.workflow.demo.service.act.RuprocdefService;
import com.workflow.demo.service.system.FhsmsService;
import com.workflow.demo.util.Jurisdiction;
import com.workflow.demo.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 待办任务
 * @Author: Elvis
 * @Date: 2019/9/5 22:35
 */
@Controller
@RequestMapping(value="/rutask")
public class RuTaskController extends AcBusinessController {

    @Autowired
    private RuprocdefService ruprocdefService;

    @Autowired
    private FhsmsService hiprocdefService;

    @Autowired
    private HiprocdefService hiprocdeService;

    public Object list(Page page)throws Exception{
    Map<String, Object> map = new HashMap<String, Object>();
    String errInfo = "success";
    PageData pd = new PageData();
    pd = this.getPageData();
    String KEYWORDS = pd.getString("KEYWORDS");
    if(Tools.notEmpty(KEYWORDS))pd.put("keywords", KEYWORDS.trim());
    String STRARTTIME = pd.getString("STRARTTIME");
    String ENDTIME = pd.getString("ENDTIME");
    if(Tools.notEmpty(STRARTTIME))pd.put("lastStart", STRARTTIME+"00:00:00");
    if(Tools.notEmpty(ENDTIME))pd.put("lastEnd", ENDTIME+"00:00:00");
    pd.put("USERNAME", Jurisdiction.getUsername());
    pd.put("RNUMBERS", Jurisdiction.getRnumbers());
        page.setPd(pd);
        List<PageData>	varList = ruprocdefService.list(page);	//列出Rutask列表
        for(int i=0;i<varList.size();i++){
            varList.get(i).put("INITATOR", getInitiator(varList.get(i).getString("PROC_INST_ID_")));//流程申请人
        }
        map.put("varList", varList);
        map.put("page", page);
        map.put("result", errInfo);
        return map;
}




}
