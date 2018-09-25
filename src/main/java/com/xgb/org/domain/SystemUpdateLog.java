package com.xgb.org.domain;

import org.springframework.stereotype.Component;

/**
 * SystemUpdateLog
 * <p>Title: SystemUpdateLog 系统更新日志类</p>
 * <p>Description: </p>
 *  	
 * @author XuGongBin
 * @version 1.0.0
 * @date 2018/9/10 19:08
 */
@Component
public class SystemUpdateLog {

	private String id;//id
	
	private String title;//标题
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public SystemUpdateLog() {
		super();
	}

	public SystemUpdateLog(String id, String title, String descM, String createTime, String updateTime, int statuses) {
		super();
		this.id = id;
		this.title = title;
		this.descM = descM;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.statuses = statuses;
	}

	@Override
	public String toString() {
		return "SystemUpdateLog [id=" + id + ", title=" + title + ", descM=" + descM + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", statuses=" + statuses + "]";
	}

	
	
}
