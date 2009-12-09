package com.zuxia.common;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

public class PageSearchUtil {
	protected PageSearchUtil() {
	}

	public static List getPageList(Session session, PageInfo pageInfo, String hql,
			Object[] objectArray) {
		pageInfo.setRecordCount(0);
		int pageSize = pageInfo.getPageSize();
		int pageNum = pageInfo.getCurrentPage();
		if (pageNum <= 0) {
			pageInfo.setCurrentPage(1);
			pageNum = 1;
		}
		String countHql = "select count(*) " + hql;
		Query query = null;
		Query countQuery = null;
		int count = 0;
		try {
			query = session.createQuery(hql);
			countQuery = session.createQuery(countHql);
			if (objectArray != null && objectArray.length > 0) {
				for (int i = 0; i < objectArray.length; i++) {
					query.setParameter(i, objectArray[i]);
					countQuery.setParameter(i, objectArray[i]);
				}
			}
			try {
				List countL = countQuery.list();
				if (countL != null) {
					count = Integer.parseInt((countL.get(0).toString()));
				} else {
					count = 0;
				}
			} catch (NoSuchElementException e) {
				count = 0;
			}
			if (count > 0) {
				query.setFirstResult((pageNum - 1) * pageSize);
				query.setMaxResults(pageSize);
				List result = query.list();
				if (result == null || result.size() == 0) {
					int lastPage = (count + pageSize) / pageSize;
					int start = (lastPage - 1) * pageSize;
					query.setFirstResult(start);
					query.setMaxResults(count - start);
					result = query.list();
					pageInfo.setCurrentPage(lastPage);
				}
				pageInfo.setRecordCount(count);
				return result;
			} else {
				pageInfo.setRecordCount(0);
			}
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}

		return new ArrayList();
	}
}
