/**
 *******************************************************************************
 * EditUserForm.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *��������������
 *  zxpub(������̳)
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  �ĳ���
 *******************************************************************************
 */
package com.zuxia.form;

import java.io.File;
import java.util.Date;

/**
 * EditUserForm��Ҫ˵��
 * 
 * 
 * @author �ĳ���
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
	 * birthday���Ե�get����
	 * 
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * birthday���Ե�set����
	 * 
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * email���Ե�get����
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email���Ե�set����
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * provinceCd���Ե�get����
	 * 
	 * @return the provinceCd
	 */
	public Integer getProvinceCd() {
		return provinceCd;
	}

	/**
	 * provinceCd���Ե�set����
	 * 
	 * @param provinceCd
	 *            the provinceCd to set
	 */
	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}

	/**
	 * cityCd���Ե�get����
	 * 
	 * @return the cityCd
	 */
	public Integer getCityCd() {
		return cityCd;
	}

	/**
	 * cityCd���Ե�set����
	 * 
	 * @param cityCd
	 *            the cityCd to set
	 */
	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}

	/**
	 * photo���Ե�get����
	 * 
	 * @return the photo
	 */
	public File getPhoto() {
		return photo;
	}

	/**
	 * photo���Ե�set����
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(File photo) {
		this.photo = photo;
	}

	/**
	 * photoFileName���Ե�get����
	 * 
	 * @return the photoFileName
	 */
	public String getPhotoFileName() {
		return photoFileName;
	}

	/**
	 * photoFileName���Ե�set����
	 * 
	 * @param photoFileName
	 *            the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	/**
	 * comment���Ե�get����
	 * 
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * comment���Ե�set����
	 * 
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
