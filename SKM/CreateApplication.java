package in.pacifico.controller;

import in.pacifico.bean.*;
import in.pacifico.model.Model;

import java.io.IOException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateApplication
 */
@WebServlet("/application.create")
public class CreateApplication extends HttpServlet {
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
		
		Student student = (Student)request.getAttribute("student");
		int applicationId, studentId;
		double percentage;
		String roomno="";
		
		Model model  = new Model();
		boolean flag;
		flag = model.Ifappexists(student);
		String message="";
		
		if(flag==true)
		{
			message = "Already registered";
			ResultSet rs = model.FetchApplicationDetails(student);
			try {
				while(rs.next())
				{
					applicationId=rs.getInt(1);
				
					request.setAttribute("applicationid", applicationId);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("message",message);
			
			
			
			
			
		}
		else{
			
			DateFormat dateFormat = new SimpleDateFormat("mmssSS");
			Date date =  new Date() ;
			
			
			String str = dateFormat.format(date) ;
		    str = str + student.getStudentId() ;
			applicationId=Integer.parseInt(str);
			
			studentId=student.getStudentId();
			percentage=student.getPercentage();
			
			
			Application application = new Application(applicationId,studentId,percentage,roomno);
			request.setAttribute("applicationid", applicationId);
			message = "Your application have been registered successfully";
			request.setAttribute("message",message);
			
			
			
			   
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("applicationoutput.jsp");
		rd.forward(request, response);
		
		
	}

}
