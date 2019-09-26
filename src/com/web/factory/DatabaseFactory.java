package com.web.factory;
import com.web.enums.DB;
public class DatabaseFactory {
	public static Database createDatabase(String vendor){
		 Database db = null;
		switch (DB.valueOf(vendor.toUpperCase())) {
		case ORACLE: db = new Oracle(); 
		System.out.println("---"+vendor);
		break;
		case MARIADB:db = new Mariadb();break;
		case MYSQL: break;
		case H2: break;
		case DB2: break;
		default: break;
		}
		 return db;
	 }
}
