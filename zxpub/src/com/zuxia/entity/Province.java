package com.zuxia.entity;

// Generated 2009-11-23 12:07:21 by Hibernate Tools 3.2.4.GA

/**
 * Province generated by hbm2java
 */
public class Province implements java.io.Serializable {

	private Integer provinceCd;
	private String provinceName;

	public Province() {
	}

	public Province(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getProvinceCd() {
		return this.provinceCd;
	}

	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
