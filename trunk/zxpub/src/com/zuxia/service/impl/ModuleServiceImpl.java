/**
 *******************************************************************************
 * ModuleService.java
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

import java.util.List;

import com.zuxia.dao.IModuleDao;
import com.zuxia.entity.Module;
import com.zuxia.service.IModuleService;

/**
 * ModuleService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class ModuleServiceImpl implements IModuleService {
	private IModuleDao moduleDao;

	/**
	 * moduleDao���Ե�get����
	 * 
	 * @return the moduleDao
	 */
	public IModuleDao getModuleDao() {
		return moduleDao;
	}

	/**
	 * moduleDao���Ե�set����
	 * 
	 * @param moduleDao
	 *            the moduleDao to set
	 */
	public void setModuleDao(IModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	@Override
	public List<Module> getModules() {
		return moduleDao.getModules();
	}

}
