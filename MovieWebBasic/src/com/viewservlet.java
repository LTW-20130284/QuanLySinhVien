package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfileDao;
import mode.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewservlet
 */
@WebServlet("/viewservlet")
public class viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public viewservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		out.print("<table border='1' width='100%' ");
		out.print(
				"<tr><th><a href='index.jsp'>Trang chủ</a></th><th><a href='Index.html'>Thêm thông tin</a></th><th><a href='change.html'>Đổi mật khẩu</a></th>");
		out.print("</table>");
		out.println("<center>");
		out.println("<h1>Thông tin tài khoảng</h1>");
		out.println("</center>");
		List<Emp> list = ProfileDao.getAllEmployees();
		out.print("<table border='1' width='100%' ");
		out.print("<tr><th>Tên</th><th>Email</th><th>Cập nhật</th><th>Xóa</th></tr>");

		for (Emp e : list) {
			out.print("<tr><td>" + e.getName() + "</td><td>" + e.getDept() + "</td><td><a href='updateservlet?id="
					+ e.getId() + "'>Cập nhật</a></td>  <td><a href='deleteservlet?id=" + e.getId()
					+ "'>Xóa</a></td></tr>");
		}
		out.print("</table>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
