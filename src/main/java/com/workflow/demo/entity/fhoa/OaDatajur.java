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
@TableName("oa_datajur")
public class OaDatajur implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DATAJUR_ID")
	private String datajurId;
    /**
     * 部门ID组合
     */
	@TableField("DEPARTMENT_IDS")
	private String departmentIds;
    /**
     * 员工ID
     */
	@TableField("STAFF_ID")
	private String staffId;
	@TableField("DEPARTMENT_ID")
	private String departmentId;


	public String getDatajurId() {
		return datajurId;
	}

	public void setDatajurId(String datajurId) {
		this.datajurId = datajurId;
	}

	public String getDepartmentIds() {
		return departmentIds;
	}

	public void setDepartmentIds(String departmentIds) {
		this.departmentIds = departmentIds;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

}
