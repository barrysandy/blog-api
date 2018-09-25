package com.xgb.org.domain;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Art {

	private String id;//id
	
	private String title;//标题
	
	private String image;//图片
	
	private String descM;//描述
	
	private String content;//内容
	
	private String typese;//类型
	
	private List<Label> labels;//标签
	
	private Integer isResouce;//是否包含资源
	
	private String url;//资源下载路径
	
	
	private String createTime;//创建时间
	
	private String updateTime;//修改时间
	
	private int views;//浏览量
	
	private int statuses;//状态
	
	private String adminId;//作者id

	private Admin admin;//作者

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescM() {
		return descM;
	}

	public void setDescM(String descM) {
		this.descM = descM;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTypese() {
		return typese;
	}

	public void setTypese(String typese) {
		this.typese = typese;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public Integer getIsResouce() {
		return isResouce;
	}

	public void setIsResouce(Integer isResouce) {
		this.isResouce = isResouce;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
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

	public Art() {
		super();
	}

	public Art(String id, String title, String image, String descM, String content, String typese, List<Label> labels,
			Integer isResouce, String url, String createTime, String updateTime, int views, int statuses,
			String adminId) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.descM = descM;
		this.content = content;
		this.typese = typese;
		this.labels = labels;
		this.isResouce = isResouce;
		this.url = url;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.views = views;
		this.statuses = statuses;
		this.adminId = adminId;
	}

	public Art(String id, String title, String image, String descM, String content, String typese, List<Label> labels,
			Integer isResouce, String url, String createTime, String updateTime, int views, int statuses,
			String adminId, Admin admin) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.descM = descM;
		this.content = content;
		this.typese = typese;
		this.labels = labels;
		this.isResouce = isResouce;
		this.url = url;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.views = views;
		this.statuses = statuses;
		this.adminId = adminId;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Art [id=" + id + ", title=" + title + ", image=" + image + ", descM=" + descM + ", content=" + content
				+ ", typese=" + typese + ", labels=" + labels + ", isResouce=" + isResouce + ", url=" + url
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", views=" + views + ", statuses="
				+ statuses + ", adminId=" + adminId + ", admin=" + admin + "]";
	}
	
	
}
