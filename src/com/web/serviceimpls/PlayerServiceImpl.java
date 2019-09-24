package com.web.serviceimpls;

import java.util.List;

import com.web.daoimpls.PlayerDaoImpl;
import com.web.daos.PlayerDao;
import com.web.domains.PlayerBean;
import com.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	//singleton
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {}
	//-------------------------------------
	public List<String> findPositions() {
		return PlayerDaoImpl.getInstance().selectPositions();
	}
	public List<PlayerBean> searchByteamId(PlayerBean param) {
		return PlayerDaoImpl.getInstance().selectByteamId(param);
	}
	public List<PlayerBean> searchByheightName(PlayerBean param) {
		return PlayerDaoImpl.getInstance().selectByheightName(param);
	}

}
