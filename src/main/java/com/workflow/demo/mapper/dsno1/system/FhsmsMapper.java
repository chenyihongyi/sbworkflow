package com.workflow.demo.mapper.dsno1.system;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 站内信Mapper
 * @Author: Elvis
 * @Date: 2019/9/2 21:45
 */

public interface FhsmsMapper {

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

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd);

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> datalistPage(Page page);

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd);

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd);

    /**获取未读总数
     * @param pd
     * @throws Exception
     */
    public PageData findFhsmsCount(String USERNAME);

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS);

}
