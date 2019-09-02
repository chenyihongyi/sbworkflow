package com.workflow.demo.service.system;

import com.workflow.demo.entity.PageData;

/**
 * @Author: Elvis
 * @Date: 2019/9/3 1:41
 */
public interface PhotoService {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception;

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception;

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;
}
