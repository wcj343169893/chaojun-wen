package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;

public class FellowNoteDaoImpl extends HibernateDaoSupport implements
		IFellowNoteDao {

	@Override
	public boolean deleteFellowNote(int fellowNoteCd) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.delete(getFellowNoteByCd(fellowNoteCd));
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public FellowNote getFellowNoteByCd(Integer fellowNoteCd) {
		Session session = this.getSession();
		return (FellowNote) session.get(FellowNote.class, fellowNoteCd);

	}

	@Override
	public List<FellowNote> getFellowNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertFellowNote(FellowNote fellowNote) {
		Session session = this.getSession();
		boolean flag = false;
		try {
			session.save(fellowNote);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateFellowNote(FellowNote fellowNote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FellowNote getLastFellowNote(int noteCd) {
		Session session = this.getSession();
		String hql = "from FellowNote fellowNote where fellowNote.note.noteCd=:noteCd  order by fellowNote.publishDate desc";
		Query query = session.createQuery(hql);
		query.setParameter("noteCd", noteCd);
		query.setFirstResult(0);
		query.setMaxResults(1);
		List<FellowNote> fellowNotes = query.list();
		FellowNote fellowNote = null;
		if (fellowNotes != null && fellowNotes.size() > 0) {
			fellowNote = fellowNotes.get(0);
		}
		return fellowNote;
	}

	@Override
	public long getFellowNoteCount(int noteCd) {
		Session session = this.getSession();
		String hql = "select count(*) from FellowNote fellowNote where fellowNote.note.noteCd=:noteCd";
		Query query = session.createQuery(hql);
		query.setParameter("noteCd", noteCd);
		List<Object> obj = query.list();
		int count = 0;
		if (obj != null && obj.size() > 0) {
			count = Integer.valueOf(obj.get(0).toString());
		}
		return count;
	}

	@Override
	public long getFellowNoteCount(int moduleCd, int childModuleCd) {

		return 0;
	}

	@Override
	public List<FellowNote> getFellowNotes(int noteCd, int page) {
		Session session = this.getSession();
		String hql = "from FellowNote fellowNote where fellowNote.note.noteCd=:noteCd";
		Query query = session.createQuery(hql);
		query.setParameter("noteCd", noteCd);
		query.setFirstResult((page - 1) * 10);
		query.setMaxResults(10);
		List<FellowNote> fellowNotes = query.list();
		return fellowNotes;
	}

}
