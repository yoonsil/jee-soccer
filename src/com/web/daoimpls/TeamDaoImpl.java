package com.web.daoimpls;

import com.web.daos.TeamDao;

public class TeamDaoImpl implements TeamDao{
	private static TeamDaoImpl instance = new TeamDaoImpl();

	public static TeamDaoImpl getInstance() {
		return instance;
	}
	private TeamDaoImpl() {}
}
