/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  scott.dept���ӳ��ʵ����
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter1;

/**
 * scott.dept���ӳ��ʵ����
 * 
 * 
 * @author ����
 */
public class Dept implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ���ű��
	 * 
	 */
	private Integer deptno;
	/**
	 * ��������
	 * 
	 */
	private String dname;

	/**
	 * Dept���췽��
	 */
	public Dept() {
	}

	/**
	 * deptno���Ե�get����
	 * 
	 * @return the deptno
	 */
	public final Integer getDeptno() {
		return deptno;
	}

	/**
	 * deptno���Ե�set����
	 * 
	 * @param deptno
	 *            the deptno to set
	 */
	public final void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	/**
	 * dname���Ե�get����
	 * 
	 * @return the dname
	 */
	public final String getDname() {
		return dname;
	}

	/**
	 * dname���Ե�set����
	 * 
	 * @param dname
	 *            the dname to set
	 */
	public final void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * serialVersionUID���Ե�get����
	 * 
	 * @return the serialversionuid
	 */
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

}