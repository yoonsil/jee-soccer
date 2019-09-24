package com.web.factory;
import com.web.pool.Constants;
public class DatabaseFactory {
	public static Database createDatabase(String vendor){
		 Database db = null;
		 switch (vendor) {
		case "oracle": db = new Oracle(); break;
		case "mariadb":db = new Mariadb();break;
		case "mysql": break;
		case "h2": break;
		case "db2": break;
		default: break;
		}
		 return db;
	 }
}
