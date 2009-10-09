/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  示例会话监听器。<br>
 *  可以监听http会话活动情况、http会话中属性设置情况，也可以监听http会话的active、passivate情况等。
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 事例会话监听器<br>
 * 可以监听http会话活动情况、http会话中属性设置情况，也可以监听http会话的active、passivate情况等。
 * 
 * 
 * @author 杨砚
 */
public class MySessionListener implements HttpSessionListener,
		HttpSessionAttributeListener, HttpSessionActivationListener {

	/**
	 * 记录登录人数的类变量
	 * 
	 */
	int users = 0;

	/**
	 * MySessionListener构造方法
	 */
	public MySessionListener() {
	}

	/**
	 * （重写方法）<br>
	 * 对http会话处于active情况进行监听，一般当session在分布式环境中跨JVM时，才实现该方法。
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionDidActivate(HttpSessionEvent arg0) {
	}

	/**
	 * （重写方法） 对http会话处于passivate情况进行监听，一般当session在分布式环境中跨JVM时，才实现该方法。
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
	}

	/**
	 * （重写方法） 对http会话中属性删除进行监听
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果session中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("session删除" + arg0.getName() + "属性，其值为"
				+ arg0.getValue());
	}

	/**
	 * （重写方法）<br>
	 * 对http会话中属性修改进行监听
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果session中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("将session中的" + arg0.getName() + "属性的值更新为"
				+ arg0.getValue());
	}

	/**
	 * （重写方法）<br>
	 * 对http会话中属性添加进行监听
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果session中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("向session中添加名称为" + arg0.getName() + "值为"
				+ arg0.getValue() + "的属性");
	}

	/**
	 * （重写方法） 对http会话销毁进行监听，如果某个http回话被释放将调用该方法。<br>
	 * 显示当前用户数量
	 * 
	 * @param arg0
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("一个HttpSession被销毁");
		this.users--;
		System.out.println("当前用户数量为" + this.users);
	}

	/**
	 * （重写方法） 对http会话创建的监听，如果http会话被创建将调用该方法。<br>
	 * 显示当前用户数量
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("一个HttpSession被创建");
		this.users++;
		System.out.println("当前用户数量为" + this.users);
	}

}
