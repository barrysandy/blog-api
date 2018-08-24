package com.xgb.org.service.blog;

import java.util.List;

import com.xgb.org.domain.Label;

public interface BlogLabelService {

	Label getBeanByIdService(String id) throws Exception;
	
	List<Label> getListService(String artId) throws Exception;
	
	List<Label> getCloudLabels();
}
