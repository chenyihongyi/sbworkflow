package com.workflow.demo.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
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
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ROLE_ID")
	private String roleId;
	@TableField("ROLE_NAME")
	private String roleName;
	@TableField("RIGHTS")
	private String rights;
	@TableField("PARENT_ID")
	private String parentId;
	@TableField("ADD_QX")
	private String addQx;
	@TableField("DEL_QX")
	private String delQx;
	@TableField("EDIT_QX")
	private String editQx;
	@TableField("CHA_QX")
	private String chaQx;
	@TableField("RNUMBER")
	private String rnumber;


	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getAddQx() {
		return addQx;
	}

	public void setAddQx(String addQx) {
		this.addQx = addQx;
	}

	public String getDelQx() {
		return delQx;
	}

	public void setDelQx(String delQx) {
		this.delQx = delQx;
	}

	public String getEditQx() {
		return editQx;
	}

	public void setEditQx(String editQx) {
		this.editQx = editQx;
	}

	public String getChaQx() {
		return chaQx;
	}

	public void setChaQx(String chaQx) {
		this.chaQx = chaQx;
	}

	public String getRnumber() {
		return rnumber;
	}

	public void setRnumber(String rnumber) {
		this.rnumber = rnumber;
	}

}
