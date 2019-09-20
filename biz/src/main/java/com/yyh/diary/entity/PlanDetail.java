package com.yyh.diary.entity;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/**
 * All rights Reserved, Designed By yyh
 * 
 * @author: yyh
 * @date:2019-09-20
 * @since V1.0.0-SNAPSHOT
 */
@Table(name="tbl_plan_detail")
public class PlanDetail   {

	/**
	 * 主键
	 */
	private Integer id ;

	/**
	 * 输入类型： 1、按钮 2、输入框 3、文本域
	 */
	private Integer inputType ;

	/**
	 * 是否删除 ： 0、删除 1、未删除
	 */
	private Integer isDelete ;

	/**
	 * 计划id
	 */
	private Integer planId ;

	/**
	 * 状态：0、禁用 1、启用 
	 */
	private Integer status ;

	/**
	 * 计划名称
	 */
	private String planName ;

	/**
	 * 备注
	 */
	private String remark ;

	/**
	 * 创建时间
	 */
	private Date gmtCreate ;

	/**
	 * 修改时间
	 */
	private Date gmtUpdate ;


	public PlanDetail() {
	}

	/**
	 * 主键
	 */
	public Integer getId(){
		return  id;
	}
	/**
	 * 主键
	 */
	public void setId(Integer id ){
		this.id = id;
	}

	/**
	 * 输入类型： 1、按钮 2、输入框 3、文本域
	 */
	public Integer getInputType(){
		return  inputType;
	}
	/**
	 * 输入类型： 1、按钮 2、输入框 3、文本域
	 */
	public void setInputType(Integer inputType ){
		this.inputType = inputType;
	}

	/**
	 * 是否删除 ： 0、删除 1、未删除
	 */
	public Integer getIsDelete(){
		return  isDelete;
	}
	/**
	 * 是否删除 ： 0、删除 1、未删除
	 */
	public void setIsDelete(Integer isDelete ){
		this.isDelete = isDelete;
	}

	/**
	 * 计划id
	 */
	public Integer getPlanId(){
		return  planId;
	}
	/**
	 * 计划id
	 */
	public void setPlanId(Integer planId ){
		this.planId = planId;
	}

	/**
	 * 状态：0、禁用 1、启用 
	 */
	public Integer getStatus(){
		return  status;
	}
	/**
	 * 状态：0、禁用 1、启用 
	 */
	public void setStatus(Integer status ){
		this.status = status;
	}

	/**
	 * 计划名称
	 */
	public String getPlanName(){
		return  planName;
	}
	/**
	 * 计划名称
	 */
	public void setPlanName(String planName ){
		this.planName = planName;
	}

	/**
	 * 备注
	 */
	public String getRemark(){
		return  remark;
	}
	/**
	 * 备注
	 */
	public void setRemark(String remark ){
		this.remark = remark;
	}

	/**
	 * 创建时间
	 */
	public Date getGmtCreate(){
		return  gmtCreate;
	}
	/**
	 * 创建时间
	 */
	public void setGmtCreate(Date gmtCreate ){
		this.gmtCreate = gmtCreate;
	}

	/**
	 * 修改时间
	 */
	public Date getGmtUpdate(){
		return  gmtUpdate;
	}
	/**
	 * 修改时间
	 */
	public void setGmtUpdate(Date gmtUpdate ){
		this.gmtUpdate = gmtUpdate;
	}


}
