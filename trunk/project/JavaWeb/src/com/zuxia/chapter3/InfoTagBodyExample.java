/**
 *******************************************************************************
 * InfoTagBodyExample.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ��ʾͨ���̳�BodyTagSupport����ѭ����ʾ�ı�ǩ
 *�����ߣ�
 *  ����
 *******************************************************************************
 */
package com.zuxia.chapter3;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * ��ʾͨ���̳�BodyTagSupport����ѭ����ʾ�ı�ǩ
 * 
 * 
 * @author ����
 */
public class InfoTagBodyExample extends BodyTagSupport {

	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName = null;
	int count = 0;

	/**
	 * userName���Ե�set����<br>
	 * ���ʹ�øñ�ǩʱ�趨��userName���ԣ��÷����ᱻ�Զ����á�
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * count���Ե�set����
	 * ���ʹ�øñ�ǩʱ�趨��count���ԣ��÷����ᱻ�Զ����á�
	 * 
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * ����д��������д�����doStartTag������ʵ��ѭ����ӡ��ǩ��userName����<br>
	 * doStartTag()������������ǩ��ʼʱ����еķ�����<br>
	 * 
	 * 
	 * @return �䳣�õķ���ֵ��BodyTagSupport.EVAL_BODY_BUFFERED��<br>
	 *         BodyTagSupport.EVAL_BODY_INCLUDE��BodyTagSupport.SKIP_BODY��������<br>
	 *         ����BodyTagSupport.EVAL_BODY_INCLUDE��ʾ�������ǩ�����ִ�к����JSP��ҳ(����������� ��<br>
	 *         doAfterBody�ȷ���)��BodyTagSupport.SKIP_BODY��ʾ����������JSP��ҳ(���������,<br>
	 *         ��doAfterBody����)�� ��BodyTagSupport.EVAL_BODY_BUFFERED<br>
	 *         ��������BodyTagSupport.EVAL_BODY_INCLUDE��ͬ����BodyTagSupport.<br>
	 *         EVAL_BODY_BUFFERED��ִ����setBodyContent(BodyContent arg0)������<br>
	 *         ���ֻ�з���BodyTagSupport.EVAL_BODY_BUFFERED�������ں�����doAfterBody()<br>
	 *         �����еõ�BodyContent��ʵ����<br>
	 * 
	 * @throws JspException
	 */
	@Override
	public int doStartTag() throws JspException {
		// ͨ�����õ�pageContext�����ȡJspWriter��������ҳ���ӡ�������;
		JspWriter jspWriter = this.pageContext.getOut();
		int countValue = this.count;
		// ͨ����ǩ��countѭ����ӡuserName����;�����count��Ϊѭ����ӡ�Ĵ���
		while (countValue-- >= 1) {
			try {
				// ��ӡ��ǩ��userName���ԣ�����û�а취ȡ�ñ�ǩ�����֣�����ֻ�ܴ�ӡ��ǩ���ԡ�
				// Ҫ��ӡ��ǩ�����֣������doAfterBody()������
				jspWriter.println(userName + "<br>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ����BodyTagSupport.EVAL_BODY_BUFFERED�����ڷ���ֵ���������ע�͡�
		return BodyTagSupport.EVAL_BODY_BUFFERED;
	}

	/**
	 * ����д������ ��д�����doAfterBody������ʵ��ѭ����ӡ��ǩ���������ݼ���ǩ��userName���ԡ�<br>
	 * ����������ڽ������ǩ������֮���Զ����õġ�<br>
	 * �÷��������õ�ǰ����doStartTag()�����ķ���ֵ������BodyTagSupport.SKIP_BODY��<br>
	 * ���doStartTag()�����ķ���ֵ��BodyTagSupport.SKIP_BODY�������������ᱻ���á�<br>
	 * ���doStartTag()�����ķ���ֵ��BodyTagSupport.EVAL_BODY_INCLUDE���������������ã�<br>
	 * ���ڱ���������ȡ����BodyContent��ʵ��(ȡ������null)��<br>
	 * ���doStartTag()�����ķ���ֵ��BodyTagSupport.EVAL_BODY_BUFFERED���������������ã�<br>
	 * �����ڱ����������ܹ����BodyContent��ʵ����ͨ�����ʵ�����ǿ��Ի�ȡ���ı䡢�����ǩ�����֡�<br>
	 * 
	 * 
	 * @return ���÷���ֵ����BodyTagSupport.EVAL_BODY_AGAIN��BodyTagSupport.SKIP_BODY;<br>
	 *         �������BodyTagSupport.EVAL_BODY_AGAIN���ٴε���doAfterBody()�������������<br>
	 *         BodyTagSupport.SKIP_BODY�����׽���doAfterBody��������������ڸ÷��������ٵ���һ�����<br>
	 *         ����BodyTagSupport.SKIP_BODY�����򽫳�Ϊ��ѭ����<br>
	 * @throws JspException
	 */
	@Override
	public int doAfterBody() throws JspException {
		// ���count���ڵ���1�������еݹ����
		if (this.count-- >= 1) {
			try {
				// ͨ������bodyContentʵ����ȡJspWriterʵ��
				JspWriter out = this.bodyContent.getEnclosingWriter();
				// ��ͻ��˴�ӡ�����ǩ���������ݼ���ǩ��userName����
				out.println(this.bodyContent.getString() + userName);
				// ��մ洢�ı�ǩ�崦�����������ٴ�ʹ��this.bodyContent.getString()����ÿ�δ�����֮��
				bodyContent.clearBody();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// ����BodyTagSupport.EVAL_BODY_AGAIN���ٴε��ñ�����
			return BodyTagSupport.EVAL_BODY_AGAIN;
		}
		// ����BodyTagSupport.SKIP_BODY�����ٵ��ñ�����
		return BodyTagSupport.SKIP_BODY;
	}
}
