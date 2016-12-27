package in.pacifico.model;

import java.sql.*;

import in.pacifico.dao.Dao;
import in.pacifico.bean.*;

public class Model {
	
	private Dao dao = new Dao();
	private ResultSet rs ;
	
	public ResultSet ValidLogin(int loginId, String password)
	{
		Login login = new Login(loginId, password);
		
		rs = dao.ValidLogin(login);
		
		return rs ;
		
	}
	
	public ResultSet FetchStudentDetails(int studentId)
	{
		
		rs = dao.FetchStudentDetails(studentId);
		
		return rs ;
	}

}
