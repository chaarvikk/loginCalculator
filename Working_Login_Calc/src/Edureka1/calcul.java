package Edureka1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class calcul extends HttpServlet
{
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        int a1= Integer.parseInt(request.getParameter("n1"));
        int a2= Integer.parseInt(request.getParameter("n2"));
        
        String mt= request.getParameter("math");
         
        
        if(mt.equals("add"))
        {
            out.println("<h1>Addition</h1>"+(a1+a2));
        }
        
        if(mt.equals("sub"))
        	        {
            out.println("<h1>Substraction</h1>"+(a1-a2));
        }
        if(mt.equals("mul"))
        	         {
            out.println("<h1>Multiplication</h1>"+(a1*a2));
        }
        if(mt.equals("div"))
        	         {
            out.println("<h1>Division</h1>"+(a1/a2));
        }
        out.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
