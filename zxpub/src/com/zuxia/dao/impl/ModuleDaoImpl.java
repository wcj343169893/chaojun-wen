/**
 *******************************************************************************
 * ModuleImpl.java
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

import com.zuxia.dao.IModuleDao;
import com.zuxia.entity.Module;

/**
 * ModuleImpl概要说明
 * 
 * 
 * @author 文朝军
 */
public class ModuleDaoImpl extends HibernateDaoSupport implements IModuleDao {

	/**
	 * （重写方法） deleteModule方法概述
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
	 * （重写方法） getModuleByCd方法概述
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
	 * （重写方法） getModules方法概述
	 * 
	 * 
	 * @return
	 */
	@Override
	public List<Module> getModules() {
		Session session = this.getSession();
		String hql = "from Module";
		Query query = session.createQuery(hql);
		List<Module> modules=query.list();
		return modules;
	}

	/**
	 * （重写方法） insertModule方法概述
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
	 * （重写方法） updateModule方法概述
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
