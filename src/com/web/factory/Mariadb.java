package com.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.web.pool.Constants;

public class Mariadb implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constants.MARIADB_DRIVER);
			conn = DriverManager.getConnection(
					Constants.MARIADB_URL,
					Constants.USERNAME,
					Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
