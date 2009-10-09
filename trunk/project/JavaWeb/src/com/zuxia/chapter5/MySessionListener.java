/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ʾ���Ự��������<br>
 *  ���Լ���http�Ự������http�Ự���������������Ҳ���Լ���http�Ự��active��passivate����ȡ�
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter5;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * �����Ự������<br>
 * ���Լ���http�Ự������http�Ự���������������Ҳ���Լ���http�Ự��active��passivate����ȡ�
 * 
 * 
 * @author ����
 */
public class MySessionListener implements HttpSessionListener,
		HttpSessionAttributeListener, HttpSessionActivationListener {

	/**
	 * ��¼��¼�����������
	 * 
	 */
	int users = 0;

	/**
	 * MySessionListener���췽��
	 */
	public MySessionListener() {
	}

	/**
	 * ����д������<br>
	 * ��http�Ự����active������м�����һ�㵱session�ڷֲ�ʽ�����п�JVMʱ����ʵ�ָ÷�����
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionDidActivate(HttpSessionEvent arg0) {
	}

	/**
	 * ����д������ ��http�Ự����passivate������м�����һ�㵱session�ڷֲ�ʽ�����п�JVMʱ����ʵ�ָ÷�����
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
	}

	/**
	 * ����д������ ��http�Ự������ɾ�����м���
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������session����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("sessionɾ��" + arg0.getName() + "���ԣ���ֵΪ"
				+ arg0.getValue());
	}

	/**
	 * ����д������<br>
	 * ��http�Ự�������޸Ľ��м���
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������session����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��session�е�" + arg0.getName() + "���Ե�ֵ����Ϊ"
				+ arg0.getValue());
	}

	/**
	 * ����д������<br>
	 * ��http�Ự��������ӽ��м���
	 * 
	 * 
	 * @param arg0
	 */
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������session����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��session���������Ϊ" + arg0.getName() + "ֵΪ"
				+ arg0.getValue() + "������");
	}

	/**
	 * ����д������ ��http�Ự���ٽ��м��������ĳ��http�ػ����ͷŽ����ø÷�����<br>
	 * ��ʾ��ǰ�û�����
	 * 
	 * @param arg0
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("һ��HttpSession������");
		this.users--;
		System.out.println("��ǰ�û�����Ϊ" + this.users);
	}

	/**
	 * ����д������ ��http�Ự�����ļ��������http�Ự�����������ø÷�����<br>
	 * ��ʾ��ǰ�û�����
	 * 
	 * 
	 * @param arg0
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("һ��HttpSession������");
		this.users++;
		System.out.println("��ǰ�û�����Ϊ" + this.users);
	}

}
