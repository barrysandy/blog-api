package com.xgb.org.vo;

import org.springframework.stereotype.Component;

@Component
public class VResource {

	private String id;//id
	
	private String title;//标题
	
	private String url;//访问地址
	
	private String image;//图片
	
	private String descM;//描述
	
	private String typese;//类型
	
	private int views;//浏览量

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getTypese() {
		return typese;
	}

	public void setTypese(String typese) {
		this.typese = typese;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public VResource() {
		super();
	}

	public VResource(String id, String title, String url, String image, String descM, String typese, int views) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.image = image;
		this.descM = descM;
		this.typese = typese;
		this.views = views;
	}

	@Override
	public String toString() {
		return "VResource [id=" + id + ", title=" + title + ", url=" + url + ", image=" + image + ", descM=" + descM
				+ ", typese=" + typese + ", views=" + views + "]";
	}
	
	
	
}
