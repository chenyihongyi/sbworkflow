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
@TableName("sys_ueditor")
public class Ueditor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("UEDITOR_ID")
	private String ueditorId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private String userId;
    /**
     * 用户名
     */
	@TableField("USERNAME")
	private String username;
    /**
     * 文本内容
     */
	@TableField("CONTENT")
	private String content;
    /**
     * 类型
     */
	@TableField("CONTENT2")
	private String content2;
	@TableField("TYPE")
	private String type;


	public String getUeditorId() {
		return ueditorId;
	}

	public void setUeditorId(String ueditorId) {
		this.ueditorId = ueditorId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
