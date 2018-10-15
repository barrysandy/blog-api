package com.xgb.org.service;

import java.util.List;

import com.xgb.org.domain.Schedules;

public interface SchedulesService {

	int saveService(Schedules bean) throws Exception;
	
	int updateService(Schedules bean) throws Exception;
	
	int deleteByIdService(Integer id) throws Exception;
	
	Schedules getBeanByIdService(Integer id) throws Exception;
	
	/**
	 * 按照开始和结束时间以及类型查询排期集合
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @param typese 类型(非必须条件)
	 * @param adminId 管理员id
	 * @return 返回排期集合
	 * @throws Exception
	 */
	List<Schedules> getListService(String beginTime,String endTime,String typese,String adminId) throws Exception;
	
	/**
	 * 统计排期数量
	 * @param beginTime
	 * @param endTime
	 * @param typese
	 * @param adminId
	 * @return
	 * @throws Exception
	 */
	int getCountService(String beginTime,String endTime,String typese,String adminId) throws Exception;
}
