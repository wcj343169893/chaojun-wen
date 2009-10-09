package com.zuxia.chapter7;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class DownLoadServlet
 */
public class DownLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownLoadServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SmartUpload smartUpload = new SmartUpload();
		smartUpload.initialize(this.config, request, response);
		// 设置不自动打开
		smartUpload.setContentDisposition(null);
		try {
			smartUpload.downloadFile("/share/我们.txt");
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}
}
