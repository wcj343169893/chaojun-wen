package com.zuxia.service;

import java.util.List;

import com.zuxia.entity.ChildModule;

/**
 * IChildModuleService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public interface IChildModuleService {
	public List<ChildModule> getChildModules();

	public ChildModule getChildModulesByCmCd(int cmCd);
}
