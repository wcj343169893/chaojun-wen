package com.zuxia.chapter5;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class WelcomeFilter2
 */
public class WelcomeFilter2 implements Filter {

	/**
	 * ����д������<br>
	 * ���ٷ�����<br>
	 * �÷�������servletContext������ʱ����
	 * 
	 * 
	 */
	public void destroy() {

	}

	/**
	 * ����д������<br>
	 * ��������������<br>
	 * �÷�����ʾ�����������÷�������WelcomeFilter�е�doFilter������֮��ű�����<br>
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
		System.out.println("����WelcomeFilter2�е�doFilter����");
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
		
	}

}
