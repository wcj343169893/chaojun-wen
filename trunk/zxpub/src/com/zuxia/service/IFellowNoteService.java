package com.zuxia.service;

import com.zuxia.entity.User;
import com.zuxia.form.FellowNoteForm;

public interface IFellowNoteService {
	public boolean addFellowNote(FellowNoteForm fellowNoteForm, User user);
}
