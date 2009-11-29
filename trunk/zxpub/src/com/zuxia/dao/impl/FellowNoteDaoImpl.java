package com.zuxia.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.entity.FellowNote;

public class FellowNoteDaoImpl extends HibernateDaoSupport implements IFellowNoteDao {

	@Override
	public boolean deleteFellowNote(int fellowNoteCd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FellowNote getFellowNoteByCd(Integer fellowNoteCd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FellowNote> getFellowNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertFellowNote(FellowNote fellowNote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFellowNote(FellowNote fellowNote) {
		// TODO Auto-generated method stub
		return false;
	}


}
