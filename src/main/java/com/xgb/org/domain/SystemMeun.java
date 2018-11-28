package com.xgb.org.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * SystemMeun
 * <p>Title: SystemMeun 系统菜单类</p>
 * <p>Description: </p>
 *  	
 * @author XuGongBin
 * @version 1.0.0
 * @date 2018/8/25 14:10
 */
@Component
public class SystemMeun implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1958151821199434680L;

	private String id;//id
	
	private String name;//名称
	
	private String url;//菜单地址
	
	private String descM;//描述
	
	private String createTime;//创建时间
	
	private String updateTime;//修改时间
	
	private int statuses;//状态
	
	private int sort;//排序
	
	private String parentId;//父id
	
	private String icon;//图标
	
	private List<SystemMeun> childrens; //子菜单

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<SystemMeun> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<SystemMeun> childrens) {
		this.childrens = childrens;
	}

	public SystemMeun() {
		super();
	}

	public SystemMeun(String id, String name, String url, String descM, String createTime, String updateTime,
			int statuses, int sort, String parentId, String icon) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.descM = descM;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.statuses = statuses;
		this.sort = sort;
		this.parentId = parentId;
		this.icon = icon;
	}

	public SystemMeun(String id, String name, String url, String descM, String createTime, String updateTime,
			int statuses, int sort, String parentId, String icon, List<SystemMeun> childrens) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.descM = descM;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.statuses = statuses;
		this.sort = sort;
		this.parentId = parentId;
		this.icon = icon;
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "SystemMeun [id=" + id + ", name=" + name + ", url=" + url + ", descM=" + descM + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", statuses=" + statuses + ", sort=" + sort
				+ ", parentId=" + parentId + ", icon=" + icon + ", childrens=" + childrens + "]";
	}

	
	
}
