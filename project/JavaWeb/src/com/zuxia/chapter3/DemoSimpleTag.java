/**
 *******************************************************************************
 * DemoSimpleTag.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ��ʾʹ��SimpleTagSupport��д�Զ����ǩ�ࡣ<br>
 *  SimpleTagSupport�����˼�壬���ǿ��Դ���һЩ�򵥵��Զ���ǩ����<br>
 *  ������JSP 2.0֮����������𣬶���һЩ�򵥵��Զ���ǩҳ��<br>
 *  ���Լ̳�����ʵ����ǩ������𣬶�������TagSupport��<br>
 *  BodyTagSuppourt��һ������ش�ֵ�����⡣<br>
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter3;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * ��ʾʹ��SimpleTagSupport��д�Զ����ǩ�ࡣ<br>
 * SimpleTagSupport�����˼�壬���ǿ��Դ���һЩ�򵥵��Զ���ǩ����<br>
 * ������JSP 2.0֮����������𣬶���һЩ�򵥵��Զ���ǩҳ��<br>
 * ���Լ̳�����ʵ����ǩ������𣬶�������TagSupport��<br>
 * BodyTagSuppourt��һ������ش�ֵ�����⡣<br>
 * 
 * @author ����
 */
public class DemoSimpleTag extends SimpleTagSupport {
	private int num;

	/**
	 * num���Ե�set����
	 * 
	 * @param num
	 *            the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * ����д��������дdoTag()������ʵ�ֽ���ǩ���е�����ѭ�������<br>
	 * doTag��������ȡ�ñ�ǩ�����֡�ע��۲�ȡ��ǩ�����ֵķ�����<br>
	 * 
	 * @throws JspException
	 * @throws IOException
	 */
	@Override
	public void doTag() throws JspException, IOException {
		// ��ӡ�ñ�ǩ��num���Ե�ֵ
		this.getJspContext().getOut().println(this.num);
		// ʵ����һ��StringWriter�����ڴ�ű�ǩ������
		StringWriter stringWriter = new StringWriter();
		// ����ǩ�����ַ���StringWriter
		this.getJspBody().invoke(stringWriter);
		// ��ȡ��ǩ������
		String bodyValue = stringWriter.toString();
		// ����ǩ�����ּ���һ���Ǻź������ҳ����
		this.getJspContext().getOut().println(bodyValue + "********");
		// ֱ�ӽ���ǩ�����������ҳ����(���ַ�ʽʵ���Ͼ���ֱ�ӽ���ǩ�����������ҳ���ϣ�<br>
		// �޷�������ķ�ʽ���������Ǻš�)
		this.getJspBody().invoke(null);
	}
}
