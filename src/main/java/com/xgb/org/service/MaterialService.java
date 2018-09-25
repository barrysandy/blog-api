package com.xgb.org.service;


import java.util.List;

import com.xgb.org.domain.Material;

public interface MaterialService {

	int saveService(Material bean) throws Exception;
	
	int updateService(Material bean) throws Exception;
	
	int deleteByIdService(String url) throws Exception;
	
	int deleteByMaterialIdService(String materialId) throws Exception;
	
	Material getBeanByIdService(String id) throws Exception;
	
	Material getBeanByUrlService(String url) throws Exception;
	
	Material getBeanByMaterialIdService(String materialId) throws Exception;
	
	List<Material> getListService(int index,int pageSize,String type,String search) throws Exception;
	
	int getCountService(String type,String search) throws Exception;
	
	Integer getMaxMaterialIdService() throws Exception;
}
