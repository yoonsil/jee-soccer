package com.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.web.enums.DBDriver;
import com.web.enums.URL;
import com.web.pool.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(
					URL.ORACLE_URL.toString(),
					Constants.USERNAME,
					Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
