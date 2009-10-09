<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.zuxia.chapter1.Emp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%-- <c:out>标签用于在JSP中显示数据 --%>
<c:out value="一个输出标签事例" />
<br>
<c:out
	value="原样输出HTML代码<table border=&quot;1&quot;><tr><td></td></tr></table>" />
<br>
<c:out
	value="解析输出HTML代码<table border=&quot;1&quot;><tr><td></td></tr></table>"
	escapeXml="false" />
<br>

<%-- 用java内嵌代码实现设置变量 --%>
<%
	String name = "yangyan";
	pageContext.setAttribute("name", name);
%>
${pageScope.name }
<%-- 用不带标签体的标签实现设置变量 --%>
<c:set value="yoyo" var="name" scope="page" />
${pageScope.name }

<%-- 用带标签体的标签实现设置变量 --%>
<c:set var="name" scope="page">zuxia</c:set>
${pageScope.name }

<%-- 用java内嵌代码声明javaBean，并通过JSTL标签设置javaBean属性 --%>
<%!Emp empBean1 = new Emp();%>
<%
	pageContext.setAttribute("empBean1", empBean1);
%>
<c:set value="ename1Value" target="${empBean1}" property="ename" />
<c:out value="${empBean1.ename}" />

<%-- 用jsp的useBean指令声明javaBean，并通过JSTL标签设置javaBean属性 --%>
<jsp:useBean id="empBean2" class="com.zuxia.chapter1.Emp"
	scope="session" />
<c:set value="ename2Value" target="${empBean2}" property="ename" />
<c:out value="${empBean2.ename}" />


<%-- 通过JSTL标签删除变量 --%>
<c:remove var="name" scope="page" />
${pageScope.name }

<%-- 演示JSTL的异常处理标签 --%>
<c:catch var="error">
	<%
		int j = 1 / 0;
	%>
</c:catch>
${error }

<%-- 演示JSTL的if流程控制标签 --%>
<c:set var="age" value="18" />
<c:if test="${age >=18}">
		欢迎光临重庆足下
	</c:if>

<%-- 演示JSTL的choose、when、otherwise流程控制标签 --%>
<c:choose>
	<c:when test="${age == 18}">
			我今年18
		</c:when>
	<c:when test="${age == 19}">
			我今年19
		</c:when>
	<c:when test="${age == 19}">
			我今年19
		</c:when>
	<c:when test="${age == 19}">
			我今年19
		</c:when>
	<c:otherwise>
			我还没有成年
		</c:otherwise>
</c:choose>

<%-- 演示JSTL的forEach循环标签 --%>
<c:set var="aList" value="<%=new ArrayList<String>() %>" />
	<%
		List<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		pageContext.setAttribute("aList",aList);
	%>
<c:forEach items="${aList}" var="listValue">
	<c:out value="${listValue}" />
</c:forEach>
<br>

<%-- 演示JSTL的forEach循环标签(begin、end属性的用法) --%>
<c:forEach items="${aList}" var="listValue" begin="1" end="2">
	<c:out value="${listValue}" />
</c:forEach>

<%-- 演示JSTL的forTokens循环标签 --%>
<c:forTokens items="zhang:li:wang" delims=":" var="lastName">
	<c:out value="${lastName}" />
</c:forTokens>

<%-- 演示JSTL的导入标签 --%>
<c:import url="import.jsp" var="importJsp1" />
<c:out value="${importJsp1 }" escapeXml="false"/>

<%-- 演示JSTL的导入标签(将导入的内容放到变量中，该用法实用性不大) --%>
<c:import url="import.jsp" var="importJsp1" />

<%-- 演示JSTL的导入标签(用全路径导入) --%>
<c:import url="http://127.0.0.1:8081/JavaWeb/chapter2/elDemoRequest.jsp" />

<%-- 演示JSTL的URL标签，将一个jsp的路径放入到importUrl变量中，该用法实用性不大 --%>
<c:url var="importUrl" value="/chapter4/import/import2.jsp"></c:url>
<c:out value="${importUrl}"></c:out>
<a href="${importUrl}">link</a>

<%-- 演示JSTL的redirect标签，该标签和内嵌代码中response.sendRedirect()方法相同 --%>
<%--
<c:redirect url="/chapter4/import.jsp">
<c:param name="id" value="2"></c:param>
</c:redirect>
 --%>

<br>
演示国际化标签
<!-- 
	设置本地语言环境。该行代码实现了两件事情。
	1、将客户端浏览器的语言设置成了zh。(查看客户端浏览器语言可以通过在浏览器中点击工具-internet选项-语言-添加)
	2、如果将值设置为zh，则页面后面的message标签就会去找相应的zh后缀的properties文件
-->
<fmt:setLocale value="zh"/>
<!-- 设置客户端时区，通过该设置后，客户端将可以得到服务器端的时间，并且这个时间将被调整成客户端所在时区 -->
<fmt:setTimeZone value="GMT+14"/>
<!-- 
	使用bundle绑定到labels_zh.properties资源文件上，这种方式只对dundle标签体内部的message标签生效，
	如果有多个zh(或其他区域)的资源文件可以采用这种方式 
-->
<fmt:bundle basename="com.zuxia.chapter4.labels">
	<!-- 显示资源文件中的name对应的值 -->
	<fmt:message key="name" />
</fmt:bundle>

<!-- 使用setBundle绑定到labels_zh.properties资源文件上，这种方式对整个页面上的message标签生效，推荐采用这种方式 -->
<fmt:setBundle basename="com.zuxia.chapter4.labels"/>
<!-- 显示资源文件中的name对应的值 -->
<fmt:message key="name" />

<!-- 将数字转换成货币格式 -->
<fmt:formatNumber value="1000.888" type="currency" currencySymbol="$"/>
<!-- 按照指定格式显示时间和日期字符串 -->
<fmt:formatDate value="<%=new Date() %>" pattern="yyyy-MM-dd hh:mm:ss"/>
<!-- 将货币格式转换成数字显示 -->
<fmt:parseNumber value="$1000.88" type="currency" pattern="$" />
<!-- 将日期字符串转换成Date显示 -->
<fmt:parseDate value="1998-09-08" pattern="yyyy-MM-dd" var="datenow" />
</body>
</html>