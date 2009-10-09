/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  示例Servlet。用于演示Servlet
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DemoServlet概要说明
 * 
 * 
 * @author 杨砚
 */
public class DemoServlet extends HttpServlet {

	/**
	 * 用于序列化时使用的ID
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * （重写方法） doGet方法,当表单提交的时候，form标签里method属性设置为get时，将调用此方法;
	 * 	演示servlet初始化参数及servlet中的路径
	 * 
	 * 
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(this.getServletConfig().getServletContext()
				.getAttribute("yoyoServletContextInit"));
		System.out.println(this.getInitParameter("demoServletInit"));
		
		System.out.println("RequestURI: " + req.getRequestURI());
		System.out.println("RealPath: " + this.getServletContext().getRealPath(req.getRequestURI()));
		System.out.println("ServletContextRealPath: " + this.getServletContext().getRealPath("/"));
	}

	/** 
	 * （重写方法）
	 * doPost方法，当表单提交的时候，form标签里method属性设置为post时，将调用此方法;
	 * 
	 *
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
