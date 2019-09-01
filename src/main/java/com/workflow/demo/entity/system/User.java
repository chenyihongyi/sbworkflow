package com.workflow.demo.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
@TableName("sys_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("USER_ID")
	private String userId;
    /**
     * 用户名
     */
	@TableField("USERNAME")
	private String username;
    /**
     * 密码
     */
	@TableField("PASSWORD")
	private String password;
    /**
     * 姓名
     */
	@TableField("NAME")
	private String name;
    /**
     * 角色ID
     */
	@TableField("ROLE_ID")
	private String roleId;
    /**
     * 最近登录时间
     */
	@TableField("LAST_LOGIN")
	private String lastLogin;
    /**
     * IP
     */
	@TableField("IP")
	private String ip;
    /**
     * 状态
     */
	@TableField("STATUS")
	private String status;
    /**
     * 备注
     */
	@TableField("BZ")
	private String bz;
    /**
     * 皮肤
     */
	@TableField("SKIN")
	private String skin;
    /**
     * 邮箱
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 编码
     */
	@TableField("NUMBER")
	private String number;
    /**
     * 电话
     */
	@TableField("PHONE")
	private String phone;
    /**
     * 副职角色ID组
     */
	@TableField("ROLE_IDS")
	private String roleIds;




}
