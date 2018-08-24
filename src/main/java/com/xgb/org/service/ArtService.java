package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.Art;

public interface ArtService {

	int saveService(Art bean,String diskPath) throws Exception;
	
	int updateService(Art bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	Art getBeanByIdService(String id) throws Exception;
	
	List<Art> getListService(int index,int pageSize,String search) throws Exception;
	
	int getCountService(String search) throws Exception;
}
