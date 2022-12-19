package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import mode.User;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewServlet() {
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
		String uname = request.getParameter("uname");
		String psw = request.getParameter("pswd");
		String npsw = request.getParameter("npswd");

		UserDao cdao = new UserDao();
		User c = new User();
		c.setUsername(uname);
		c.setPassword(psw);
		c.setNewpassword(npsw);

		boolean result = cdao.changeUser(c); // Add mật khẩu mới
		PrintWriter pw = response.getWriter();

		// Nếu nhập đúng thì hiện thông báo thành công và chuyển đến trang login.html
		if (result) {
			pw.println("<h3> Mật khẩu của bạn đã thay đổi thành công!. ");
			pw.println(" </h3>");
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);

		// Nếu nhập sai thì hiện thông báo ko thành công và giữ nguyên ở trang change.html
		} else {
			pw.println("<h3> Thay đổi mật khẩu không thành công. ");
			pw.println("</h3>");

			RequestDispatcher dis = request.getRequestDispatcher("change.html");
			dis.include(request, response);
		}
	}
}
