/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ���ڴ���û������û������javaBean
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter5;

/**
 * ���ڴ���û������û������javaBean
 * 
 * 
 * @author ����
 */
public class UserModel {
	/**
	 * �û���
	 * 
	 */
	private String uname = null;

	/**
	 * �û�����
	 * 
	 */
	private String upass = null;

	/**
	 * uname���Ե�get����
	 * 
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * uname���Ե�set����
	 * 
	 * @param uname
	 *            the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * upass���Ե�get����
	 * 
	 * @return the upass
	 */
	public String getUpass() {
		return upass;
	}

	/**
	 * upass���Ե�set����
	 * 
	 * @param upass
	 *            the upass to set
	 */
	public void setUpass(String upass) {
		this.upass = upass;
	}
}
