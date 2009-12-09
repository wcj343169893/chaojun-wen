package com.zuxia.service;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.dto.NoteDTO;
import com.zuxia.dto.NoteDetailsDTO;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;

public interface INoteService {
	/**
	 * addNote ��������
	 * 
	 * @param note
	 * @return
	 */
	public boolean addNote(Note note);

	public boolean addNote(AddNoteForm addNoteForm, User user);

	/**
	 * getNote ��ȡһ��note ���޸ĵ��
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);

	public Note getOneNote(int noteCd, int page);

	/**
	 * delteNote ɾ��
	 * 
	 * @param noteCd
	 * @return
	 */
	public boolean delteNote(int noteCd);

	/**
	 * editNote �޸�
	 * 
	 * @param editNoteForm
	 * @param user
	 * @return
	 */
	public boolean editNote(EditNoteForm editNoteForm, User user);

	public boolean editNote(Note note);

	/**
	 * getNoteDTOs ��ʼ��noteһ����
	 * 
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @param pageInfo
	 * @return
	 */
	public List<NoteDTO> getNoteDTOs(int moduleCd, int childModuleCd,
			PageInfo pageInfo);

	/**
	 * getNoteDetailsDTO ��ȡnote����ϸ��Ϣ�͸���
	 * 
	 * 
	 * @param noteCd
	 * @param pageInfo
	 * @return
	 */
	public NoteDetailsDTO getNoteDetailsDTO(int noteCd, PageInfo pageInfo);
}
