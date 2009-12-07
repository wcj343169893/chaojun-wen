package com.zuxia.service.test;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.zuxia.dto.ChileModuleDTO;
import com.zuxia.dto.ModuleDTO;
import com.zuxia.service.IModuleService;

public class ModuleTest extends TestCase {
	public void testGetModule() {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(
				"WebContent/WEB-INF/applicationContext.xml"));
		IModuleService moduleService = (IModuleService) beanFactory
				.getBean("moduleServiceImpl");
		List<ModuleDTO> moduleDTOs = moduleService.getModuleDTOList();
		for (ModuleDTO moduleDTO : moduleDTOs) {
			System.out.println(moduleDTO.getModule().getModuleCd() + "\t"
					+ moduleDTO.getModule().getModuleName() + "\t"
					+ moduleDTO.getModule().getUser().getUserName());
			for (ChileModuleDTO childModuleDTO : moduleDTO
					.getChildModuleDTOList()) {
				System.out.println(childModuleDTO.getChildModule()
						.getChildModuleCd()
						+ "\t"
						+ childModuleDTO.getChildModule().getChildModuleName()
						+ "\t"
						+ childModuleDTO.getChildModule().getUser()
								.getUserName());
				System.out.println(childModuleDTO.getNoteCount() + "\t");

			}
		}
	}
}
