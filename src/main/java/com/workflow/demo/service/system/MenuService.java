package com.workflow.demo.service.system;

import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.system.Menu;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * 菜单服务接口
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface MenuService {

    /**新增菜单
     * @param menu
     * @throws Exception
     */
    public void addMenu(Menu menu) throws Exception;

    /**保存修改菜单
     * @param menu
     * @throws Exception
     */
    public void edit(Menu menu) throws Exception;

    /**获取最大的菜单ID
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findMaxId(PageData pd) throws Exception;

    /**获取所有菜单并填充每个菜单的子菜单列表(系统菜单列表)
     * @param MENU_ID
     * @return
     * @throws Exception
     */
    public List<Menu> listAllMenuQx(String MENU_ID) throws Exception;

    /**通过ID获取其子一级菜单
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<Menu> listSubMenuByParentId(String parentId)throws Exception;

    /**获取所有菜单并填充每个菜单的子菜单列表(菜单管理)(
     * @param MENU_ID
     * @return
     * @throws Exception
     */
    public List<Menu> listAllMenu(String MENU_ID) throws Exception;

    /**获取所有菜单并填充每个菜单的子菜单列表(系统菜单列表)
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData getMenuById(PageData pd) throws Exception;

    /**删除菜单
     * @param MENU_ID
     * @throws Exception
     */
    public void deleteMenuById(String MENU_ID) throws Exception;

    /**保存菜单图标
     * @param pd
     * @throws Exception
     */
    public void editicon(PageData pd) throws Exception;
	
}
