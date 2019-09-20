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
@Table(name="tbl_plan")
public class Plan   {

	/**
	 * 主键
	 */
	private Integer id ;

	/**
	 * 是否删除 ： 0、删除 1、未删除
	 */
	private Integer isDelete ;

	/**
	 * 计划组类型：1、学习计划 2、锻炼计划 3、工作计划  4、日常计划 5、其他类型
	 */
	private Integer planGroupType ;

	/**
	 * 状态：0、禁用 1、启用 
	 */
	private Integer status ;

	/**
	 * 用户id
	 */
	private Integer userId ;

	/**
	 * 计划组名称
	 */
	private String planGroupName ;

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


	public Plan() {
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
	 * 计划组类型：1、学习计划 2、锻炼计划 3、工作计划  4、日常计划 5、其他类型
	 */
	public Integer getPlanGroupType(){
		return  planGroupType;
	}
	/**
	 * 计划组类型：1、学习计划 2、锻炼计划 3、工作计划  4、日常计划 5、其他类型
	 */
	public void setPlanGroupType(Integer planGroupType ){
		this.planGroupType = planGroupType;
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
	 * 计划组名称
	 */
	public String getPlanGroupName(){
		return  planGroupName;
	}
	/**
	 * 计划组名称
	 */
	public void setPlanGroupName(String planGroupName ){
		this.planGroupName = planGroupName;
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
