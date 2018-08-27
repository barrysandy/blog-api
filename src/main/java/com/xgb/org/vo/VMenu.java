package com.xgb.org.vo;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class VMenu{
	
	private String text;//名称
	
	private String href;//排序

	private String tags;//选中状态 0 未选中 1选中

	private List<VMenu> nodes;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<VMenu> getNodes() {
		return nodes;
	}

	public void setNodes(List<VMenu> nodes) {
		this.nodes = nodes;
	}

	public VMenu() {
		super();
	}
	
	

	public VMenu(String text, String href, String tags) {
		super();
		this.text = text;
		this.href = href;
		this.tags = tags;
	}

	public VMenu(String text, String href, String tags, List<VMenu> nodes) {
		super();
		this.text = text;
		this.href = href;
		this.tags = tags;
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "VMenu [text=" + text + ", href=" + href + ", tags=" + tags + ", nodes=" + nodes + "]";
	}

	
}
