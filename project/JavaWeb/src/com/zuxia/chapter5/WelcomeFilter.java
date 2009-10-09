/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  事例过滤器。
 *  用于演示限制未登录用户访问只有登录用户才能访问的welcome.jsp页面。
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用于演示限制未登录用户访问只有登录用户才能访问的welcome.jsp页面。
 * 
 * 
 * @author 杨砚
 */
public class WelcomeFilter implements Filter {

	/**
	 * 用于存放初始化参数的类成员变量
	 * 
	 */
	private FilterConfig config;

	/**
	 * （重写方法）<br>
	 * 销毁方法。<br>
	 * 该方法将在servletContext被销毁时调用
	 * 
	 * 
	 */
	public void destroy() {
		this.config = null;
	}

	/**
	 * （重写方法）<br>
	 * 过滤器主方法。<br>
	 * 实现限制未登录用户访问只有登录用户才能访问的welcome.jsp页面。<br>
	 * 
	 * 
	 * @param request
	 * @param response
	 * @param chain
	 * @throws IOException
	 * @throws ServletException
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 演示获取初始化参数
		String yoyoInit = this.config.getInitParameter("yoyoInit");
		System.out.println(yoyoInit);
		// 将ServletRequest转换成HttpServletRequest以便获取session
		HttpServletRequest req = (HttpServletRequest) request;
		// 获取session
		HttpSession session = req.getSession();
		// 从session中获取存放用户名和用户密码的javaBean对象
		UserModel userModel = (UserModel) session.getAttribute("login");
		// 如果没有获取到对象，说明用户没有登录，这时跳转到login.jsp页面
		if (userModel == null) {
			session.setAttribute("error", "*您没有登录请先登录！");
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}
		// 调用下一个过滤器,通过这种方式可以实现过滤器链
		chain.doFilter(request, response);
	}

	/**
	 * （重写方法）<br>
	 * 该方法将在servlet容器初始化的时候被调用<br>
	 * 
	 * 
	 * @param fConfig
	 * @throws ServletException
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 将用于存放初始化变量的对象赋予类成员变量
		this.config = fConfig;
	}

}
