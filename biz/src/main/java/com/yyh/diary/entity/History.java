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
@Table(name="tbl_history")
public class History   {

	/**
	 * 主键
	 */
	private Integer id ;

	/**
	 * 详情id
	 */
	private Integer planDetailId ;

	/**
	 * 按钮类型记录 : 0、未完成 1、完成
	 */
	private Integer radioResult ;

	/**
	 * 用户id
	 */
	private Integer userId ;

	/**
	 * 日期：yyyy-mm-dd
	 */
	private String date ;

	/**
	 * 计划组名称（冗余字段）
	 */
	private String planGroupName ;

	/**
	 * 记录备注
	 */
	private String resultRemark ;

	/**
	 * 文本类型记录
	 */
	private String textResult ;

	/**
	 * 创建时间
	 */
	private Date gmtCreate ;

	/**
	 * 修改时间
	 */
	private Date gmtUpdate ;


	public History() {
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
	 * 详情id
	 */
	public Integer getPlanDetailId(){
		return  planDetailId;
	}
	/**
	 * 详情id
	 */
	public void setPlanDetailId(Integer planDetailId ){
		this.planDetailId = planDetailId;
	}

	/**
	 * 按钮类型记录 : 0、未完成 1、完成
	 */
	public Integer getRadioResult(){
		return  radioResult;
	}
	/**
	 * 按钮类型记录 : 0、未完成 1、完成
	 */
	public void setRadioResult(Integer radioResult ){
		this.radioResult = radioResult;
	}

	/**
	 * 用户id
	 */
	public Integer getUserId(){
		return  userId;
	}
	/**
	 * 用户id
	 */
	public void setUserId(Integer userId ){
		this.userId = userId;
	}

	/**
	 * 日期：yyyy-mm-dd
	 */
	public String getDate(){
		return  date;
	}
	/**
	 * 日期：yyyy-mm-dd
	 */
	public void setDate(String date ){
		this.date = date;
	}

	/**
	 * 计划组名称（冗余字段）
	 */
	public String getPlanGroupName(){
		return  planGroupName;
	}
	/**
	 * 计划组名称（冗余字段）
	 */
	public void setPlanGroupName(String planGroupName ){
		this.planGroupName = planGroupName;
	}

	/**
	 * 记录备注
	 */
	public String getResultRemark(){
		return  resultRemark;
	}
	/**
	 * 记录备注
	 */
	public void setResultRemark(String resultRemark ){
		this.resultRemark = resultRemark;
	}

	/**
	 * 文本类型记录
	 */
	public String getTextResult(){
		return  textResult;
	}
	/**
	 * 文本类型记录
	 */
	public void setTextResult(String textResult ){
		this.textResult = textResult;
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
