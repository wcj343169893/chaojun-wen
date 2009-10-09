/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  scott.emp表的映射实体类
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter1;

import java.util.ArrayList;

/**
 * scott.emp表的映射实体类
 * 
 * 
 * @author 杨砚
 */
public class Emp implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 员工编号
	 * 
	 */
	private Integer empno;

	/**
	 * 员工姓名
	 * 
	 */
	private String ename;

	/**
	 * 所属部门信息
	 * 
	 */
	private Dept dept;

	/**
	 * Emp构造方法
	 */
	public Emp() {
	}

	/**
	 * empno属性的get方法
	 * 
	 * @return the empno
	 */
	public final Integer getEmpno() {
		return empno;
	}

	/**
	 * empno属性的set方法
	 * 
	 * @param empno
	 *            the empno to set
	 */
	public final void setEmpno(Integer empno) {
		this.empno = empno;
	}

	/**
	 * ename属性的get方法
	 * 
	 * @return the ename
	 */
	public final String getEname() {
		return ename;
	}

	/**
	 * ename属性的set方法
	 * 
	 * @param ename
	 *            the ename to set
	 */
	public final void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * serialVersionUID属性的get方法
	 * 
	 * @return the serialversionuid
	 */
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * dept属性的get方法
	 * 
	 * @return the dept
	 */
	public final Dept getDept() {
		return dept;
	}

	/**
	 * dept属性的set方法
	 * 
	 * @param dept
	 *            the dept to set
	 */
	public final void setDept(Dept dept) {
		this.dept = dept;
	}

}