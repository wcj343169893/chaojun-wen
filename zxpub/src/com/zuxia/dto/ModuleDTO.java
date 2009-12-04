package com.zuxia.dto;

import java.util.List;

import com.zuxia.entity.Module;

public class ModuleDTO {
	private Module module;
	private List<ChileModuleDTO> childModuleDTOList;

	/**
	 * module���Ե�get����
	 * 
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * module���Ե�set����
	 * 
	 * @param module
	 *            the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	/**
	 * childModuleDTOList���Ե�get����
	 * 
	 * @return the childModuleDTOList
	 */
	public List<ChileModuleDTO> getChildModuleDTOList() {
		return childModuleDTOList;
	}

	/**
	 * childModuleDTOList���Ե�set����
	 * 
	 * @param childModuleDTOList
	 *            the childModuleDTOList to set
	 */
	public void setChildModuleDTOList(List<ChileModuleDTO> childModuleDTOList) {
		this.childModuleDTOList = childModuleDTOList;
	}

}
