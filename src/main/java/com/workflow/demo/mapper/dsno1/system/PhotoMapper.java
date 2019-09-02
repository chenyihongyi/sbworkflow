package com.workflow.demo.mapper.dsno1.system;

import com.workflow.demo.entity.PageData;

/**
 * 头像编辑Mapper
 * @Author: Elvis
 * @Date: 2019/9/2 21:55
 */
public interface PhotoMapper {

    /**新增
     * @param pd
     * @throws Exception
     */
    void save(PageData pd);

    /**修改
     * @param pd
     * @throws Exception
     */
    void edit(PageData pd);

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    PageData findById(PageData pd);

}
