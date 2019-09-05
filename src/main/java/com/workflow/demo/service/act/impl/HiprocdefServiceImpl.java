package com.workflow.demo.service.act.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.act.HiprocdefMapper;
import com.workflow.demo.service.act.HiprocdefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 历史流程任务接口实现类
 * @Author: Elvis
 * @Date: 2019/9/5 22:48
 */
@Service(value="hiprocdefServiceImpl")
@Transactional
public class HiprocdefServiceImpl implements HiprocdefService {

    @Autowired
    private HiprocdefMapper hiprocdefMapper;

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page) throws Exception {
        return hiprocdefMapper.datalistPage(page);
    }

    /**历史流程变量列表
     * @param page
     * @throws Exception
     */
    public List<PageData> hivarList(PageData pd) throws Exception {
        return hiprocdefMapper.hivarList(pd);
    }
}
