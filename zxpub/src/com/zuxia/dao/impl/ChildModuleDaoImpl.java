package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IChildModuleDao;
import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;

/**
 * ChildModuleDaoImpl概要说明
 * 
 * 
 * @author 文朝军
 */
public class ChildModuleDaoImpl extends HibernateDaoSupport implements
		IChildModuleDao {

	@Override
	public boolean deleteChildModule(int childModuleCd) {
		Session session = this.getSession();
		boolean flag = false;
		try {
			session.delete(this.getChildModuleByCmCd(childModuleCd));
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public ChildModule getChildModuleByCmCd(Integer cmCd) {
		Session session = this.getSession();
		return (ChildModule) session.get(ChildModule.class, cmCd);
	}

	@Override
	public List<ChildModule> getChildModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertChildModule(ChildModule childModule) {
		Session session = this.getSession();
		boolean flag = false;
		try {
			session.save(childModule);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean updateChildModule(ChildModule childModule) {
		Session session = this.getSession();
		boolean flag = false;
		try {
			session.saveOrUpdate(childModule);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public List<ChildModule> getChildModulesByMCd(int mCd) {
		Session session = this.getSession();
		List<ChildModule> childModules = null;
		try {
			String hql = "from ChildModule where module.moduleCd=:mCd";
			Query query = session.createQuery(hql);
			query.setParameter("mCd", mCd);
			childModules = query.list();
		} catch (Exception e) {

		}
		return childModules;
	}

}
