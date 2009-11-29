/**
 *******************************************************************************
 * IChildModuleDao.java
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

import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;

/**
 * IChildModuleDao��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public interface IChildModuleDao {
	public boolean insertChildModule(ChildModule childModule);

	public boolean updateChildModule(ChildModule childModule);

	public boolean deleteChildModule(int childModuleCd);

	public List<ChildModule> getChildModules();

	public Module getChildModuleByCd(Integer childModuleCd);
}
