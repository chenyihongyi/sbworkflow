package com.workflow.demo.mapper.dsno1.act;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 模型管理Mapper
 * @Author: Elvis
 * @Date: 2019/9/3 0:17
 */
public interface FHModelMapper {

    /**列表
     * @param page
     * @throws Exception
     */
    List<PageData> datalistPage(Page page);

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    PageData findById(PageData pd);

    /**修改
     * @param pd
     * @throws Exception
     */
    void edit(PageData pd);
}
