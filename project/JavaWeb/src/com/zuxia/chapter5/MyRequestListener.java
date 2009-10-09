/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  示例请求监听器。<br>
 *  可以监听request活动情况、request中属性设置情况。
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyRequestListener
 *
 */
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * MyRequestListener构造方法
     */
    public MyRequestListener() {
    	
    }

    /** 
     * （重写方法）
     * 对初始化客户端请求进行监听
     * 
     *
     * @param arg0
     */
    public void requestInitialized(ServletRequestEvent arg0) {
    	System.out.println("初始化reqeust");
    }

    /** 
     * （重写方法）
     * 对request属性添加进行监听
     * 
     *
     * @param arg0
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果request中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("向request中添加名称为" + arg0.getName() + "值为"
				+ arg0.getValue() + "的属性");
    }

    /** 
     * （重写方法）
     * 对request属性删除进行添加
     * 
     *
     * @param arg0
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果request中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("request删除" + arg0.getName() + "属性，其值为"
				+ arg0.getValue());
    }

    /** 
     * （重写方法）
     * 对request属性修改进行添加
     * 
     *
     * @param arg0
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// 注意这里的arg0.getValue()只能取字符串，如果request中添加的是javaBean对象，<br>
		// 则将打出这个对象的事例字符串，无法显示里面的属性值<br>
		System.out.println("将request中的" + arg0.getName() + "属性的值更新为"
				+ arg0.getValue());
    }

    /** 
     * （重写方法）
     * 对销毁客户端请求(销毁request)进行监听
     * 
     *
     * @param arg0
     */
    public void requestDestroyed(ServletRequestEvent arg0) {
    	System.out.println("销毁request");
    }
	
}
