package com.workflow.demo.service.system;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface FhlogService{

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(String USERNAME, String CONTENT)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
	
}
