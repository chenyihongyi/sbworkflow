package com.workflow.demo.service.fhoa;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 请假申请服务接口
 * @Author: Elvis
 * @Date: 2019/9/4 20:51
 */

public interface MyleaveService {

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception;

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

}
