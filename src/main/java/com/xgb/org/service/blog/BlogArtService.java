package com.xgb.org.service.blog;

import java.util.List;

import com.xgb.org.domain.Art;

public interface BlogArtService {

	Art getBeanByIdService(String id) throws Exception;
	
	List<Art> getListService(int index,int pageSize,String search,String typese,int sort) throws Exception;
	
	int getCountService(String search,String typese) throws Exception;
	
	List<Art> getListByLabelService(int index,int pageSize,String typese,int sort,String lid) throws Exception;
	
	int getCountByLabelService(String typese,String lid) throws Exception;
	
	int updateViewsService(String id,int views,int viewsNew) throws Exception;
	
	Art getThePreviousBeanService(String time) throws Exception;
	
	Art getTheNextBeanService(String time) throws Exception;
	
}
