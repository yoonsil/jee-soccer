package com.web.enums;

public enum URL {
	ORACLE_URL,
	MARIADB_URL,
	H2_URL,
	DB2_URL,
	MYSQL_URL;
	
	@Override
	public String toString() {
		String url ="";
		switch (this) {
		case ORACLE_URL:
			url="jdbc:oracle:thin:@localhost:1521:XE";
			break;
		case MARIADB_URL:
			url="jdbc:mysql://localhost:3306";
			break;
		case H2_URL:
			url="";
			break;
		case DB2_URL:
			url="";
			break;
		case MYSQL_URL:
			url="";
			break;

		default:
			break;
		}
		return super.toString();
	}
}
