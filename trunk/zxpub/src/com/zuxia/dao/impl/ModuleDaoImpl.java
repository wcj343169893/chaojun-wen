/**
 *******************************************************************************
 * ModuleImpl.java
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

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IModuleDao;
import com.zuxia.entity.Module;

/**
 * ModuleImpl��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class ModuleDaoImpl extends HibernateDaoSupport implements IModuleDao {

	/**
	 * ����д������ deleteModule��������
	 * 
	 * 
	 * @param moduleCd
	 * @return
	 */
	@Override
	public boolean deleteModule(int moduleCd) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ����д������ getModuleByCd��������
	 * 
	 * 
	 * @param moduleCd
	 * @return
	 */
	@Override
	public Module getModuleByCd(Integer moduleCd) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ����д������ getModules��������
	 * 
	 * 
	 * @return
	 */
	@Override
	public List<Module> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ����д������ insertModule��������
	 * 
	 * 
	 * @param module
	 * @return
	 */
	@Override
	public boolean insertModule(Module module) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ����д������ updateModule��������
	 * 
	 * 
	 * @param module
	 * @return
	 */
	@Override
	public boolean updateModule(Module module) {
		// TODO Auto-generated method stub
		return false;
	}

}
