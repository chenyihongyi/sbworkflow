package com.workflow.demo.mapper.dsno1.tools;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 代码生成器Mapper
 * @Author: Elvis
 * @Date: 2019/9/2 22:09
 */
public interface CreateCodeMapper {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd);

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd);

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

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    void deleteAll(String[] ArrayDATA_IDS);

    /**列表(主表)
     * @param page
     * @throws Exception
     */
    List<PageData> listFa();

}
