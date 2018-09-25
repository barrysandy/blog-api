package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.SystemUpdateLog;

public interface SystemUpdateLogService {

	int saveService(SystemUpdateLog bean) throws Exception;
	
	int updateService(SystemUpdateLog bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	SystemUpdateLog getBeanByIdService(String id) throws Exception;
	
	List<SystemUpdateLog> getListService(int index,int pageSize) throws Exception;
	
	int getCountService() throws Exception;
}
