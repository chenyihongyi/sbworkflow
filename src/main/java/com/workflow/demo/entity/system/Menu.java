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
@TableName("sys_menu")
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("MENU_ID")
	private Integer menuId;
	@TableField("MENU_NAME")
	private String menuName;
	@TableField("MENU_URL")
	private String menuUrl;
	@TableField("PARENT_ID")
	private String parentId;
	@TableField("MENU_ORDER")
	private String menuOrder;
	@TableField("MENU_ICON")
	private String menuIcon;
	@TableField("MENU_TYPE")
	private String menuType;
	@TableField("MENU_STATE")
	private Integer menuState;
	@TableField("SHIRO_KEY")
	private String shiroKey;




}
