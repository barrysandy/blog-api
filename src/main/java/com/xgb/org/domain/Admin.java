package com.xgb.org.domain;

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
public class Admin {

	private String id;//id
	
	private String name;//姓名
	
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
	

	public Admin(String id, String name, String password, String descM, String roleId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.descM = descM;
		this.roleId = roleId;
	}

	public Admin(String id, String name, String password, String descM, String roleId, SystemRole role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.descM = descM;
		this.roleId = roleId;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", descM=" + descM + ", roleId="
				+ roleId + ", role=" + role + "]";
	}
	
	
}
