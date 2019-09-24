package com.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.web.pool.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USERNAME,
					Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
