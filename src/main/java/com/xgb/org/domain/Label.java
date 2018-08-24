package com.xgb.org.domain;
import org.springframework.stereotype.Component;

@Component
public class Label {

	private String id;//id
	
	private String name;//名称
	
	private int sort;//排序

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

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Label() {
		super();
	}

	public Label(String id, String name, int sort) {
		super();
		this.id = id;
		this.name = name;
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Label [id=" + id + ", name=" + name + ", sort=" + sort + "]";
	}
	
	
}
