package com.xgb.org.service;

import java.util.List;

import com.xgb.org.vo.VResource;

public interface VResourceService {

	List<VResource> getListService(int index,int pageSize,String search) throws Exception;
	
}
