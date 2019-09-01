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
@TableName("sys_role")
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

	private String ROLE_ID;		//ID
	private String ROLE_NAME;	//名称
	private String RIGHTS;		//权限(存放的除权后的菜单ID)控制菜单显示
	private String PARENT_ID;	//上级ID
	private String ADD_QX;		//新增权限(存放的除权后的菜单ID)有新增权限的菜单ID
	private String DEL_QX;		//删除权限(存放的除权后的菜单ID)有删除权限的菜单ID
	private String EDIT_QX;		//修改权限(存放的除权后的菜单ID)有修改权限的菜单ID
	private String CHA_QX;		//查看权限(存放的除权后的菜单ID)有查看权限的菜单ID
	private String RNUMBER;		//编号(在处理类中新增的时候自动生成)



}
