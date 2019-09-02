package com.workflow.demo.mapper.dsno1.system;

import com.workflow.demo.entity.PageData;

/**
 * @Author: Elvis
 * @Date: 2019/9/2 20:13
 */
public interface UeditorMapper {

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

    /**删除
     * @param pd
     * @throws Exception
     */
    void delete(PageData pd);

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    void deleteAll(String[] ArrayDATA_IDS);
}
