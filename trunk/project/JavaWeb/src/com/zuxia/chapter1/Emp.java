/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  scott.emp���ӳ��ʵ����
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter1;

import java.util.ArrayList;

/**
 * scott.emp���ӳ��ʵ����
 * 
 * 
 * @author ����
 */
public class Emp implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Ա�����
	 * 
	 */
	private Integer empno;

	/**
	 * Ա������
	 * 
	 */
	private String ename;

	/**
	 * ����������Ϣ
	 * 
	 */
	private Dept dept;

	/**
	 * Emp���췽��
	 */
	public Emp() {
	}

	/**
	 * empno���Ե�get����
	 * 
	 * @return the empno
	 */
	public final Integer getEmpno() {
		return empno;
	}

	/**
	 * empno���Ե�set����
	 * 
	 * @param empno
	 *            the empno to set
	 */
	public final void setEmpno(Integer empno) {
		this.empno = empno;
	}

	/**
	 * ename���Ե�get����
	 * 
	 * @return the ename
	 */
	public final String getEname() {
		return ename;
	}

	/**
	 * ename���Ե�set����
	 * 
	 * @param ename
	 *            the ename to set
	 */
	public final void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * serialVersionUID���Ե�get����
	 * 
	 * @return the serialversionuid
	 */
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * dept���Ե�get����
	 * 
	 * @return the dept
	 */
	public final Dept getDept() {
		return dept;
	}

	/**
	 * dept���Ե�set����
	 * 
	 * @param dept
	 *            the dept to set
	 */
	public final void setDept(Dept dept) {
		this.dept = dept;
	}

}