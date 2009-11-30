package com.zuxia.service;

import java.io.File;
import java.util.List;

import com.zuxia.entity.QuestionMaster;
import com.zuxia.entity.User;
import com.zuxia.form.EditUserForm;

public interface IUserService {
	public boolean insert(User user, File upload);

	public User getUserByUserName(String userName);

	public boolean deleteUserByName(String name);

	public boolean updateUser(EditUserForm editUserForm);

	/**
	 * getQuestionMaster��������
	 * 
	 *��ȡ����
	 * 
	 * @return
	 */
	public List<QuestionMaster> getQuestionMaster();
}
