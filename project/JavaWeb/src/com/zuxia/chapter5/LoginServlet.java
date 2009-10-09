/**
 *******************************************************************************
 * UserModel.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ��¼Servlet������ʾ��һ���û�����������֤�Ĺ��̡��������в�δʹ�����ݿ⡣
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ��¼Servlet������ʾ��һ���û�����������֤�Ĺ��̡��������в�δʹ�����ݿ⡣
 * 
 * 
 * @author ����
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * ����д������ ֱ�ӵ���doPost()����
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ֱ�ӵ���doPost()�������������Ա����������
		this.doPost(request, response);
	}

	/**
	 * ����д������ �ж��û����������Ƿ�ֱ�Ϊ������123456�������֤ͨ������ת��welcome.jsp��<br>
	 * ���δͨ����ת��login.jsp����ע��������תʹ�õ��ǲ�ͬ�ķ�ʽ��<br>
	 * �����ڷ���һ��ʼ�ͽ�request��response���ַ������ó���UTF-8����Ҫ���������ַ�ʽ<br>
	 * �����������⣬��������ҳ����ʹ��post��ʽ�ύ�����ſ��ԡ�
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		// ��request�л�ȡ���ύ���ݣ�username��userpass��
		String uname = request.getParameter("username");
		String upass = request.getParameter("userpass");
		// ͨ��request��ȡsession����servlet��������õĻ�ȡsession�ķ�ʽ
		HttpSession session = request.getSession();
		if ("����".equals(uname) && "123456".equals(upass)) {
			// ����Ӧ����һ����������ű��ύ������ֵ
			UserModel user = new UserModel();
			user.setUname(uname);
			user.setUpass(upass);
			// ��¼�ɹ��󣬽�����û���������Ķ��󱣴浽session��
			// ����ע��۲�welcome.jspҳ��������ô��EL���ʽ��ʾֵ��
			session.setAttribute("login", user);
			// ʹ��forward��ʽ��ת��welcome.jsp������ת��ʽ�Ƿ�����������ת���ͻ����������ַ���ᷢ���仯
			// ����ͻ�������ʱ�ύ�ı�ֵҲ���ᶪʧ��
			request.getRequestDispatcher("welcome.jsp").forward(request,
					response);
		} else {
			// ��������Ϣ���õ�session������
			session.setAttribute("error", "*�û������������");
			// ͨ��sendRedirect��ʽ��ת��login.jspҳ�棬����ת��ʽ�൱�ڿͻ��������ύ��һ�����󵽷�������
			// �ͻ����������ַ�������ı䣬����ͻ����ϴ�����ı�ֵ����ʧ
			response.sendRedirect("login.jsp");
		}
	}

}
