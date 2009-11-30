/**
 *******************************************************************************
 * QuestionMasterDaoImpl.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *＜所属工程名＞
 *  zxpub(足下论坛)
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  文朝军
 *******************************************************************************
 */
package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IQuestionMasterDao;
import com.zuxia.entity.QuestionMaster;

/**
 * QuestionMasterDaoImpl概要说明
 * 
 * 
 * @author 文朝军
 */
public class QuestionMasterDaoImpl extends HibernateDaoSupport implements
		IQuestionMasterDao {

	/**
	 * （重写方法） getQuestionMaster方法概述
	 * 
	 * 
	 * @return
	 */
	@Override
	public List<QuestionMaster> getQuestionMaster() {
		Session session = this.getSession();
		Query query = session
				.createQuery("from QuestionMaster order by QUESTION_CD");
		List<QuestionMaster> list = query.list();
		return list;
	}

}
