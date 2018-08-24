package com.xgb.org.vo;
import org.springframework.stereotype.Component;

import com.xgb.org.domain.Label;

@Component
public class VLabel extends Label{
	
	private String id;//id
	
	private String name;//名称
	
	private int sort;//排序

	private int selectOn;//选中状态 0 未选中 1选中

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

	public int getSelectOn() {
		return selectOn;
	}

	public void setSelectOn(int selectOn) {
		this.selectOn = selectOn;
	}

	public VLabel() {
		super();
	}

	public VLabel(String id, String name, int sort, int selectOn) {
		super();
		this.id = id;
		this.name = name;
		this.sort = sort;
		this.selectOn = selectOn;
	}

	@Override
	public String toString() {
		return "VLabel [id=" + id + ", name=" + name + ", sort=" + sort + ", selectOn=" + selectOn + "]";
	}

	
	
}
