package com.workflow.demo.service.system;

import com.workflow.demo.entity.PageData;

/**
 * <p>
 *  服务类
 * </p>
 * 富文本编辑器内容缓存接口
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface UeditorService {

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception;

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception;

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

	
}
