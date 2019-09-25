package com.web.enums;

public enum DBDriver {
	ORACLE_DRIVER,
	MYSQL_DRIVER,
	MARIADB_DRIVER,
	H2_DRIVER,
	DB2_DRIVER;
	
	@Override
	public String toString() {
		String driver ="";
		switch (this) {
		case ORACLE_DRIVER:
			driver ="oracle.jdbc.OracleDriver";
			break;
		case MARIADB_DRIVER:
			driver ="org.mariadb.jdbc.Driver";
			break;
		case MYSQL_DRIVER:
			driver="";
			break;
		case H2_DRIVER :
			driver ="";
			break;
		case DB2_DRIVER :
			driver ="";
			break;
		default:
			break;
		}
		return driver;
	}
	
}
