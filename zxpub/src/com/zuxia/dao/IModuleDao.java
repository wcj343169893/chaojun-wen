/**
 *******************************************************************************
 * IModule.java
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
package com.zuxia.dao;

import java.util.List;
import com.zuxia.entity.Module;

/**
 * IModule��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public interface IModuleDao {
	public boolean insertModule(Module module);

	public boolean updateModule(Module module);

	public boolean deleteModule(int moduleCd);

	public List<Module> getModules();

	public Module getModuleByCd(Integer moduleCd);
}
