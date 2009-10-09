/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  用于存放用户名和用户密码的javaBean
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter5;

/**
 * 用于存放用户名和用户密码的javaBean
 * 
 * 
 * @author 杨砚
 */
public class UserModel {
	/**
	 * 用户名
	 * 
	 */
	private String uname = null;

	/**
	 * 用户密码
	 * 
	 */
	private String upass = null;

	/**
	 * uname属性的get方法
	 * 
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * uname属性的set方法
	 * 
	 * @param uname
	 *            the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * upass属性的get方法
	 * 
	 * @return the upass
	 */
	public String getUpass() {
		return upass;
	}

	/**
	 * upass属性的set方法
	 * 
	 * @param upass
	 *            the upass to set
	 */
	public void setUpass(String upass) {
		this.upass = upass;
	}
}
