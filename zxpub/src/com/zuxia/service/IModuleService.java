/**
 *******************************************************************************
 * IModuleService.java
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
package com.zuxia.service;

import java.util.List;

import com.zuxia.entity.Module;

/**
 * IModuleService概要说明
 * 
 * 
 * @author 文朝军
 */
public interface IModuleService {
	/**
	 * getModules方法概述
	 * 
	 *获取所有的module
	 * 
	 * @return
	 */
	public List<Module> getModules();
}
