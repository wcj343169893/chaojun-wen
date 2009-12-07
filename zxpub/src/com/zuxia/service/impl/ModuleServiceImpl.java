/**
 *******************************************************************************
 * ModuleService.java
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
package com.zuxia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.dao.IChildModuleDao;
import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.dao.IModuleDao;
import com.zuxia.dao.INoteDao;
import com.zuxia.dto.ChileModuleDTO;
import com.zuxia.dto.ModuleDTO;
import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;
import com.zuxia.service.IModuleService;

/**
 * ModuleService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class ModuleServiceImpl implements IModuleService {
	private IModuleDao moduleDao;
	private IChildModuleDao childModuleDao;
	private INoteDao noteDao;
	private IFellowNoteDao fellowNoteDao;

	/**
	 * noteDao���Ե�get����
	 * 
	 * @return the noteDao
	 */
	public INoteDao getNoteDao() {
		return noteDao;
	}

	/**
	 * noteDao���Ե�set����
	 * 
	 * @param noteDao
	 *            the noteDao to set
	 */
	public void setNoteDao(INoteDao noteDao) {
		this.noteDao = noteDao;
	}

	/**
	 * fellowNoteDao���Ե�get����
	 * 
	 * @return the fellowNoteDao
	 */
	public IFellowNoteDao getFellowNoteDao() {
		return fellowNoteDao;
	}

	/**
	 * fellowNoteDao���Ե�set����
	 * 
	 * @param fellowNoteDao
	 *            the fellowNoteDao to set
	 */
	public void setFellowNoteDao(IFellowNoteDao fellowNoteDao) {
		this.fellowNoteDao = fellowNoteDao;
	}

	/**
	 * moduleDao���Ե�get����
	 * 
	 * @return the moduleDao
	 */
	public IModuleDao getModuleDao() {
		return moduleDao;
	}

	/**
	 * moduleDao���Ե�set����
	 * 
	 * @param moduleDao
	 *            the moduleDao to set
	 */
	public void setModuleDao(IModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}

	/**
	 * childModuleDao���Ե�get����
	 * 
	 * @return the childModuleDao
	 */
	public IChildModuleDao getChildModuleDao() {
		return childModuleDao;
	}

	/**
	 * childModuleDao���Ե�set����
	 * 
	 * @param childModuleDao
	 *            the childModuleDao to set
	 */
	public void setChildModuleDao(IChildModuleDao childModuleDao) {
		this.childModuleDao = childModuleDao;
	}

	@Override
	public List<Module> getModules() {
		return moduleDao.getModules();
	}

	@Override
	public List<ModuleDTO> getModuleDTOList() {
		List<ModuleDTO> moduleDTOList = new ArrayList<ModuleDTO>();
		List<Module> moduleList = getModules();
		for (Module module : moduleList) {
			ModuleDTO moduleDTO = new ModuleDTO();
			List<ChileModuleDTO> childModuleDTOList = new ArrayList<ChileModuleDTO>();
			List<ChildModule> childModuleList = childModuleDao
					.getChildModulesByMCd(module.getModuleCd());
			for (ChildModule childModule : childModuleList) {
				int notesize = childModule.getNotes().size();
				ChileModuleDTO childModuleDTO = new ChileModuleDTO();
				childModuleDTO.setChildModule(childModule);
				childModuleDTO.setNoteCount(notesize);
				childModuleDTO.setFellowNoteCount(fellowNoteDao.getFellowNoteCount(module.getModuleCd(), childModule.getChildModuleCd()));
				childModuleDTO.setLastNote(noteDao.getLastNote(module
						.getModuleCd(), childModule.getChildModuleCd()));
				childModuleDTOList.add(childModuleDTO);
			}
			moduleDTO.setModule(module);
			moduleDTO.setChildModuleDTOList(childModuleDTOList);
			moduleDTOList.add(moduleDTO);
		}
		return moduleDTOList;
	}

}
