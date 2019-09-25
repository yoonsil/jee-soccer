package com.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.web.enums.DBDriver;
import com.web.enums.URL;
import com.web.pool.Constants;

public class Mariadb implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.MARIADB_DRIVER.toString());
			conn = DriverManager.getConnection(
					URL.MARIADB_URL.toString(),
					Constants.USERNAME,
					Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
