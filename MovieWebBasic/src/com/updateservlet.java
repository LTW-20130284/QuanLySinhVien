package com;

import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import dao.ProfileDao;
import mode.Emp;  
@WebServlet("/updateservlet")  
public class updateservlet extends HttpServlet { 
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {  
    	response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
    	out.print("<table border='1' width='100%' ");
		out.print(
				"<tr><th><a href='index.jsp'>Trang chủ</a></th><th><a href='viewservlet'>Profile</a></th>");
		out.print("</table>");
        out.println("<center>");
        out.println("<h1>Cập nhật thông tin</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        
        Emp e = ProfileDao.getEmployeeById(id);  
       
        out.print("<form action='updateservlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>Tên:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='text' name='dept' value='"+e.getDept()+"'/> </td></tr>");  
        
        out.print("<tr><td colspan='2'><input type='submit' value='Cập nhật '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");
        out.println("</center>");
          
        out.close();  
    }  
}  