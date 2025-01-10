package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	protected Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/studentservice"; 
	private String dbuser = "root"; 
	private String dbpwd = "1234"; 
//	+ 싱글톤
	public Dao()  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch(Exception e) {
			System.out.println("[DB 연동 실패]" + e);
		}
	}
}
