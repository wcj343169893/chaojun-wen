/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  示例servlet容器监听器。<br>
 *  可以监听servlet容器活动情况、servlet容器中属性设置情况。
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 示例servlet容器监听器。<br>
 * 可以监听servlet容器活动情况、servlet容器中属性设置情况。<br>
 * 
 * 
 * @author 杨砚
 */
public class MyServletContextListener implements ServletContextListener,
		ServletContextAttributeListener {

	/**
	 * MyServletContextListener构造方法
	 */
	public MyServletContextListener() {

	}

	/**
	 * （重写方法） 该方法在更新上下文中的属性时将被调用
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果session中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("将servletContext中的" + arg0.getName() + "属性的值更新为"
				+ arg0.getValue());
	}

	/**
	 * （重写方法） 该方法在上下文中添加一个新属性时调用。
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果session中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("向servletContext中添加名称为" + arg0.getName() + "值为"
				+ arg0.getValue() + "的属性");
	}

	/**
	 * （重写方法） 初始化servletContext的时候调用的方法
	 * 
	 * 
	 * @param arg0
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("servletContext初始化");
	}

	/**
	 * （重写方法） 在销毁ServletContext的时候将调用的方法
	 * 
	 * 
	 * @param arg0
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("servletContext被销毁");
	}

	/**
	 * （重写方法） 该方法在上下文中删除某个属性时会被调用
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果servletContext中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("servletContext删除" + arg0.getName() + "属性，其值为"
				+ arg0.getValue());
	}

}
