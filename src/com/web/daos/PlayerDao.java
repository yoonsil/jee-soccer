package com.web.daos;

import java.util.List;

import com.web.domains.PlayerBean;

public interface PlayerDao {
	public List<String> selectPositions();
	//4. 수원팀 (id:k02) 골키퍼
	public List<PlayerBean> selectByteamId(PlayerBean param);
	//5. 팀 id, 키, 플레이어네임
	public List<PlayerBean> selectByheightName(PlayerBean param);
	
}
