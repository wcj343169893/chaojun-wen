package com.zuxia.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.INoteDao;
import com.zuxia.entity.Note;

public class NoteDaoImpl extends HibernateDaoSupport implements INoteDao {

	@Override
	public boolean deleteNote() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Note getNoteByCd(Integer noteCd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> getNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertNote() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateNote() {
		// TODO Auto-generated method stub
		return false;
	}

}
