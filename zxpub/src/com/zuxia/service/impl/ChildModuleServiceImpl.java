/**
 *******************************************************************************
 * ChildModuleService.java
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
package com.zuxia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.dao.IChildModuleDao;
import com.zuxia.entity.ChildModule;
import com.zuxia.service.IChildModuleService;

/**
 * ChildModuleService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class ChildModuleServiceImpl implements IChildModuleService {
	private IChildModuleDao childModuleDao;

	/**
	 * childModuleDao���Ե�get����
	 * 
	 * @return the childModuleDao
	 */
	public IChildModuleDao getChildModuleDao() {
		return childModuleDao;
	}

	/**
	 * childModuleDao���Ե�set����
	 * 
	 * @param childModuleDao
	 *            the childModuleDao to set
	 */
	public void setChildModuleDao(IChildModuleDao childModuleDao) {
		this.childModuleDao = childModuleDao;
	}

	@Override
	public List<ChildModule> getChildModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChildModule getChildModulesByCmCd(int cmCd) {
		return childModuleDao.getChildModuleByCmCd(cmCd);

	}

}
