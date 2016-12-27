package in.pacifico.dao;

import java.sql.* ;

public class DBConnector {

public static Connection con ;
	
	
	public static Connection getMysqlConnection()
	{
		 String DRIVER = "com.mysql.jdbc.Driver";
		 String DBURL = "jdbc:mysql://localhost:3306/college" ;
		 String DBUSER = "root";
		 String DBPASSWORD = "";
		try 
		{
			Class.forName(DRIVER);                     
			con =DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return con ;
		
		
	}
	
	
}
