/**
 *******************************************************************************
 * IModuleService.java
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
package com.zuxia.service;

import java.util.List;

import com.zuxia.entity.Module;

/**
 * IModuleService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public interface IModuleService {
	/**
	 * getModules��������
	 * 
	 *��ȡ���е�module
	 * 
	 * @return
	 */
	public List<Module> getModules();
}
