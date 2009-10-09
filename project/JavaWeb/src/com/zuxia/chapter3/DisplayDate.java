/**
 *******************************************************************************
 * DisplayDate.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ��ʾͨ���̳�TagSupport������ʾ��ǰ���ڵ��Զ����ǩ
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter3;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * ��ʾͨ���̳�TagSupport������ʾ��ǰ���ڵ��Զ����ǩ;<br>
 * TagSupport��ʵ��IterationTag�ӿڵľ����࣬�������һ�㲻��ȥʵ��TagSupport�ӿڣ�<br>
 * ����ȥ�̳�TagSupport��,�������Լ�����Ҫ��дdoStartTag()��doEndTag()��doAfterBody()�ȷ�����<br>
 * ����TagSupport�ڴ������޷���ȡ���޸ġ������ǩ�����֣�����һ��������������ǩ�����ֵı�ǩ��<br>
 * ��ע�������ᵽ���޷���ȡ���޸ġ������ǩ��������ָ�ڱ���Ĵ������޷���ȡ���޸ġ������<br>
 * ����doStartTag()��������TagSupport.EVAL_BODY_INCLUDEʱ�Ὣ��ǩ������������ͻ���ҳ���ϡ�<br>
 * 
 * @author ����
 */
public class DisplayDate extends TagSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ����д��������д�����doStartTag��������ʾͨ���̳�TagSupport������ʾ��ǰ���ڵ��Զ����ǩ<br>
	 * doStartTag()������������ǩ��ʼʱ����еķ�����
	 * 
	 * 
	 * @return �Ϸ��ķ���ֵ��EVAL_BODY_INCLUDE��SKIP_BODY,<br>
	 *         ǰ�߱�ʾ����ʾ ��ǩ������֣����߱�ʾ����ʾ��ǩ������֣�<br>
	 * @throws JspException
	 */
	@Override
	public int doStartTag() throws JspException {
		// ��ȡJspWriterʵ��������ͻ���ҳ���ӡ���
		JspWriter jspWriter = pageContext.getOut();
		// ʵ����һ��SimpleDateFormat���ڸ�ʽ������ʱ��
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd Hh:mm:ss");
		// ʵ����һ��Date�������ｫ�õ�����ϵͳ����ʱ��
		Date date = new Date();
		// ��ϵͳ����ʱ���Date�����ʽ����yyyy-MM-dd HH:mm:ss���ַ�����ʽ
		String dateString = simpleDateFormat.format(date);
		try {
			// ��ͻ��˴�ӡ�����ʽ���������ʱ���ַ���
			jspWriter.println(dateString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// EVAL_BODY_INCLUDE����˼��ָ�����ǩ������(�������ǩ��)
		return TagSupport.EVAL_BODY_INCLUDE;
	}

	/**
	 * ����д��������д�����doEndTag������<br>
	 * doEndTag()��������������ǩ����ʱ���еķ���;
	 * 
	 * 
	 * @return ���õķ���ֵ��EVAL_PAGE�� SKIP_PAGE��<br>
	 *         ǰ�߱�ʾ�������ǩ�����ִ�����µ�JSP��ҳ�������Ǳ�ʾ�������������JSP��ҳ<br>
	 * @throws JspException
	 */
	@Override
	public int doEndTag() throws JspException {
		return TagSupport.SKIP_PAGE;
	}

}
