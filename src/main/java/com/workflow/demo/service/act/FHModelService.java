package com.workflow.demo.service.act;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;

import java.util.List;

/**
 * 模型管理接口
 * @Author: Elvis
 * @Date: 2019/9/5 15:00
 */
public interface FHModelService {

    /**
     * 列表
     * @param page
     * @return
     * @throws Exception
     */
    public List<PageData> list(Page page) throws Exception;

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
}
