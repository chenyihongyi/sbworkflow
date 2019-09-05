package com.workflow.demo.service.fhdb.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.fhdb.BRdbMapper;
import com.workflow.demo.service.fhdb.BRdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 数据库管理接口实现类
 * @Author: Elvis
 * @Date: 2019/9/5 22:17
 */
@Service(value="bRdbServiceImpl")
@Transactional
public class BRdbServiceImpl implements BRdbService {

    @Autowired
    private BRdbMapper bRdbMapper;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        bRdbMapper.save(pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        bRdbMapper.delete(pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        bRdbMapper.edit(pd);
    }

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception{
        return bRdbMapper.datalistPage(page);
    }

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception{
        return bRdbMapper.listAll(pd);
    }

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return bRdbMapper.findById(pd);
    }

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
        bRdbMapper.deleteAll(ArrayDATA_IDS);
    }

}
