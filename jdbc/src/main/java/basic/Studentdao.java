package basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Studentdao {

	public void savestudent(Student s) {
		try {
			//connection established
			Connection con=dbconnect.createconnection();
			//QUERY
			String sql="INSERT INTO monitor(id, name,email) values(?,?,?)";
			//Statement
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1,s.getId());
			stm.setString(2,s.getName());
			stm.setString(3,s.getEmail());
			//Execution
			stm.executeUpdate();
			System.out.println("DATA INSERTION IS SUCCESSFULL");
			
		}catch(Exception e) {
			System.out.println("DATA INSERTION IS FAILED"+e.getMessage());
		}
		}
	
	
	public void updatestudent(Student s) {
		try {
			//connection established
			Connection con=dbconnect.createconnection();
			//QUERY
			String sql="UPDATE MONITOR SET NAME=? WHERE ID=?";
			//Statement
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1,s.getName());
			stm.setInt(2,s.getId());
			//Execution
			stm.executeUpdate();
			System.out.println("DATA UPDATION IS SUCCESSFULL");
			
		}catch(Exception e) {
			System.out.println("DATA UPDATION IS FAILED"+e.getMessage());
		}
	}
	
	public void deletestudent(int id) {
		try {
		//connection established
		Connection con=dbconnect.createconnection();
		//QUERY
		String sql="DELETE FROM MONITOR WHERE ID=?";
		//Statement
		PreparedStatement stm = con.prepareStatement(sql);
		stm.setInt(1,id);
		//Execution
		stm.executeUpdate();
		System.out.println("DATA DELETED IS SUCCESSFULL");
		}catch(Exception e) {
			System.out.println("DATA WASN'T DELETED"+e.getMessage());
		}
	}
	
	public void getallstudent() {
		try {
			//connection established
			Connection con=dbconnect.createconnection();
			//QUERY
			String sql="SELECT * FROM MONITOR";
			//Statement
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("email"));
			}
		}catch(Exception e) {
			System.out.println("NOT SUCCESSFULLY EXECUTED"+e.getMessage());
		}
	}
}
