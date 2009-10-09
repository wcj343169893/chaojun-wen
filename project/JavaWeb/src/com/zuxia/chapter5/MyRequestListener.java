/**
 *******************************************************************************
 * DemoServlet.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ʾ�������������<br>
 *  ���Լ���request������request���������������
 *�����ߣ�
 *  ����
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
     * MyRequestListener���췽��
     */
    public MyRequestListener() {
    	
    }

    /** 
     * ����д������
     * �Գ�ʼ���ͻ���������м���
     * 
     *
     * @param arg0
     */
    public void requestInitialized(ServletRequestEvent arg0) {
    	System.out.println("��ʼ��reqeust");
    }

    /** 
     * ����д������
     * ��request������ӽ��м���
     * 
     *
     * @param arg0
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������request����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��request���������Ϊ" + arg0.getName() + "ֵΪ"
				+ arg0.getValue() + "������");
    }

    /** 
     * ����д������
     * ��request����ɾ���������
     * 
     *
     * @param arg0
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������request����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("requestɾ��" + arg0.getName() + "���ԣ���ֵΪ"
				+ arg0.getValue());
    }

    /** 
     * ����д������
     * ��request�����޸Ľ������
     * 
     *
     * @param arg0
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// ע�������arg0.getValue()ֻ��ȡ�ַ��������request����ӵ���javaBean����<br>
		// �򽫴���������������ַ������޷���ʾ���������ֵ<br>
		System.out.println("��request�е�" + arg0.getName() + "���Ե�ֵ����Ϊ"
				+ arg0.getValue());
    }

    /** 
     * ����д������
     * �����ٿͻ�������(����request)���м���
     * 
     *
     * @param arg0
     */
    public void requestDestroyed(ServletRequestEvent arg0) {
    	System.out.println("����request");
    }
	
}
