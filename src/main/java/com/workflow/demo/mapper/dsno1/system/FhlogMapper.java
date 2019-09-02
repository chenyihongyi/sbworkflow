package com.workflow.demo.mapper.dsno1.system;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface FhlogMapper {

    /**新增
     * @param pd
     * @throws Exception
     */
    void save(PageData pd);

    /**删除
     * @param pd
     * @throws Exception
     */
    void delete(PageData pd);

    /**列表
     * @param page
     * @throws Exception
     */
    List<PageData> datalistPage(Page page);

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    void deleteAll(String[] ArrayDATA_IDS);


}