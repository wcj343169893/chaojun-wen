/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  登录Servlet。简单演示了一个用户名和密码验证的过程。本事例中并未使用数据库。
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录Servlet。简单演示了一个用户名和密码验证的过程。本事例中并未使用数据库。
 * 
 * 
 * @author 杨砚
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * （重写方法） 直接调用doPost()方法
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 直接调用doPost()方法，这样可以避免代码冗余
		this.doPost(request, response);
	}

	/**
	 * （重写方法） 判断用户名和密码是否分别为张三和123456。如果验证通过，跳转到welcome.jsp，<br>
	 * 如果未通过跳转到login.jsp。请注意两个跳转使用的是不同的方式。<br>
	 * 另外在方法一开始就将request和response的字符集设置成了UTF-8，但要想是用这种方式<br>
	 * 避免乱码问题，还必须在页面上使用post方式提交过来才可以。
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		// 从request中获取表单提交内容：username、userpass。
		String uname = request.getParameter("username");
		String upass = request.getParameter("userpass");
		// 通过request获取session。在servlet中这是最常用的获取session的方式
		HttpSession session = request.getSession();
		if ("张三".equals(uname) && "123456".equals(upass)) {
			// 这里应用了一个对象来存放表单提交过来的值
			UserModel user = new UserModel();
			user.setUname(uname);
			user.setUpass(upass);
			// 登录成功后，将存放用户名和密码的对象保存到session中
			// 这里注意观察welcome.jsp页面上是怎么用EL表达式表示值的
			session.setAttribute("login", user);
			// 使用forward方式跳转到welcome.jsp，该跳转方式是服务器代理跳转，客户端浏览器地址不会发生变化
			// 另外客户端请求时提交的表单值也不会丢失。
			request.getRequestDispatcher("welcome.jsp").forward(request,
					response);
		} else {
			// 将错误信息设置到session属性中
			session.setAttribute("error", "*用户名或密码错误");
			// 通过sendRedirect方式跳转到login.jsp页面，该跳转方式相当于客户端重新提交了一次请求到服务器，
			// 客户端浏览器地址将发生改变，另外客户端上次请求的表单值将丢失
			response.sendRedirect("login.jsp");
		}
	}

}
