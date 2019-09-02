package com.workflow.demo.mapper.dsno1.fhim;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 状态(在线or隐身以及签名)Mapper
 * @Author: Elvis
 * @Date: 2019/9/2 23:09
 */
public interface ImstateMapper {

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

    /**修改在线状态
     * @param pd
     * @throws Exception
     */
    public void editOnline(PageData pd)throws Exception;

    /**修改个性签名
     * @param pd
     * @throws Exception
     */
    public void editAuto(PageData pd)throws Exception;

    /**修改皮肤
     * @param pd
     * @throws Exception
     */
    public void editSign(PageData pd)throws Exception;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> datalistPage(Page page)throws Exception;

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

    /**通过用户名获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findByUsername(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
}
