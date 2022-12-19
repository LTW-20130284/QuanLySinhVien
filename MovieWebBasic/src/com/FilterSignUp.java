package com;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import dao.UserDao;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/MyServlet")
public class FilterSignUp implements javax.servlet.Filter {

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String uname = request.getParameter("uname");
		String psw = request.getParameter("pswd");
		UserDao l = new UserDao();
		RequestDispatcher dispatcher=request.getRequestDispatcher("sign_up_form.html");
		if(uname.equals(" ") || psw.equals(" ")   || uname.equals(null) || psw.equals(null)  )
		{
			
			dispatcher.include(request, response);
		}
		else{
			chain.doFilter(request, response);
		}

	}

	/**
	 * @see FilterSignUp#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
