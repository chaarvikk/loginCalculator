package Edureka1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BasicLogin extends HttpServlet 
{
	protected void doPost (HttpServletRequest request , HttpServletResponse response) 
			throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher("Calc.html");
		{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String user=request.getParameter("UserName");
		String pass=request.getParameter("UserPassword");
		
		if(user.equals("edueka") && pass.equals("edureka"))

        rd.forward(request, response);
		
	//		pw.println("Login Success...!");
		else
			pw.println("Login Failed...!");
		
		pw.close();
		}
		
	}
	
}

