package com.yyh.diary.entity;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/**
 * All rights Reserved, Designed By yyh
 * 
 * @author: yyh
 * @date:2019-09-06
 * @since V1.0.0-SNAPSHOT
 */
@Table(name="tbl_user")
public class User   {

	/**
	 * 主键
	 */
	private Integer id ;

	/**
	 * 角色id
	 */
	private Integer roleId ;

	/**
	 * 状态（1有效0无效）
	 */
	private Integer status ;

	/**
	 * 头像
	 */
	private String headImg ;

	/**
	 * 昵称
	 */
	private String nickName ;

	/**
	 * 密码
	 */
	private String password ;

	/**
	 * 手机
	 */
	private String phone ;

	/**
	 * 真实姓名
	 */
	private String realName ;

	/**
	 * 密码盐
	 */
	private String salt ;

	private Date gmtCreate ;

	private Date gmtUpdate ;


	public User() {
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
	 * 角色id
	 */
	public Integer getRoleId(){
		return  roleId;
	}
	/**
	 * 角色id
	 */
	public void setRoleId(Integer roleId ){
		this.roleId = roleId;
	}

	/**
	 * 状态（1有效0无效）
	 */
	public Integer getStatus(){
		return  status;
	}
	/**
	 * 状态（1有效0无效）
	 */
	public void setStatus(Integer status ){
		this.status = status;
	}

	/**
	 * 头像
	 */
	public String getHeadImg(){
		return  headImg;
	}
	/**
	 * 头像
	 */
	public void setHeadImg(String headImg ){
		this.headImg = headImg;
	}

	/**
	 * 昵称
	 */
	public String getNickName(){
		return  nickName;
	}
	/**
	 * 昵称
	 */
	public void setNickName(String nickName ){
		this.nickName = nickName;
	}

	/**
	 * 密码
	 */
	public String getPassword(){
		return  password;
	}
	/**
	 * 密码
	 */
	public void setPassword(String password ){
		this.password = password;
	}

	/**
	 * 手机
	 */
	public String getPhone(){
		return  phone;
	}
	/**
	 * 手机
	 */
	public void setPhone(String phone ){
		this.phone = phone;
	}

	/**
	 * 真实姓名
	 */
	public String getRealName(){
		return  realName;
	}
	/**
	 * 真实姓名
	 */
	public void setRealName(String realName ){
		this.realName = realName;
	}

	/**
	 * 密码盐
	 */
	public String getSalt(){
		return  salt;
	}
	/**
	 * 密码盐
	 */
	public void setSalt(String salt ){
		this.salt = salt;
	}

	public Date getGmtCreate(){
		return  gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate ){
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtUpdate(){
		return  gmtUpdate;
	}
	public void setGmtUpdate(Date gmtUpdate ){
		this.gmtUpdate = gmtUpdate;
	}


}
