package com.zuxia.common;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateSessionFactory概要说明
 * 
 * 得到和关闭session
 * 
 * @author 文朝军
 */
public class HibernateSessionFactory {
	private static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	/**
	 * getSession方法概述
	 * 
	 * 得到session
	 * 
	 * @return
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}

	/**
	 * closeSession方法概述 关闭session
	 * 
	 * @param session
	 */
	public static void closeSession(Session session) {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}

	/**
	 * saveObject方法概述
	 *
	 * 保存
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
