package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addservlet
 */
@WebServlet("/addservlet")
public class addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		processRequest(request, response);
		try {
			PrintWriter out = response.getWriter();
			String eid = request.getParameter("id");
			int id = Integer.parseInt(eid);
			String ename = request.getParameter("name");
			String dept = request.getParameter("dept");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "123456");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("insert into emp2 values (" + id + ",'" + ename + "', '" + dept + "')");
				out.println("<h1>Thêm thông tin thành công!</h1>");
				String sql = "select * from emp2";
				ResultSet rs = stmt.executeQuery(sql);
				out.println("<form action = 'viewservlet' method='post'>");
				out.print("<tr><a href ='viewservlet'>View Employee</a></td></tr>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</form>");
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException se) {
				throw new RuntimeException("Cannot Connect the Database!", se);
			}
		} catch (ClassNotFoundException cnfe) {
		}
	}

}
