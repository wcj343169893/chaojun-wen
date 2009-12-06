package com.zuxia.service;

import com.zuxia.entity.FellowNote;
import com.zuxia.entity.User;
import com.zuxia.form.EditFellowNoteForm;
import com.zuxia.form.FellowNoteForm;

public interface IFellowNoteService {
	public boolean addFellowNote(FellowNoteForm fellowNoteForm, User user);

	public boolean deleteFellowNote(int fellowNoteCd);

	public boolean editFellowNote(EditFellowNoteForm editFellowNoteForm,
			User user);
	public FellowNote getFellowNoteByCd(int fellowNoteCd);
}
