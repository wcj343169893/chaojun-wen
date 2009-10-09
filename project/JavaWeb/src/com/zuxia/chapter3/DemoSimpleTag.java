/**
 *******************************************************************************
 * DemoSimpleTag.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  演示使用SimpleTagSupport编写自定义标签类。<br>
 *  SimpleTagSupport类顾名思义，就是可以处理一些简单的自订标签需求，<br>
 *  它是在JSP 2.0之后新增的类别，对于一些简单的自订标签页求，<br>
 *  可以继承它来实作标签处理类别，而不用像TagSupport、<br>
 *  BodyTagSuppourt类一样处理回传值的问题。<br>
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter3;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 演示使用SimpleTagSupport编写自定义标签类。<br>
 * SimpleTagSupport类顾名思义，就是可以处理一些简单的自订标签需求，<br>
 * 它是在JSP 2.0之后新增的类别，对于一些简单的自订标签页求，<br>
 * 可以继承它来实作标签处理类别，而不用像TagSupport、<br>
 * BodyTagSuppourt类一样处理回传值的问题。<br>
 * 
 * @author 杨砚
 */
public class DemoSimpleTag extends SimpleTagSupport {
	private int num;

	/**
	 * num属性的set方法
	 * 
	 * @param num
	 *            the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * （重写方法）重写doTag()方法。实现将标签体中的内容循环输出。<br>
	 * doTag方法可以取得标签间文字。注意观察取标签间文字的方法。<br>
	 * 
	 * @throws JspException
	 * @throws IOException
	 */
	@Override
	public void doTag() throws JspException, IOException {
		// 打印该标签的num属性的值
		this.getJspContext().getOut().println(this.num);
		// 实例化一个StringWriter，用于存放标签间文字
		StringWriter stringWriter = new StringWriter();
		// 将标签间文字放入StringWriter
		this.getJspBody().invoke(stringWriter);
		// 获取标签间文字
		String bodyValue = stringWriter.toString();
		// 将标签间文字加上一串星号后输出到页面上
		this.getJspContext().getOut().println(bodyValue + "********");
		// 直接将标签间文字输出到页面上(这种方式实际上就是直接将标签间文字输出到页面上，<br>
		// 无法向上面的方式那样加上星号。)
		this.getJspBody().invoke(null);
	}
}
