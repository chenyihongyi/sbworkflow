package com.workflow.demo.service.fhoa;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 员工管理接口
 * @Author: Elvis
 * @Date: 2019/9/4 15:43
 */

public interface StaffService {

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

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception;

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

    /**绑定用户
     * @param pd
     * @throws Exception
     */
    public void userBinding(PageData pd)throws Exception;
}
