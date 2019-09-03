package com.workflow.demo.service.fhoa.impl;

import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.fhoa.DatajurMapper;
import com.workflow.demo.service.fhoa.DatajurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
@Service(value="datajurService")
@Transactional
public class DatajurServiceImpl implements DatajurService {

    @Autowired
    private DatajurMapper datajurMapper;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd)throws Exception{
        datajurMapper.save( pd);
    }

    /**修改
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd)throws Exception{
        datajurMapper.edit(pd);
    }


    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception{
        return (PageData)datajurMapper.findById(pd);
    }

    /**取出某用户的组织数据权限
     * @param pd
     * @throws Exception
     */
    public PageData getDEPARTMENT_IDS(String USERNAME)throws Exception{
        return (PageData)datajurMapper.getDEPARTMENT_IDS(USERNAME);
    }
	
}
