/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  通过配置连接池得到数据源的事例Servlet
 *＜作者＞
 *  杨砚
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
 * 通过配置连接池得到数据源的事例Servlet
 * 
 * 
 * @author 杨砚
 */
public class DataSourceDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * DataSourceDemoServlet构造方法
	 */
	public DataSourceDemoServlet() {

	}

	/**
	 * （重写方法） doGet方法
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
	 * （重写方法） doPost方法 该方法演示通过JNDI来获取数据源，并用数据源获取连接来访问数据库。
	 * 查询scott.Emp，向客户端打印Emp表中所有的员工姓名。
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
			// 获取Context接口对象，该接口提供了将对象和名字绑定，以及通过名字检索对象的方法。
			Context ctx = new InitialContext();
			// 通过JNDI获取数据源
			DataSource ds = (DataSource) ctx
					.lookup("java:comp/env/jdbc/testDB");
			// 通过数据源获取连接
			Connection con = ds.getConnection();
			// 查询scott.Emp，向客户端打印Emp表中所有的员工姓名。
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
