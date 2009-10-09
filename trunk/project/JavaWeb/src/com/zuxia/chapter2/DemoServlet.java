/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ʾ��Servlet��������ʾServlet
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DemoServlet��Ҫ˵��
 * 
 * 
 * @author ����
 */
public class DemoServlet extends HttpServlet {

	/**
	 * �������л�ʱʹ�õ�ID
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ����д������ doGet����,�����ύ��ʱ��form��ǩ��method��������Ϊgetʱ�������ô˷���;
	 * 	��ʾservlet��ʼ��������servlet�е�·��
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
	 * ����д������
	 * doPost�����������ύ��ʱ��form��ǩ��method��������Ϊpostʱ�������ô˷���;
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
