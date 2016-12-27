package in.pacifico.controller;

import in.pacifico.model.Model;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/login.validate")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int loginId = Integer.parseInt(request.getParameter("RegNo")) ;
		String password = request.getParameter("Password") ;
		
		int login = 0 ;
		String pass = "" ;
		
		
		
		Model model  = new Model();
		ResultSet rs = null ;
		
		rs = model.ValidLogin(loginId, password);
		
		try {
			while(rs.next())
			{
				login = rs.getInt("LoginId");
				pass = rs.getString("Password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(loginId == login && password.equals(pass))
		{
			ResultSet studentRs = model.FetchStudentDetails(loginId);
			
			
			request.setAttribute("student", student);
		}
		
		
		
		
	}

}
