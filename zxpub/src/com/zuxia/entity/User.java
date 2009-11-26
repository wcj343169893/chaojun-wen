package com.zuxia.entity;

// Generated 2009-11-25 11:12:27 by Hibernate Tools 3.2.4.GA

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userCd;
	private String userName;
	private int roleCd;
	private String sex;
	private String photoPath;
	private Date birthday;
	/**
	 * province属性概述
	 * 
	 */
	private Province province;
	/**
	 * city属性概述
	 * 
	 */
	private City city;
	private String email;
	private Integer score;
	private Date lastLoginDate;
	private Date registDate;
	private String comment;
	/**
	 * password属性概述
	 * 
	 */
	private Password password;
	/**
	 * modules属性概述 主版块
	 */
	private List<Module> modules = new ArrayList<Module>();
	/**
	 * childModules属性概述 子版块
	 */
	private List<ChildModule> childModules = new ArrayList<ChildModule>();
	/**
	 * notes属性概述 主贴
	 */
	private List<Note> notes = new ArrayList<Note>();
	/**
	 * fellowNotes属性概述 跟帖
	 */
	private List<FellowNote> fellowNotes = new ArrayList<FellowNote>();

	/**
	 * notes属性的get方法
	 * 
	 * @return the notes
	 */
	public List<Note> getNotes() {
		return notes;
	}

	/**
	 * notes属性的set方法
	 * 
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	/**
	 * fellowNotes属性的get方法
	 * 
	 * @return the fellowNotes
	 */
	public List<FellowNote> getFellowNotes() {
		return fellowNotes;
	}

	/**
	 * fellowNotes属性的set方法
	 * 
	 * @param fellowNotes
	 *            the fellowNotes to set
	 */
	public void setFellowNotes(List<FellowNote> fellowNotes) {
		this.fellowNotes = fellowNotes;
	}

	/**
	 * childModules属性的get方法
	 * 
	 * @return the childModules
	 */
	public List<ChildModule> getChildModules() {
		return childModules;
	}

	/**
	 * childModules属性的set方法
	 * 
	 * @param childModules
	 *            the childModules to set
	 */
	public void setChildModules(List<ChildModule> childModules) {
		this.childModules = childModules;
	}

	/**
	 * modules属性的get方法
	 * 
	 * @return the modules
	 */
	public List<Module> getModules() {
		return modules;
	}

	/**
	 * modules属性的set方法
	 * 
	 * @param modules
	 *            the modules to set
	 */
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	/**
	 * userCd属性的get方法
	 * 
	 * @return the userCd
	 */
	public Integer getUserCd() {
		return userCd;
	}

	/**
	 * userCd属性的set方法
	 * 
	 * @param userCd
	 *            the userCd to set
	 */
	public void setUserCd(Integer userCd) {
		this.userCd = userCd;
	}

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
	 * roleCd属性的get方法
	 * 
	 * @return the roleCd
	 */
	public int getRoleCd() {
		return roleCd;
	}

	/**
	 * roleCd属性的set方法
	 * 
	 * @param roleCd
	 *            the roleCd to set
	 */
	public void setRoleCd(int roleCd) {
		this.roleCd = roleCd;
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
	 * photoPath属性的get方法
	 * 
	 * @return the photoPath
	 */
	public String getPhotoPath() {
		return photoPath;
	}

	/**
	 * photoPath属性的set方法
	 * 
	 * @param photoPath
	 *            the photoPath to set
	 */
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
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
	 * province属性的get方法
	 * 
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}

	/**
	 * province属性的set方法
	 * 
	 * @param province
	 *            the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}

	/**
	 * city属性的get方法
	 * 
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * city属性的set方法
	 * 
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
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
	 * score属性的get方法
	 * 
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * score属性的set方法
	 * 
	 * @param score
	 *            the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * lastLoginDate属性的get方法
	 * 
	 * @return the lastLoginDate
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * lastLoginDate属性的set方法
	 * 
	 * @param lastLoginDate
	 *            the lastLoginDate to set
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * registDate属性的get方法
	 * 
	 * @return the registDate
	 */
	public Date getRegistDate() {
		return registDate;
	}

	/**
	 * registDate属性的set方法
	 * 
	 * @param registDate
	 *            the registDate to set
	 */
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
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

	/**
	 * password属性的get方法
	 * 
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * password属性的set方法
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

}
