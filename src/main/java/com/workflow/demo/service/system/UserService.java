package com.workflow.demo.service.system;

import com.workflow.demo.entity.Page;
import com.workflow.demo.entity.PageData;
import com.workflow.demo.entity.system.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
public interface UserService {

    /**通过用户名获取用户信息
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findByUsername(PageData pd)throws Exception;

    /**通过用户ID获取用户信息
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findById(PageData pd)throws Exception;

    /**用户列表
     * @param page
     * @return
     * @throws Exception
     */
    public List<PageData> userlistPage(Page page)throws Exception;

    /**通过用户ID获取用户信息和角色信息
     * @param USER_ID
     * @return
     * @throws Exception
     */
    public User getUserAndRoleById(String USER_ID) throws Exception;

    /**保存用户IP
     * @param pd
     * @throws Exception
     */
    public void saveIP(PageData pd)throws Exception;

    /**通过邮箱获取数据
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findByEmail(PageData pd)throws Exception;

    /**通过编码获取数据
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findByNumbe(PageData pd) throws Exception;

    /**列出某角色下的所有用户
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listAllUserByRoldId(PageData pd) throws Exception;

    /**用户列表(全部)
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listAllUser(PageData pd)throws Exception;

    /**用户列表(弹窗选择用)
     * @param page
     * @return
     * @throws Exception
     */
    public List<PageData> listUsersBystaff(Page page)throws Exception;

    /**保存用户
     * @param pd
     * @throws Exception
     */
    public void saveUser(PageData pd)throws Exception;

    /**保存用户系统皮肤
     * @param pd
     * @throws Exception
     */
    public void saveSkin(PageData pd)throws Exception;

    /**修改用户
     * @param pd
     * @throws Exception
     */
    public void editUser(PageData pd)throws Exception;

    /**删除用户
     * @param pd
     * @throws Exception
     */
    public void deleteUser(PageData pd)throws Exception;

    /**批量删除用户
     * @param pd
     * @throws Exception
     */
    public void deleteAllUser(String[] USER_IDS)throws Exception;


}
