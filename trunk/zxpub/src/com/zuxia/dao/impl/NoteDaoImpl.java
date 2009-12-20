package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.common.PageInfo;
import com.zuxia.common.PageSearchUtil;
import com.zuxia.dao.INoteDao;
import com.zuxia.entity.Note;

public class NoteDaoImpl extends HibernateDaoSupport implements INoteDao {

	@Override
	public boolean deleteNote(int noteCd) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.delete(getNoteByCd(noteCd));
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
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
	public boolean updateNote(Note note) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.saveOrUpdate(note);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Note getLastNote(int moduleCd, int childModuleCd) {
		Session session = this.getSession();
		String hql = "from Note note where note.module.moduleCd=:moduleCd and note.childModule.childModuleCd=:childModuleCd order by note.publishDate desc";
		Query query = session.createQuery(hql);
		query.setParameter("moduleCd", moduleCd);
		query.setParameter("childModuleCd", childModuleCd);
		query.setFirstResult(0);
		query.setMaxResults(1);
		List<Note> notes = query.list();
		Note note = null;
		if (notes != null && notes.size() > 0) {
			note = notes.get(0);
		}
		return note;
	}

	@Override
	public List<Note> getNotes(int moduleCd, int childModuleCd, int page) {
		Session session = this.getSession();
		String hql = "from Note note where note.module.moduleCd=:moduleCd and note.childModule.childModuleCd=:childModuleCd order by note.publishDate desc";
		Query query = session.createQuery(hql);
		query.setParameter("moduleCd", moduleCd);
		query.setParameter("childModuleCd", childModuleCd);
		query.setFirstResult((page - 1) * 10);
		query.setMaxResults(10);
		List<Note> notes = query.list();
		return notes;
	}

	@Override
	public int getNoteCount(int moduleCd, int childModuleCd) {
		Session session = this.getSession();
		String hql = "select count(*) from Note note where note.module.moduleCd=:moduleCd and note.childModule.childModuleCd=:childModuleCd order by note.publishDate desc";
		Query query = session.createQuery(hql);
		query.setParameter("moduleCd", moduleCd);
		query.setParameter("childModuleCd", childModuleCd);
		List<Object> obj = query.list();
		int count = 0;
		if (obj != null) {
			count = Integer.parseInt(obj.toString());
		}
		return count;
	}

	@Override
	public List<Note> getNotes(int moduleCd, int childModuleCd,
			PageInfo pageInfo) {
		Session session = this.getSession();
		String hql = "from Note note where note.module.moduleCd=? and note.childModule.childModuleCd=?";
		Object[] objectArray = new Object[] { moduleCd, childModuleCd };
		List<Note> pageList = PageSearchUtil.getPageList(session, pageInfo,
				hql, objectArray);
		return pageList;
	}

	@Override
	public int getNoteCountInToday(int childModuleCd) {
		int count = 0;
		Session session = this.getSession();
		String hql = "select count(*) from Note note where note.childModule.childModuleCd=:childModuleCd and PUBLISH_DATE=CURDATE()";
		Query query = session.createQuery(hql);
		try {
			query.setParameter("childModuleCd", childModuleCd);
			List<Object> obj = query.list();
			if (obj != null && obj.size() > 0) {
				count = Integer.parseInt(obj.get(0).toString());
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
