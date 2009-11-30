/**
 *******************************************************************************
 * EditUserForm.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *＜所属工程名＞
 *  zxpub(足下论坛)
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  文朝军
 *******************************************************************************
 */
package com.zuxia.form;

import java.io.File;
import java.util.Date;

/**
 * EditUserForm概要说明
 * 
 * 
 * @author 文朝军
 */
public class EditUserForm {
	private Date birthday;
	private String email;
	private Integer provinceCd;
	private Integer cityCd;
	private File photo;
	private String photoFileName;
	private String comment;

	/**
	 * birthday属性的get方法
	 * 
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * birthday属性的set方法
	 * 
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * email属性的get方法
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email属性的set方法
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * provinceCd属性的get方法
	 * 
	 * @return the provinceCd
	 */
	public Integer getProvinceCd() {
		return provinceCd;
	}

	/**
	 * provinceCd属性的set方法
	 * 
	 * @param provinceCd
	 *            the provinceCd to set
	 */
	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}

	/**
	 * cityCd属性的get方法
	 * 
	 * @return the cityCd
	 */
	public Integer getCityCd() {
		return cityCd;
	}

	/**
	 * cityCd属性的set方法
	 * 
	 * @param cityCd
	 *            the cityCd to set
	 */
	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}

	/**
	 * photo属性的get方法
	 * 
	 * @return the photo
	 */
	public File getPhoto() {
		return photo;
	}

	/**
	 * photo属性的set方法
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(File photo) {
		this.photo = photo;
	}

	/**
	 * photoFileName属性的get方法
	 * 
	 * @return the photoFileName
	 */
	public String getPhotoFileName() {
		return photoFileName;
	}

	/**
	 * photoFileName属性的set方法
	 * 
	 * @param photoFileName
	 *            the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	/**
	 * comment属性的get方法
	 * 
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * comment属性的set方法
	 * 
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
