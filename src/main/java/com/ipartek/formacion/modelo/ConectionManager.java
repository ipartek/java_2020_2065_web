package com.ipartek.formacion.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionManager {

	private static final String PATH = "ddbb/perrera.db";
	
	static public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		return DriverManager.getConnection("jdbc:sqlite:" + PATH);		
		
	}
}
