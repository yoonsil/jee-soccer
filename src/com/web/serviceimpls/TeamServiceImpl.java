package com.web.serviceimpls;

import com.web.services.TeamService;

public class TeamServiceImpl implements TeamService{
	private static TeamServiceImpl instance = new TeamServiceImpl();
	public static TeamServiceImpl getInstance() {
		return instance;
	}
	private TeamServiceImpl() {}
}
