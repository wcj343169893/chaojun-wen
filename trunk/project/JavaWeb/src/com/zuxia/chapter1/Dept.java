/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  scott.dept表的映射实体类
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter1;

/**
 * scott.dept表的映射实体类
 * 
 * 
 * @author 杨砚
 */
public class Dept implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 部门编号
	 * 
	 */
	private Integer deptno;
	/**
	 * 部门名称
	 * 
	 */
	private String dname;

	/**
	 * Dept构造方法
	 */
	public Dept() {
	}

	/**
	 * deptno属性的get方法
	 * 
	 * @return the deptno
	 */
	public final Integer getDeptno() {
		return deptno;
	}

	/**
	 * deptno属性的set方法
	 * 
	 * @param deptno
	 *            the deptno to set
	 */
	public final void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	/**
	 * dname属性的get方法
	 * 
	 * @return the dname
	 */
	public final String getDname() {
		return dname;
	}

	/**
	 * dname属性的set方法
	 * 
	 * @param dname
	 *            the dname to set
	 */
	public final void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * serialVersionUID属性的get方法
	 * 
	 * @return the serialversionuid
	 */
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

}