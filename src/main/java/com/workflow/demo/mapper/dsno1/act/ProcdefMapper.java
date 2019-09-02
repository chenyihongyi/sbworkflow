package com.workflow.demo.mapper.dsno1.act;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 流程管理Mapper
 * @Author: Elvis
 * @Date: 2019/9/3 0:22
 */
public interface ProcdefMapper {

    /**列表
     * @param page
     * @throws Exception
     */
    List<PageData> datalistPage(Page page);

}
