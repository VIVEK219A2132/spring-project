package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	
	
	public static Connection createconnection () {
		 Connection con = null;
		try {
			//load driver
			Class.forName("org.postgresql.Driver");
			//db info
			String uri="jdbc:postgresql://localhost:5432/vivek";
			String user="postgres";
			String password="amma@123";
			con=DriverManager.getConnection(uri, user, password);
			System.out.println("Connection Successfull");
			return con;
		}catch(Exception e1) {
			
			System.out.println("Connection Failed"+e1.getMessage());
			return con;
		}
		}
	}
	


