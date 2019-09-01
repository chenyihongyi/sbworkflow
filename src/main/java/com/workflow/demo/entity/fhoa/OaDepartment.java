package com.workflow.demo.entity.fhoa;

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
@TableName("oa_department")
public class OaDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DEPARTMENT_ID")
	private String departmentId;
    /**
     * 名称
     */
	@TableField("NAME")
	private String name;
    /**
     * 英文
     */
	@TableField("NAME_EN")
	private String nameEn;
    /**
     * 编码
     */
	@TableField("BIANMA")
	private String bianma;
    /**
     * 上级ID
     */
	@TableField("PARENT_ID")
	private String parentId;
    /**
     * 备注
     */
	@TableField("BZ")
	private String bz;
    /**
     * 负责人
     */
	@TableField("HEADMAN")
	private String headman;
    /**
     * 电话
     */
	@TableField("TEL")
	private String tel;
    /**
     * 部门职能
     */
	@TableField("FUNCTIONS")
	private String functions;
    /**
     * 地址
     */
	@TableField("ADDRESS")
	private String address;


	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getBianma() {
		return bianma;
	}

	public void setBianma(String bianma) {
		this.bianma = bianma;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getHeadman() {
		return headman;
	}

	public void setHeadman(String headman) {
		this.headman = headman;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFunctions() {
		return functions;
	}

	public void setFunctions(String functions) {
		this.functions = functions;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
