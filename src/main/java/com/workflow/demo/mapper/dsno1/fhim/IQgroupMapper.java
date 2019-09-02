package com.workflow.demo.mapper.dsno1.fhim;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 我在的群组Mapper
 * @Author: Elvis
 * @Date: 2019/9/2 23:21
 */
public interface IQgroupMapper {

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
    public List<PageData> datalistPage(Page page)throws Exception;

    /**列表(全部群成员)带分页
     * @param page
     * @throws Exception
     */
    public List<PageData> memberslistPage(Page page)throws Exception;

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

    /**判断我是否在某群
     * @param pd
     * @throws Exception
     */
    public PageData findByIdandQid(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

}
