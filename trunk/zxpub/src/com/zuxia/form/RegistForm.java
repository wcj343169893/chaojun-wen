package com.zuxia.form;

import java.io.File;
import java.util.Date;

public class RegistForm {
	private String userName;
	private String password;
	private String password2;
	private String sex;
	private String email;
	private int questionCd;
	private String answer;
	private int provinceCd;
	private int cityCd;
	private Date birthday;
	private File photo;
	/**
	 * photoFileName属性概述 actionSuppet 隐含属性 ,专门获取上传文件的文件名
	 */
	private String photoFileName;
	private String comment;

	/**
	 * userName属性的get方法
	 * 
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userName属性的set方法
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * password属性的get方法
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * password属性的set方法
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * password2属性的get方法
	 * 
	 * @return the password2
	 */
	public String getPassword2() {
		return password2;
	}

	/**
	 * password2属性的set方法
	 * 
	 * @param password2
	 *            the password2 to set
	 */
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	/**
	 * sex属性的get方法
	 * 
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * sex属性的set方法
	 * 
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * questionCd属性的get方法
	 * 
	 * @return the questionCd
	 */
	public int getQuestionCd() {
		return questionCd;
	}

	/**
	 * questionCd属性的set方法
	 * 
	 * @param questionCd
	 *            the questionCd to set
	 */
	public void setQuestionCd(int questionCd) {
		this.questionCd = questionCd;
	}

	/**
	 * answer属性的get方法
	 * 
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * answer属性的set方法
	 * 
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * provinceCd属性的get方法
	 * 
	 * @return the provinceCd
	 */
	public int getProvinceCd() {
		return provinceCd;
	}

	/**
	 * provinceCd属性的set方法
	 * 
	 * @param provinceCd
	 *            the provinceCd to set
	 */
	public void setProvinceCd(int provinceCd) {
		this.provinceCd = provinceCd;
	}

	/**
	 * cityCd属性的get方法
	 * 
	 * @return the cityCd
	 */
	public int getCityCd() {
		return cityCd;
	}

	/**
	 * cityCd属性的set方法
	 * 
	 * @param cityCd
	 *            the cityCd to set
	 */
	public void setCityCd(int cityCd) {
		this.cityCd = cityCd;
	}

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
