package com.web.daos;

import java.util.List;

import com.web.domains.PlayerBean;

public interface PlayerDao {
	//0.join
	public boolean insertPlayer(PlayerBean param);
	//1.login
	public PlayerBean selectByplayerIdSolar(PlayerBean param);
	//2.position
	public List<String> selectPositions();
	//4. 수원팀 (id:k02) 골키퍼
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param);
	//5. 팀 id, 키, 플레이어네임
	public List<PlayerBean> selectByheightName(PlayerBean param);
	//테스트
	public List<PlayerBean> selectByMany(PlayerBean param);
	
}
