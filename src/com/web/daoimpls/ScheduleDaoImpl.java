package com.web.daoimpls;

import com.web.daos.ScheduleDao;

public class ScheduleDaoImpl implements ScheduleDao{
	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();
	public static ScheduleDaoImpl getInstance() {
		return instance;
	}
	private ScheduleDaoImpl() {}
}
