package com.xgb.org.domain;

import org.springframework.stereotype.Component;

/**
 * SystemRole
 * <p>Title: SystemRole 系统角色类</p>
 * <p>Description: </p>
 *  	
 * @author XuGongBin
 * @version 1.0.0
 * @date 2018/8/25 14:10
 */
@Component
public class SystemRole {

	private String id;//id
	
	private String name;//名称
	
	private String descM;//描述
	
	private String createTime;//创建时间
	
	private String updateTime;//修改时间
	
	private int statuses;//状态

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

	public String getDescM() {
		return descM;
	}

	public void setDescM(String descM) {
		this.descM = descM;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getStatuses() {
		return statuses;
	}

	public void setStatuses(int statuses) {
		this.statuses = statuses;
	}

	public SystemRole() {
		super();
	}

	public SystemRole(String id, String name, String descM, String createTime, String updateTime, int statuses) {
		super();
		this.id = id;
		this.name = name;
		this.descM = descM;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.statuses = statuses;
	}

	@Override
	public String toString() {
		return "SystemRole [id=" + id + ", name=" + name + ", descM=" + descM + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", statuses=" + statuses + "]";
	}
	
	
	
	
}
