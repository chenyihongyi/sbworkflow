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
@TableName("sys_fhlog")
public class Fhlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("FHLOG_ID")
	private String fhlogId;
    /**
     * 用户名
     */
	@TableField("USERNAME")
	private String username;
    /**
     * 操作时间
     */
	@TableField("CZTIME")
	private String cztime;
    /**
     * 事件
     */
	@TableField("CONTENT")
	private String content;


	public String getFhlogId() {
		return fhlogId;
	}

	public void setFhlogId(String fhlogId) {
		this.fhlogId = fhlogId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCztime() {
		return cztime;
	}

	public void setCztime(String cztime) {
		this.cztime = cztime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
