package com.zuxia.dao.impl;

import java.util.List;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Module getChildModuleByCd(Integer childModuleCd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChildModule> getChildModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertChildModule(ChildModule childModule) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateChildModule(ChildModule childModule) {
		// TODO Auto-generated method stub
		return false;
	}

}
