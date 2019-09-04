package com.workflow.demo.service.fhoa.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.fhoa.WorklogMapper;
import com.workflow.demo.service.fhoa.WorklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/9/4 20:44
 */
@Service
@Transactional
public class WorklogServiceImpl implements WorklogService {

    @Autowired
    private WorklogMapper worklogMapper;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        worklogMapper.save(pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        worklogMapper.delete(pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        worklogMapper.edit(pd);
    }

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception{
        return worklogMapper.datalistPage(page);
    }

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception{
        return worklogMapper.listAll(pd);
    }

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return worklogMapper.findById(pd);
    }

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
        worklogMapper.deleteAll(ArrayDATA_IDS);
    }

}
