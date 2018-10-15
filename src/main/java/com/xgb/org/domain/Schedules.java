package com.xgb.org.domain;

/**
 * 排期类
 * @author Mr.Xu
 *
 */
public class Schedules {

	private Integer id;//id
	
	private String title;//标题
	
	private String typese;//类型
	
	private Integer sendEmail;//是否发送邮件 1发送，2不发送
	
	private Integer sendMessage;//是否发送短信 1发送，2不发送（该功能本版本不开放，涉及短信收费的情况）
	
	private String runTime;//执行时间
	
	private String createTime;//创建时间
	
	private String updateTime;//修改时间
	
	private int statuses;//状态
	
	private String adminId;//创建者id

	private Admin admin;//创建者

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTypese() {
		return typese;
	}

	public void setTypese(String typese) {
		this.typese = typese;
	}

	public Integer getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(Integer sendEmail) {
		this.sendEmail = sendEmail;
	}

	public Integer getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(Integer sendMessage) {
		this.sendMessage = sendMessage;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
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

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Schedules() {
		super();
	}

	public Schedules(Integer id, String title, String typese, Integer sendEmail, Integer sendMessage, String runTime,
			String createTime, String updateTime, int statuses, String adminId, Admin admin) {
		super();
		this.id = id;
		this.title = title;
		this.typese = typese;
		this.sendEmail = sendEmail;
		this.sendMessage = sendMessage;
		this.runTime = runTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.statuses = statuses;
		this.adminId = adminId;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Schedules [id=" + id + ", title=" + title + ", typese=" + typese + ", sendEmail=" + sendEmail
				+ ", sendMessage=" + sendMessage + ", runTime=" + runTime + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", statuses=" + statuses + ", adminId=" + adminId + ", admin=" + admin
				+ "]";
	}
	
}
