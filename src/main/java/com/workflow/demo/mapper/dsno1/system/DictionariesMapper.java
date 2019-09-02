package com.workflow.demo.mapper.dsno1.system;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.system.Dictionaries;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface DictionariesMapper {

    /**
     * 通过ID获取其子级列表
     * @param parentId
     * @return
     * @throws Exception
     */
    List<Dictionaries> listSubDictByParentId(String parentId);

    /**列表
     * @param page
     * @throws Exception
     */
    List<PageData> datalistPage(Page page);

    /**通过id获取数据
     * @param pd
     * @throws Exception
     */
    PageData findById(PageData pd);

    /**通过编码获取数据
     * @param pd
     * @throws Exception
     */
    PageData findByBianma(PageData pd);

    /**新增
     * @param pd
     * @throws Exception
     */
    void save(PageData pd);

    /**修改
     * @param pd
     * @throws Exception
     */
    void edit(PageData pd);

    /**排查表检查是否被占用
     * @param pd
     * @throws Exception
     */
    PageData findFromTbs(PageData pd);

    /**删除
     * @param pd
     * @throws Exception
     */
    void delete(PageData pd);

}