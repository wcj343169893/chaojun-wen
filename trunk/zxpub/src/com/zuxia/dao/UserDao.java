package com.zuxia.dao;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public class UserDao implements IUserDao {

	/**
	 * （重写方法） regist方法概述 注册
	 * 
	 * @param user
	 * @param password
	 * @param safeQuestion
	 * @return
	 */
	@Override
	public boolean regist(User user, Password password,
			SafeQuestion safeQuestion) {
		System.out.println("用户名:" + user.getUserName());
		System.out.println("密码：" + password.getPassword());
		System.out.println("性别：" + user.getSex());
		System.out.println("问题id：" + safeQuestion.getQuestionCd());
		System.out.println("答案：" + safeQuestion.getAnswer());
		System.out.println("生日:" + user.getBirthday());
		return true;
	}

	/**
	 * （重写方法） getUserByUserName方法概述
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
