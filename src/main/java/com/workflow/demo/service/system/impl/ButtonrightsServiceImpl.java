package com.workflow.demo.service.system.impl;

import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.system.ButtonrightsMapper;
import com.workflow.demo.service.system.ButtonrightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 按钮权限服务接口实现类
 * @Author: Elvis
 * @Date: 2019/9/3 17:22
 */
@Service
@Transactional
public class ButtonrightsServiceImpl implements ButtonrightsService {

    @Autowired
    private ButtonrightsMapper buttonrightsMapper;

    /**列表(全部)左连接按钮表,查出安全权限标识(主副职角色综合)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAllBrAndQxnameByZF(String[] ROLE_IDS) throws Exception {
        return buttonrightsMapper.listAllBrAndQxnameByZF(ROLE_IDS);
    }

    /**列表(全部)左连接按钮表,查出安全权限标识(主职角色)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAllBrAndQxname(PageData pd) throws Exception {
        return buttonrightsMapper.listAllBrAndQxname(pd);
    }

    /**列表(全部)
     * @param pd
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd)throws Exception{
        return buttonrightsMapper.listAll(pd);
    }

    /**通过(角色ID和按钮ID)获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return buttonrightsMapper.findById(pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        buttonrightsMapper.delete(pd);
    }

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        buttonrightsMapper.save(pd);
    }

}
