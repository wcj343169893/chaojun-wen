package com.zuxia.action;

import java.io.File;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

/**
 * RegistAction��Ҫ˵�� ����ע��
 * 
 * @author �ĳ���
 */
public class RegistAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1445290649313491318L;

	private IUserService userService;

	private User user;

	private Password password;

	private SafeQuestion safeQuestion;

	private String password2;
	/**
	 * uploadFileName���Ը��� actionSuppet �������� ,ר�Ż�ȡ�ϴ��ļ����ļ���
	 */
	private String photoFileName;

	/**
	 * photo���Ը��� ͷ��
	 */
	private File photo;

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
	 * userService���Ե�get����
	 * 
	 * @return the userService
	 */
	public IUserService getUserService() {
		return userService;
	}

	/**
	 * userService���Ե�set����
	 * 
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/**
	 * user���Ե�get����
	 * 
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * user���Ե�set����
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * password���Ե�get����
	 * 
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * password���Ե�set����
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

	/**
	 * safeQuestion���Ե�get����
	 * 
	 * @return the safeQuestion
	 */
	public SafeQuestion getSafeQuestion() {
		return safeQuestion;
	}

	/**
	 * safeQuestion���Ե�set����
	 * 
	 * @param safeQuestion
	 *            the safeQuestion to set
	 */
	public void setSafeQuestion(SafeQuestion safeQuestion) {
		this.safeQuestion = safeQuestion;
	}

	@Override
	public String execute() throws Exception {
		password.setUser(user);
		user.setPassword(password);
		user.setRegistDate(new Date());
		user.setScore(0);
		user.setRoleCd(0);
		user.setSafeQuestion(safeQuestion);
		safeQuestion.setUser(user);
		if (photoFileName != null) {
			String fileName = user.getUserName()
					+ photoFileName.substring(photoFileName.indexOf("."),
							photoFileName.length());
			user.setPhotoPath(fileName);
		}
		boolean isRegist = userService.insert(user, photo);
		if (isRegist) {
			return "success";
		}
		return "error";
	}
}
