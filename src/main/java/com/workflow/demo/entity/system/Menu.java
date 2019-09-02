package com.workflow.demo.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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

	private String MENU_ID;		//菜单ID
	private String MENU_NAME;	//菜单名称
	private String MENU_URL;	//链接
	private String PARENT_ID;	//上级菜单ID
	private String MENU_ORDER;	//排序
	private String MENU_ICON;	//图标
	private String MENU_TYPE;	//类型
	private String MENU_STATE;	//菜单状态
	private String SHIRO_KEY;	//权限标识
	private String target;
	private Menu parentMenu;
	private List<Menu> subMenu;
	private boolean hasMenu = false;




}
