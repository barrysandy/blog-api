package com.xgb.org.domain;

import org.springframework.stereotype.Component;

@Component
public class Material {

	private String id;//id
	
	private String name;//名称
	
	private String url;//访问地址
	
	private String diskPath;//磁盘地址
	
	private String type;//类型 由工具类验证类型
	
	private int status;//状态 0 未确认 1使用 -1待删除
	
	private String createTime;//创建时间
	
	private String updateTime;//修改时间

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

	public String getDiskPath() {
		return diskPath;
	}

	public void setDiskPath(String diskPath) {
		this.diskPath = diskPath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public Material() {
		super();
	}

	public Material(String id, String name, String url, String diskPath, String type, int status, String createTime,
			String updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.diskPath = diskPath;
		this.type = type;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", name=" + name + ", url=" + url + ", diskPath=" + diskPath + ", type=" + type
				+ ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}


	
}
