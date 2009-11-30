package com.zuxia.service;

import java.util.List;

import com.zuxia.entity.QuestionMaster;
import com.zuxia.entity.User;
import com.zuxia.form.EditPwdForm;
import com.zuxia.form.EditUserForm;
import com.zuxia.form.RegistForm;

public interface IUserService {
	public boolean insert(RegistForm registForm);

	public User getUserByUserName(String userName);

	public boolean deleteUserByName(String name);

	/**
	 * updateUser方法概述
	 * 
	 *修改用户信息
	 * @param editUserForm
	 * @return
	 */
	public boolean updateUser(EditUserForm editUserForm);

	/**
	 * updateUser方法概述
	 * 
	 *修改密码
	 * @param editPwdForm
	 * @return
	 */
	public boolean updateUser(EditPwdForm editPwdForm);

	public boolean updateUser(User user);

	/**
	 * getQuestionMaster方法概述
	 * 
	 *获取问题
	 * 
	 * @return
	 */
	public List<QuestionMaster> getQuestionMaster();
}
