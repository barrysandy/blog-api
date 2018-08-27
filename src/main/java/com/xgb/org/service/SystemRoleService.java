package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.SystemRole;

public interface SystemRoleService {

	int saveService(SystemRole bean) throws Exception;
	
	int updateService(SystemRole bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	SystemRole getBeanByIdService(String id) throws Exception;
	
	List<SystemRole> getListService(int index,int pageSize,String search) throws Exception;
	
	int getCountService(String search) throws Exception;
}
