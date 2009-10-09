/**
 *******************************************************************************
 * DisplayDate.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  演示通过继承TagSupport开发显示当前日期的自定义标签
 *＜作者＞
 *  杨砚
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
 * 演示通过继承TagSupport开发显示当前日期的自定义标签;<br>
 * TagSupport是实现IterationTag接口的具体类，因此我们一般不是去实现TagSupport接口，<br>
 * 而是去继承TagSupport类,并根据自己的需要重写doStartTag()、doEndTag()和doAfterBody()等方法。<br>
 * 另外TagSupport在代码中无法获取、修改、输出标签间文字，所以一般用来处理不带标签间文字的标签。<br>
 * 请注意上面提到的无法获取、修改、输出标签间文字是指在本类的代码中无法获取、修改、输出，<br>
 * 而在doStartTag()方法返回TagSupport.EVAL_BODY_INCLUDE时会将标签间文字输出到客户端页面上。<br>
 * 
 * @author 杨砚
 */
public class DisplayDate extends TagSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * （重写方法）重写父类的doStartTag方法，演示通过继承TagSupport开发显示当前日期的自定义标签<br>
	 * doStartTag()方法是遇到标签开始时会呼叫的方法。
	 * 
	 * 
	 * @return 合法的返回值是EVAL_BODY_INCLUDE与SKIP_BODY,<br>
	 *         前者表示将显示 标签间的文字，后者表示不显示标签间的文字；<br>
	 * @throws JspException
	 */
	@Override
	public int doStartTag() throws JspException {
		// 获取JspWriter实例用于向客户端页面打印输出
		JspWriter jspWriter = pageContext.getOut();
		// 实例化一个SimpleDateFormat用于格式化日期时间
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd Hh:mm:ss");
		// 实例化一个Date对象，这里将得到的是系统日期时间
		Date date = new Date();
		// 将系统日期时间的Date对象格式化成yyyy-MM-dd HH:mm:ss的字符串形式
		String dateString = simpleDateFormat.format(date);
		try {
			// 向客户端打印输出格式化后的日期时间字符串
			jspWriter.println(dateString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// EVAL_BODY_INCLUDE的意思是指输出标签间内容(即输出标签体)
		return TagSupport.EVAL_BODY_INCLUDE;
	}

	/**
	 * （重写方法）重写父类的doEndTag方法。<br>
	 * doEndTag()方法是在遇到标签结束时呼叫的方法;
	 * 
	 * 
	 * @return 常用的返回值是EVAL_PAGE与 SKIP_PAGE，<br>
	 *         前者表示处理完标签后继续执行以下的JSP网页，后者是表示不处理接下来的JSP网页<br>
	 * @throws JspException
	 */
	@Override
	public int doEndTag() throws JspException {
		return TagSupport.SKIP_PAGE;
	}

}
