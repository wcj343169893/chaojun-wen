/**
 *******************************************************************************
 * ModuleService.java
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

import com.zuxia.dao.IModuleDao;
import com.zuxia.service.IModuleService;

/**
 * ModuleService概要说明
 * 
 * 
 * @author 文朝军
 */
public class ModuleServiceImpl implements IModuleService {
	private IModuleDao moduleDao;

	/**
	 * moduleDao属性的get方法
	 * 
	 * @return the moduleDao
	 */
	public IModuleDao getModuleDao() {
		return moduleDao;
	}

	/**
	 * moduleDao属性的set方法
	 * 
	 * @param moduleDao
	 *            the moduleDao to set
	 */
	public void setModuleDao(IModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

}
