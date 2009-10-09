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
	 * （重写方法）<br>
	 * 销毁方法。<br>
	 * 该方法将在servletContext被销毁时调用
	 * 
	 * 
	 */
	public void destroy() {

	}

	/**
	 * （重写方法）<br>
	 * 过滤器主方法。<br>
	 * 该方法演示过滤器链。该方法将在WelcomeFilter中的doFilter被调用之后才被调用<br>
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
		System.out.println("调用WelcomeFilter2中的doFilter方法");
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
		
	}

}
