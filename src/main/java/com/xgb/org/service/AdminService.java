package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.Admin;

public interface AdminService {

	int saveService(Admin bean) throws Exception;
	
	int updateService(Admin bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	Admin getBeanByIdService(String id) throws Exception;
	
	Admin getBeanByNameAndPassword(String name,String password) throws Exception;
	
	List<Admin> getListService(int index,int pageSize,String search) throws Exception;
	
	int getCountService(String search) throws Exception;
}
