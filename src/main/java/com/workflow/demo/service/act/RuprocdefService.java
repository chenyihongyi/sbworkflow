package com.workflow.demo.service.act;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 正在运行的流程接口
 * @Author: Elvis
 * @Date: 2019/9/5 22:41
 */
public interface RuprocdefService {

    /**待办任务 or正在运行任务列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception;

    /**流程变量列表
     * @param page
     * @throws Exception
     */
    public List<PageData> varList(PageData pd)throws Exception;

    /**历史任务节点列表
     * @param page
     * @throws Exception
     */
    public List<PageData> hiTaskList(PageData pd)throws Exception;

    /**已办任务列表列表
     * @param page
     * @throws Exception
     */
    public List<PageData> hitasklist(Page page)throws Exception;

    /**激活or挂起任务(指定某个任务)
     * @param pd
     * @throws Exception
     */
    public void onoffTask(PageData pd)throws Exception;

    /**激活or挂起任务(指定某个流程的所有任务)
     * @param pd
     * @throws Exception
     */
    public void onoffAllTask(PageData pd)throws Exception;


}
