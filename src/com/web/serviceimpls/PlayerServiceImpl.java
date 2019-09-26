package com.web.serviceimpls;

import java.util.List;

import com.web.daoimpls.PlayerDaoImpl;
import com.web.daos.PlayerDao;
import com.web.domains.PlayerBean;
import com.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	//singleton
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	public static PlayerServiceImpl getInstance() {return instance;}
	private PlayerServiceImpl() {}
	
	public PlayerBean login(PlayerBean param) {
		System.out.println("6.playerServiceImpl의 login()으로 이동");
		System.out.println(String.format("param값 출력:%s, %s", 
				param.getPlayerId(),
				param.getSolar()));
		return PlayerDaoImpl.getInstance().selectByplayerIdSolar(param);
	}
		
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
