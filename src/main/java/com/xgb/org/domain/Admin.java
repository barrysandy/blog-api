package com.xgb.org.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Admin
 * <p>Title: Admin 系统管理员类</p>
 * <p>Description: </p>
 *  	
 * @author XuGongBin
 * @version 1.0.0
 * @date 2018/8/18 10:10
 */
@Component
public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5229764904579314556L;

	private String id;//id
	
	private String name;//姓名
	
	private String aliasName;//别名
	
	private String email;//email
	
	private String headImg;//头像
	
	private String password;//密码
	
	private String descM;//描述
	
	private String roleId;//角色id

	private SystemRole role;//所属角色 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescM() {
		return descM;
	}

	public void setDescM(String descM) {
		this.descM = descM;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public SystemRole getRole() {
		return role;
	}

	public void setRole(SystemRole role) {
		this.role = role;
	}

	public Admin() {
		super();
	}

	public Admin(String id, String name, String aliasName, String email, String headImg, String password, String descM,
			String roleId) {
		super();
		this.id = id;
		this.name = name;
		this.aliasName = aliasName;
		this.email = email;
		this.headImg = headImg;
		this.password = password;
		this.descM = descM;
		this.roleId = roleId;
	}

	public Admin(String id, String name, String aliasName, String email, String headImg, String password, String descM,
			String roleId, SystemRole role) {
		super();
		this.id = id;
		this.name = name;
		this.aliasName = aliasName;
		this.email = email;
		this.headImg = headImg;
		this.password = password;
		this.descM = descM;
		this.roleId = roleId;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", aliasName=" + aliasName + ", email=" + email + ", headImg="
				+ headImg + ", password=" + password + ", descM=" + descM + ", roleId=" + roleId + ", role=" + role
				+ "]";
	}

	
	
}
