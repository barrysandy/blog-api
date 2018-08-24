package com.xgb.org.service;


import com.xgb.org.domain.Material;

public interface MaterialService {

	int saveService(Material bean) throws Exception;
	
	int updateService(Material bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	Material getBeanByIdService(String id) throws Exception;
	
	Material getBeanByUrlService(String url) throws Exception;
	
}
