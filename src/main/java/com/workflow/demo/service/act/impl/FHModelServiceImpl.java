package com.workflow.demo.service.act.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.act.FHModelMapper;
import com.workflow.demo.service.act.FHModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Elvis
 * @Date: 2019/9/5 15:07
 */
@Service
@Transactional
public class FHModelServiceImpl implements FHModelService {

    @Autowired
    private FHModelMapper fhModelMapper;

    /**
     * 列表
     * @param page
     * @return
     * @throws Exception
     */
    public List<PageData> list(Page page) throws Exception{
        return fhModelMapper.datalistPage(page);
    }

    /**
     * 通过id获取数据
     * @param pd
     * @return
     * @throws Exception
     */
    @Override
    public PageData findById(PageData pd) throws Exception {
        return fhModelMapper.findById(pd);
    }

    /**
     * 修改
     * @param pd
     * @throws Exception
     */
    @Override
    public void edit(PageData pd) throws Exception {
      fhModelMapper.edit(pd);
    }

}
