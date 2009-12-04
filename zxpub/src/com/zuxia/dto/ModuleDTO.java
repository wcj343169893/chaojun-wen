package com.zuxia.dto;

import java.util.List;

import com.zuxia.entity.Module;

public class ModuleDTO {
	private Module module;
	private List<ChileModuleDTO> childModuleDTOList;

	/**
	 * module属性的get方法
	 * 
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * module属性的set方法
	 * 
	 * @param module
	 *            the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	/**
	 * childModuleDTOList属性的get方法
	 * 
	 * @return the childModuleDTOList
	 */
	public List<ChileModuleDTO> getChildModuleDTOList() {
		return childModuleDTOList;
	}

	/**
	 * childModuleDTOList属性的set方法
	 * 
	 * @param childModuleDTOList
	 *            the childModuleDTOList to set
	 */
	public void setChildModuleDTOList(List<ChileModuleDTO> childModuleDTOList) {
		this.childModuleDTOList = childModuleDTOList;
	}

}
