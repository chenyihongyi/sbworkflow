package com.workflow.demo.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

/**
 *权限工具类
 * @Author: Elvis
 * @Date: 2019/9/1 21:57
 */
public class Jurisdiction {

    /**shiro管理的session
     * @return
     */
    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    /**获取当前登录的用户名
     * @return
     */
    public static String getUsername(){
        return getSession().getAttribute(Const.SESSION_USERNAME).toString();
    }

    /**获取当前登录的姓名
     * @return
     */
    public static String getName(){
        return getSession().getAttribute(Const.SESSION_U_NAME).toString();
    }

    /**获取当前登录用户的角色编码
     * @return
     */
    public static String getRnumbers(){
        return getSession().getAttribute(Const.SESSION_RNUMBERS).toString();
    }

    /**获取用户的最高组织机构权限集合
     * @return
     */
    public static String getDEPARTMENT_IDS(){
        return getSession().getAttribute(Const.DEPARTMENT_IDS).toString();
    }

    /**获取用户的最高组织机构权限
     * @return
     */
    public static String getDEPARTMENT_ID(){
        return getSession().getAttribute(Const.DEPARTMENT_ID).toString();
    }

}
