package in.pacifico.dao;

import in.pacifico.bean.*;
import in.pacifico.dao.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	private Connection con = DBConnector.getMysqlConnection() ;;
	private PreparedStatement ps ;
	private ResultSet rs ;
	
	
	public boolean CrateApplication(Student student)
	{
		boolean  flag = false ;
        int temp = -999 ;
		
		try {
			ps = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?)") ;
			
			
			
			
			temp = ps.executeUpdate() ;
			
			if(temp > 0)
			{	
				flag = true ;
				con.commit();
			}
			else
			{
				con.rollback();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return flag ;
	}
	
	
	public ResultSet ValidLogin(Login login)
	{
	//	boolean  flag = false ;
    //    int temp = -999 ;
		
		try {
			ps = con.prepareStatement("SELECT * FROM login where LoginId = ?") ;
			
			ps.setInt(1, login.getLoginId());
			
			rs = ps.executeQuery();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs ;
	}
	
	
	
	public ResultSet FetchStudentDetails(int studentId)
	{
		try {
			ps = con.prepareStatement("SELECT * FROM student where StudentId = ?") ;
			
			ps.setInt(1, studentId);
			
		    rs = ps.executeQuery() ;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs ;
	}

}
