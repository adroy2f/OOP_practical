package utilities;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBaseUtility {
	public static Connection connect(String url)
	{
		Connection conn =null;
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Connection established");
		} catch(SQLException e){
			System.out.println("Error1 "+e.getMessage());
		}
		return conn;
	}
	
	public static void getData(String url, String table)
	{	
		String sql = "SELECT * FROM "+table;
		try {
			Connection conn =connect(url); 
			
			if(conn != null)
			{;}} 
//		catch(SQLException e){
//				System.out.println("Error2 "+e.getMessage());
//				return;
//			}
//		
		finally {}
	}
	
	public static void storeData(String url, ArrayList<String> dates,String table)
	{
		String sql = "CREATE TABLE IF NOT EXISTS \""+table+"\" (\"srNo\" INTEGER, \"dob\" TEXT NOT NULL,PRIMARY KEY(\"srNo\" AUTOINCREMENT));";
		try {
			Connection conn =connect(url); 
			
			if(conn != null)
            {	
				Statement stmt = conn.createStatement();
            	stmt.execute(sql); 
        		sql = "INSERT INTO "+table+"(srNo, dob) VALUES(?,?)"; 
        		for(String date: dates )
        		{
        			try {
        				 PreparedStatement pstmt = conn.prepareStatement(sql);  
        		            //pstmt.setInt(1, i);  
        		            pstmt.setString(2, date);  
        		            pstmt.executeUpdate(); 
        			}catch(SQLException e){
        				System.out.println("Error3 "+e.getMessage());
        				
        				return;
        			}
        			
        		}
            }
		} catch(SQLException e){
			System.out.println("Error2 "+e.getMessage());
			return;
		}
		
		}
		
	
}
