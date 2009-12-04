/**
 *******************************************************************************
 * ChildModuleService.java
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
package com.zuxia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.dao.IChildModuleDao;
import com.zuxia.entity.ChildModule;
import com.zuxia.service.IChildModuleService;

/**
 * ChildModuleService概要说明
 * 
 * 
 * @author 文朝军
 */
public class ChildModuleServiceImpl implements IChildModuleService {
	private IChildModuleDao childModuleDao;

	/**
	 * childModuleDao属性的get方法
	 * 
	 * @return the childModuleDao
	 */
	public IChildModuleDao getChildModuleDao() {
		return childModuleDao;
	}

	/**
	 * childModuleDao属性的set方法
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
