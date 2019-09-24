package com.web.daoimpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.web.daos.PlayerDao;
import com.web.domains.PlayerBean;
import com.web.factory.DatabaseFactory;
import com.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao{
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	public static PlayerDaoImpl getInstance() {return instance;}
	private PlayerDaoImpl() {}
	//-----------------------------------------
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + 
					"FROM PLAYER";
			ResultSet rs = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql)
					.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}
	//-----------------------------------------
	public List<PlayerBean> selectByteamId(PlayerBean param) {

		return null;
	}
	//-----------------------------------------
	public List<PlayerBean> selectByheightName(PlayerBean param) {
		
		return null;
	}
}
