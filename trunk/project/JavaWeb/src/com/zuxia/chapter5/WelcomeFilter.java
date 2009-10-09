/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ������������
 *  ������ʾ����δ��¼�û�����ֻ�е�¼�û����ܷ��ʵ�welcome.jspҳ�档
 *�����ߣ�
 *  ����
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
 * ������ʾ����δ��¼�û�����ֻ�е�¼�û����ܷ��ʵ�welcome.jspҳ�档
 * 
 * 
 * @author ����
 */
public class WelcomeFilter implements Filter {

	/**
	 * ���ڴ�ų�ʼ�����������Ա����
	 * 
	 */
	private FilterConfig config;

	/**
	 * ����д������<br>
	 * ���ٷ�����<br>
	 * �÷�������servletContext������ʱ����
	 * 
	 * 
	 */
	public void destroy() {
		this.config = null;
	}

	/**
	 * ����д������<br>
	 * ��������������<br>
	 * ʵ������δ��¼�û�����ֻ�е�¼�û����ܷ��ʵ�welcome.jspҳ�档<br>
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
		// ��ʾ��ȡ��ʼ������
		String yoyoInit = this.config.getInitParameter("yoyoInit");
		System.out.println(yoyoInit);
		// ��ServletRequestת����HttpServletRequest�Ա��ȡsession
		HttpServletRequest req = (HttpServletRequest) request;
		// ��ȡsession
		HttpSession session = req.getSession();
		// ��session�л�ȡ����û������û������javaBean����
		UserModel userModel = (UserModel) session.getAttribute("login");
		// ���û�л�ȡ������˵���û�û�е�¼����ʱ��ת��login.jspҳ��
		if (userModel == null) {
			session.setAttribute("error", "*��û�е�¼���ȵ�¼��");
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}
		// ������һ��������,ͨ�����ַ�ʽ����ʵ�ֹ�������
		chain.doFilter(request, response);
	}

	/**
	 * ����д������<br>
	 * �÷�������servlet������ʼ����ʱ�򱻵���<br>
	 * 
	 * 
	 * @param fConfig
	 * @throws ServletException
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// �����ڴ�ų�ʼ�������Ķ��������Ա����
		this.config = fConfig;
	}

}
