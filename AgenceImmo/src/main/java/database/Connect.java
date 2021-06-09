package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost/";
		String dbName="AgenceImmo";
		String user="root";
		String mdp="";
		
Connection connect = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connect = DriverManager.getConnection(url+dbName,user,mdp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connect;
	}

}
