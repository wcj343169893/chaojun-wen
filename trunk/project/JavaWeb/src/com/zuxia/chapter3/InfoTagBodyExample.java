/**
 *******************************************************************************
 * InfoTagBodyExample.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  演示通过继承BodyTagSupport开发循环显示的标签
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter3;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * 演示通过继承BodyTagSupport开发循环显示的标签
 * 
 * 
 * @author 杨砚
 */
public class InfoTagBodyExample extends BodyTagSupport {

	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName = null;
	int count = 0;

	/**
	 * userName属性的set方法<br>
	 * 如果使用该标签时设定了userName属性，该方法会被自动调用。
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * count属性的set方法
	 * 如果使用该标签时设定了count属性，该方法会被自动调用。
	 * 
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * （重写方法）重写父类的doStartTag方法，实现循环打印标签的userName属性<br>
	 * doStartTag()方法是遇到标签开始时会呼叫的方法。<br>
	 * 
	 * 
	 * @return 其常用的返回值是BodyTagSupport.EVAL_BODY_BUFFERED、<br>
	 *         BodyTagSupport.EVAL_BODY_INCLUDE与BodyTagSupport.SKIP_BODY这三个。<br>
	 *         其中BodyTagSupport.EVAL_BODY_INCLUDE表示处理完标签后继续执行后面的JSP网页(或后续方法， 如<br>
	 *         doAfterBody等方法)，BodyTagSupport.SKIP_BODY表示不处理后面的JSP网页(或后续方法,<br>
	 *         如doAfterBody方法)。 而BodyTagSupport.EVAL_BODY_BUFFERED<br>
	 *         大体上与BodyTagSupport.EVAL_BODY_INCLUDE相同，但BodyTagSupport.<br>
	 *         EVAL_BODY_BUFFERED多执行了setBodyContent(BodyContent arg0)方法，<br>
	 *         因此只有返回BodyTagSupport.EVAL_BODY_BUFFERED，才能在后续的doAfterBody()<br>
	 *         方法中得到BodyContent的实例。<br>
	 * 
	 * @throws JspException
	 */
	@Override
	public int doStartTag() throws JspException {
		// 通过内置的pageContext对象获取JspWriter，用于向页面打印输出内容;
		JspWriter jspWriter = this.pageContext.getOut();
		int countValue = this.count;
		// 通过标签的count循环打印userName属性;这里的count即为循环打印的次数
		while (countValue-- >= 1) {
			try {
				// 打印标签的userName属性，这里没有办法取得标签间文字，所以只能打印标签属性。
				// 要打印标签间文字，请参照doAfterBody()方法。
				jspWriter.println(userName + "<br>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 返回BodyTagSupport.EVAL_BODY_BUFFERED，关于返回值详请见方法注释。
		return BodyTagSupport.EVAL_BODY_BUFFERED;
	}

	/**
	 * （重写方法） 重写父类的doAfterBody方法。实现循环打印标签间文字内容及标签的userName属性。<br>
	 * 这个方法是在解析完标签间文字之后被自动调用的。<br>
	 * 该方法被调用的前提是doStartTag()方法的返回值不能是BodyTagSupport.SKIP_BODY。<br>
	 * 如果doStartTag()方法的返回值是BodyTagSupport.SKIP_BODY，本方法将不会被调用。<br>
	 * 如果doStartTag()方法的返回值是BodyTagSupport.EVAL_BODY_INCLUDE，本方法将被调用，<br>
	 * 但在本方法体中取不到BodyContent的实例(取出来是null)。<br>
	 * 如果doStartTag()方法的返回值是BodyTagSupport.EVAL_BODY_BUFFERED，本方法将被调用，<br>
	 * 并且在本方法体中能够获得BodyContent的实例，通过这个实例我们可以获取、改变、输出标签间文字。<br>
	 * 
	 * 
	 * @return 常用返回值包括BodyTagSupport.EVAL_BODY_AGAIN、BodyTagSupport.SKIP_BODY;<br>
	 *         如果返回BodyTagSupport.EVAL_BODY_AGAIN将再次调用doAfterBody()方法。如果返回<br>
	 *         BodyTagSupport.SKIP_BODY将彻底结束doAfterBody方法。因此我们在该方法中至少得有一句代码<br>
	 *         返回BodyTagSupport.SKIP_BODY，否则将成为死循环。<br>
	 * @throws JspException
	 */
	@Override
	public int doAfterBody() throws JspException {
		// 如果count大于等于1，将进行递归调用
		if (this.count-- >= 1) {
			try {
				// 通过内置bodyContent实例获取JspWriter实例
				JspWriter out = this.bodyContent.getEnclosingWriter();
				// 向客户端打印输出标签间文字内容及标签的userName属性
				out.println(this.bodyContent.getString() + userName);
				// 清空存储的标签体处理结果，否则再次使用this.bodyContent.getString()将是每次处理结果之和
				bodyContent.clearBody();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 返回BodyTagSupport.EVAL_BODY_AGAIN将再次调用本方法
			return BodyTagSupport.EVAL_BODY_AGAIN;
		}
		// 返回BodyTagSupport.SKIP_BODY将不再调用本方法
		return BodyTagSupport.SKIP_BODY;
	}
}
