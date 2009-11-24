package com.zuxia.dao;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public class UserDao implements IUserDao {

	/**
	 * ����д������ regist�������� ע��
	 * 
	 * @param user
	 * @param password
	 * @param safeQuestion
	 * @return
	 */
	@Override
	public boolean regist(User user, Password password,
			SafeQuestion safeQuestion) {
		System.out.println("�û���:" + user.getUserName());
		System.out.println("���룺" + password.getPassword());
		System.out.println("�Ա�" + user.getSex());
		System.out.println("����id��" + safeQuestion.getQuestionCd());
		System.out.println("�𰸣�" + safeQuestion.getAnswer());
		System.out.println("����:" + user.getBirthday());
		return true;
	}

	/**
	 * ����д������ getUserByUserName��������
	 * 
	 * 
	 * @param userName
	 * @return
	 */
	@Override
	public User getUserByUserName(String userName) {
		System.out.println(userName);
		return null;
	}

}
