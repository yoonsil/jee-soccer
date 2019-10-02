package com.web.services;

import java.util.List;

import com.web.domains.PlayerBean;

public interface PlayerService {
	//1.login
	public PlayerBean login(PlayerBean param);
	//2. 포지션 종류
	public List<String> findPositions();
	//4. 수원팀 (id:k02) 골키퍼
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param);
	//5. 팀 id, 키, 플레이어네임
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param);
	//6
	public boolean join(PlayerBean param);
}
