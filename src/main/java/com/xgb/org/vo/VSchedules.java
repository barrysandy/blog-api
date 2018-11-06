package com.xgb.org.vo;
import java.util.List;

import org.springframework.stereotype.Component;

import com.xgb.org.domain.Schedules;

@Component
public class VSchedules{
	
	private int day;
	
	private List<Schedules> schedules;
	
	private int total;
	
	private int totalMonth;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public List<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedules> schedules) {
		this.schedules = schedules;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalMonth() {
		return totalMonth;
	}

	public void setTotalMonth(int totalMonth) {
		this.totalMonth = totalMonth;
	}

	public VSchedules() {
		super();
	}

	public VSchedules(int day, List<Schedules> schedules, int total, int totalMonth) {
		super();
		this.day = day;
		this.schedules = schedules;
		this.total = total;
		this.totalMonth = totalMonth;
	}

	@Override
	public String toString() {
		return "VSchedules [day=" + day + ", schedules=" + schedules + ", total=" + total + ", totalMonth=" + totalMonth
				+ "]";
	}
	
	
}
