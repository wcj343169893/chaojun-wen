package com.zuxia.entity;

// Generated 2009-11-25 11:12:27 by Hibernate Tools 3.2.4.GA

/**
 * SafeQuestion generated by hbm2java
 */
public class SafeQuestion implements java.io.Serializable {

	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = -7288731626538661661L;
	private int userCd;
	/**
	 * questionMaster���Ը���
	 * 
	 */
	private QuestionMaster questionMaster;
	private String answer;
	private User user;

	/**
	 * userCd���Ե�get����
	 * 
	 * @return the userCd
	 */
	public int getUserCd() {
		return userCd;
	}

	/**
	 * userCd���Ե�set����
	 * 
	 * @param userCd
	 *            the userCd to set
	 */
	public void setUserCd(int userCd) {
		this.userCd = userCd;
	}

	/**
	 * questionMaster���Ե�get����
	 * 
	 * @return the questionMaster
	 */
	public QuestionMaster getQuestionMaster() {
		return questionMaster;
	}

	/**
	 * questionMaster���Ե�set����
	 * 
	 * @param questionMaster
	 *            the questionMaster to set
	 */
	public void setQuestionMaster(QuestionMaster questionMaster) {
		this.questionMaster = questionMaster;
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

}