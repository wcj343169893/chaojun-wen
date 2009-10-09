/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ͨ���������ӳصõ�����Դ������Servlet
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter6;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * ͨ���������ӳصõ�����Դ������Servlet
 * 
 * 
 * @author ����
 */
public class DataSourceDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * DataSourceDemoServlet���췽��
	 */
	public DataSourceDemoServlet() {

	}

	/**
	 * ����д������ doGet����
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * ����д������ doPost���� �÷�����ʾͨ��JNDI����ȡ����Դ����������Դ��ȡ�������������ݿ⡣
	 * ��ѯscott.Emp����ͻ��˴�ӡEmp�������е�Ա��������
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			// ��ȡContext�ӿڶ��󣬸ýӿ��ṩ�˽���������ְ󶨣��Լ�ͨ�����ּ�������ķ�����
			Context ctx = new InitialContext();
			// ͨ��JNDI��ȡ����Դ
			DataSource ds = (DataSource) ctx
					.lookup("java:comp/env/jdbc/testDB");
			// ͨ������Դ��ȡ����
			Connection con = ds.getConnection();
			// ��ѯscott.Emp����ͻ��˴�ӡEmp�������е�Ա��������
			Statement statement = con.createStatement();
			ResultSet resultSet = statement
					.executeQuery("select * from scott.emp");
			while (resultSet.next()) {
				String ename = resultSet.getString(1);
				response.getWriter().println(ename);
				response.getWriter().println("<br>");
			}
			resultSet.close();
			statement.close();
			con.close();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
