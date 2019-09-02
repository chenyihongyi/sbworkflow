package com.workflow.demo.entity.system;

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
@TableName("sys_dictionaries")
@Data
public class Dictionaries implements Serializable {

    private static final long serialVersionUID = 1L;

	private String NAME;			//名称
	private String NAME_EN;			//英文名称
	private String BIANMA;			//编码
	private String ORDER_BY;		//排序
	private String PARENT_ID;		//上级ID
	private String BZ;				//备注
	private String TBSNAME;			//关联表
	private String DICTIONARIES_ID;	//主键
	private String target;
	private Dictionaries dict;
	private List<Dictionaries> subDict;
	private boolean hasDict = false;
	private String treeurl;



}
