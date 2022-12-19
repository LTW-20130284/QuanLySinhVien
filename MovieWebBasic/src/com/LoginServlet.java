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

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
		String username = request.getParameter("uname");
		String password = request.getParameter("pswd");
		UserDao l = new UserDao();
		PrintWriter pw = response.getWriter();

		// Nếu tài khoảng nhập đúng sẽ chuyên đến trang index.jsp
		if (l.validateUser(username, password)) {

			RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
			dis.forward(request, response);
			// Nếu sai sẽ hiên thông báo và ở lại trang login.html
		} else {

			pw.println("<h1>Tên đăng nhập hoặc mật khẩu không đúng!</h1>");
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);
		}

	}

}
