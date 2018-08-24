package com.xgb.org.domain;

import org.springframework.stereotype.Component;

@Component
public class Admin {

	private String id;//id
	
	private String name;//姓名
	
	private String password;//密码
	
	private String descM;//描述

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

	
	public Admin() {
		super();
	}

	public Admin(String id, String name, String password, String descM) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.descM = descM;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", descM=" + descM + "]";
	}
	
	
	
	
}
