package com.workflow.demo.service.system.impl;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.mapper.dsno1.system.FhlogMapper;
import com.workflow.demo.service.system.FhlogService;
import com.workflow.demo.util.DateUtil;
import com.workflow.demo.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
@Service
@Transactional
public class FhlogServiceImpl implements FhlogService {

    @Autowired
    private FhlogMapper fHlogMapper;

    /**新增
     * @param pd
     * @throws Exception
     */
    public void save(String USERNAME, String CONTENT)throws Exception{
        PageData pd = new PageData();
        pd.put("USERNAME", USERNAME);						//用户名
        pd.put("CONTENT", CONTENT);							//事件
        pd.put("FHLOG_ID", UuidUtil.get32UUID());			//主键
        pd.put("CZTIME", DateUtil.date2Str(new Date()));	//操作时间
        fHlogMapper.save(pd);
    }

    /**删除
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd)throws Exception{
        fHlogMapper.delete(pd);
    }

    /**列表
     * @param page
     * @throws Exception
     */
    public List<PageData> list(Page page)throws Exception{
        return fHlogMapper.datalistPage(page);
    }

    /**批量删除
     * @param ArrayDATA_IDS
     * @throws Exception
     */
    public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
        fHlogMapper.deleteAll(ArrayDATA_IDS);
    }

	
}
