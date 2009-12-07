package com.zuxia.service;

import java.util.List;

import com.zuxia.dto.NoteDTO;
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
	 * getNote ��ȡһ��note
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);

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

	/**
	 * getNoteDTOs ��ȡnoteDTO
	 * 
	 * 
	 * @param moduleCd
	 *            �����Cd
	 * @param childModuleCd
	 *            �Ӱ��Cd
	 * @return
	 */
	public List<NoteDTO> getNoteDTOs(int moduleCd, int childModuleCd,int page);
}
