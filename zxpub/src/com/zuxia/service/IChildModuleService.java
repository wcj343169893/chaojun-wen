package com.zuxia.service;

import java.util.List;

import com.zuxia.entity.ChildModule;

/**
 * IChildModuleService概要说明
 * 
 * 
 * @author 文朝军
 */
public interface IChildModuleService {
	public List<ChildModule> getChildModules();

	public ChildModule getChildModulesByCmCd(int cmCd);
	public boolean addChildModule(ChildModule childModule);
	public boolean deleteChildModule(int cmCd);
	public boolean updateChildModule(ChildModule childModule);
}
