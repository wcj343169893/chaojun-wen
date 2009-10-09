/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ʾ��servlet������������<br>
 *  ���Լ���servlet����������servlet�������������������
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter5;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ʾ��servlet������������<br>
 * ���Լ���servlet����������servlet�������������������<br>
 * 
 * 
 * @author ����
 */
public class MyServletContextListener implements ServletContextListener,
		ServletContextAttributeListener {

	/**
	 * MyServletContextListener���췽��
	 */
	public MyServletContextListener() {

	}

	/**
	 * ����д������ �÷����ڸ����������е�����ʱ��������
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������session����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��servletContext�е�" + arg0.getName() + "���Ե�ֵ����Ϊ"
				+ arg0.getValue());
	}

	/**
	 * ����д������ �÷����������������һ��������ʱ���á�
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������session����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��servletContext���������Ϊ" + arg0.getName() + "ֵΪ"
				+ arg0.getValue() + "������");
	}

	/**
	 * ����д������ ��ʼ��servletContext��ʱ����õķ���
	 * 
	 * 
	 * @param arg0
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("servletContext��ʼ��");
	}

	/**
	 * ����д������ ������ServletContext��ʱ�򽫵��õķ���
	 * 
	 * 
	 * @param arg0
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("servletContext������");
	}

	/**
	 * ����д������ �÷�������������ɾ��ĳ������ʱ�ᱻ����
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������servletContext����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("servletContextɾ��" + arg0.getName() + "���ԣ���ֵΪ"
				+ arg0.getValue());
	}

}
