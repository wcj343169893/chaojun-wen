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
	 * photoFileName���Ը��� actionSuppet �������� ,ר�Ż�ȡ�ϴ��ļ����ļ���
	 */
	private String photoFileName;
	private String comment;

	/**
	 * userName���Ե�get����
	 * 
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userName���Ե�set����
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * password���Ե�get����
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * password���Ե�set����
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * password2���Ե�get����
	 * 
	 * @return the password2
	 */
	public String getPassword2() {
		return password2;
	}

	/**
	 * password2���Ե�set����
	 * 
	 * @param password2
	 *            the password2 to set
	 */
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	/**
	 * sex���Ե�get����
	 * 
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * sex���Ե�set����
	 * 
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * questionCd���Ե�get����
	 * 
	 * @return the questionCd
	 */
	public int getQuestionCd() {
		return questionCd;
	}

	/**
	 * questionCd���Ե�set����
	 * 
	 * @param questionCd
	 *            the questionCd to set
	 */
	public void setQuestionCd(int questionCd) {
		this.questionCd = questionCd;
	}

	/**
	 * answer���Ե�get����
	 * 
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * answer���Ե�set����
	 * 
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * provinceCd���Ե�get����
	 * 
	 * @return the provinceCd
	 */
	public int getProvinceCd() {
		return provinceCd;
	}

	/**
	 * provinceCd���Ե�set����
	 * 
	 * @param provinceCd
	 *            the provinceCd to set
	 */
	public void setProvinceCd(int provinceCd) {
		this.provinceCd = provinceCd;
	}

	/**
	 * cityCd���Ե�get����
	 * 
	 * @return the cityCd
	 */
	public int getCityCd() {
		return cityCd;
	}

	/**
	 * cityCd���Ե�set����
	 * 
	 * @param cityCd
	 *            the cityCd to set
	 */
	public void setCityCd(int cityCd) {
		this.cityCd = cityCd;
	}

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
