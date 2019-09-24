package com.web.factory;

import java.io.Serializable;
import java.sql.Connection;

public interface Database{
	public Connection getConnection();
}
