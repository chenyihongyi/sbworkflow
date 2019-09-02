package com.workflow.demo.mapper.dsno1.act;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 历史流程Mapper
 * @Author: Elvis
 * @Date: 2019/9/3 0:19
 */
public interface HiprocdefMapper {

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> datalistPage(Page page)throws Exception;

    /**历史流程变量列表
     * @param page
     * @throws Exception
     */
    public List<PageData> hivarList(PageData pd)throws Exception;

}
