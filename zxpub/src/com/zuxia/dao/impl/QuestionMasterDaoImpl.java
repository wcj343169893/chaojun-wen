/**
 *******************************************************************************
 * QuestionMasterDaoImpl.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *��������������
 *  zxpub(������̳)
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  �ĳ���
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
 * QuestionMasterDaoImpl��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class QuestionMasterDaoImpl extends HibernateDaoSupport implements
		IQuestionMasterDao {

	/**
	 * ����д������ getQuestionMaster��������
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
