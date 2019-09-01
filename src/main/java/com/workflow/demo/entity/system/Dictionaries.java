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
@TableName("sys_dictionaries")
@Data
public class Dictionaries implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DICTIONARIES_ID")
	private String dictionariesId;
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
     * 排序
     */
	@TableField("ORDER_BY")
	private Integer orderBy;
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
     * 排查表
     */
	@TableField("TBSNAME")
	private String tbsname;
	@TableField("TBFIELD")
	private String tbfield;
	@TableField("YNDEL")
	private String yndel;



}
