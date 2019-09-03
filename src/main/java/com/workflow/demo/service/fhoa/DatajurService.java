package com.workflow.demo.service.fhoa;

import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.fhoa.Datajur;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 * 组织数据权限接口
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface DatajurService {

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

    /**取出某用户的组织数据权限
     * @param pd
     * @throws Exception
     */
    public PageData getDEPARTMENT_IDS(String USERNAME)throws Exception;
	
}
