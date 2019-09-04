package com.workflow.demo.service.fhoa.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.fhoa.MyleaveMapper;
import com.workflow.demo.service.fhoa.MyleaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/9/4 20:52
 */
@Service(value="myleaveServiceImpl")
@Transactional
public class MyleaveServiceImpl implements MyleaveService {

    @Autowired
    private MyleaveMapper myleaveMapper;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        myleaveMapper.save(pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        myleaveMapper.delete(pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        myleaveMapper.edit(pd);
    }

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception{
        return myleaveMapper.datalistPage(page);
    }

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return myleaveMapper.findById(pd);
    }

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
        myleaveMapper.deleteAll(ArrayDATA_IDS);
    }
}
