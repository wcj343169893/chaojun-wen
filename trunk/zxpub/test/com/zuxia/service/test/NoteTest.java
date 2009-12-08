package com.zuxia.service.test;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.zuxia.dto.NoteDTO;
import com.zuxia.service.INoteService;

public class NoteTest extends TestCase {
	public void testNoteDTO() {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(
				"WebContent/WEB-INF/applicationContext.xml"));
		INoteService noteService = (INoteService) beanFactory
				.getBean("noteServiceImpl");
		List<NoteDTO> noteDTOs = noteService.getNoteDTOs(1, 1, 1);
		for (NoteDTO noteDTO : noteDTOs) {
			System.out.println(noteDTO.getNote().getNoteCd()
					+ noteDTO.getNote().getTitle() + noteDTO.getReplayCount());
		}
	}
}
