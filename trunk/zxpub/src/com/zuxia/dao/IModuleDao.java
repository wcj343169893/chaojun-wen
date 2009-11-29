/**
 *******************************************************************************
 * IModule.java
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
import com.zuxia.entity.Module;

/**
 * IModule概要说明
 * 
 * 
 * @author 文朝军
 */
public interface IModuleDao {
	public boolean insertModule(Module module);

	public boolean updateModule(Module module);

	public boolean deleteModule(int moduleCd);

	public List<Module> getModules();

	public Module getModuleByCd(Integer moduleCd);
}
