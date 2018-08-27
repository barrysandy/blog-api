package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.SystemMeun;

public interface SystemMeunService {

	int saveService(SystemMeun bean) throws Exception;
	
	int updateService(SystemMeun bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	SystemMeun getBeanByIdService(String id) throws Exception;
	
	List<SystemMeun> getListService(int index,int pageSize,String search) throws Exception;
	
	List<SystemMeun> getMenuTreeService() throws Exception;
	
	int getCountService(String search) throws Exception;
}
