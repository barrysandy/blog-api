package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.Label;

public interface LabelService {

	int saveService(Label bean) throws Exception;
	
	int updateService(Label bean) throws Exception;
	
	int deleteByIdService(String id) throws Exception;
	
	Label getBeanByIdService(String id) throws Exception;
	
	List<Label> getListService(int index,int pageSize,String search) throws Exception;
	
	List<Label> getListAll() throws Exception;
	
	List<Label> getListByArtId(String artId) throws Exception;
	
	int getCountService(String search) throws Exception;
	
	int existenceData(String lid,String aid) throws Exception;
	
	
	int saveArtLabelService(String id,String aid,String lid) throws Exception;
	
	
	int deleteByArtIdService(String aid) throws Exception;
	
}
