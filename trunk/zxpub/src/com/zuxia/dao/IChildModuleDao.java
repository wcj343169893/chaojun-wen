/**
 *******************************************************************************
 * IChildModuleDao.java
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
package com.zuxia.dao;

import java.util.List;

import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;

/**
 * IChildModuleDao概要说明
 * 
 * 
 * @author 文朝军
 */
public interface IChildModuleDao {
	public boolean insertChildModule(ChildModule childModule);

	public boolean updateChildModule(ChildModule childModule);

	public boolean deleteChildModule(int childModuleCd);

	public List<ChildModule> getChildModules();

	public Module getChildModuleByCd(Integer childModuleCd);
}
