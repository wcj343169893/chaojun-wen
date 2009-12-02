package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.INoteDao;
import com.zuxia.entity.Note;

public class NoteDaoImpl extends HibernateDaoSupport implements INoteDao {

	@Override
	public boolean deleteNote() {
		Session session = this.getSession();
		return false;
	}

	@Override
	public Note getNoteByCd(Integer noteCd) {
		Session session = this.getSession();
		return (Note) session.get(Note.class, noteCd);
	}

	@Override
	public List<Note> getNotes() {
		Session session = this.getSession();
		Query query = session.createQuery("from Note");
		return query.list();
	}

	@Override
	public boolean insertNote(Note note) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.save(note);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateNote() {
		Session session = this.getSession();
		return false;
	}

}
