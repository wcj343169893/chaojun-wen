package com.zuxia.common;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateSessionFactory��Ҫ˵��
 * 
 * �õ��͹ر�session
 * 
 * @author �ĳ���
 */
public class HibernateSessionFactory {
	private static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	/**
	 * getSession��������
	 * 
	 * �õ�session
	 * 
	 * @return
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}

	/**
	 * closeSession�������� �ر�session
	 * 
	 * @param session
	 */
	public static void closeSession(Session session) {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}

	/**
	 * saveObject��������
	 *
	 * ����
	 *
	 * @param object
	 * @return
	 */
	public boolean saveObject(Object object) {
		boolean flag = false;
		Session session = HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			session.save(object);
			session.getTransaction().commit();
			flag = true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			flag = false;
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return flag;
	}

}
