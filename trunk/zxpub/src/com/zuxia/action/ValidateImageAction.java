package com.zuxia.action;

import java.io.ByteArrayInputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.RandomNumUtil;

public class ValidateImageAction extends ActionSupport {
	private ByteArrayInputStream inputStream;

	public String execute() throws Exception {
		RandomNumUtil rdnu = RandomNumUtil.Instance();
		this.setInputStream(rdnu.getImage());// ȡ�ô�������ַ�����ͼƬ
		ServletActionContext.getRequest().getSession().setAttribute(
				"validateCodeRecruit", rdnu.getString());// ȡ������ַ�������HttpSession
		return SUCCESS;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}
}
