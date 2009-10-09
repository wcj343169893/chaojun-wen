<%-- 设置页面属性、编码和字符集 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<html>
<head>
<%-- 设置页面属性和字符集 ，注意这里是一个辅助设置，不写也可以--%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
请输入名字和姓氏然后点击提交
<!-- 这里将提交到elDemoResponse.jsp -->
<form action="elDemoResponse.jsp" method="post">
	名字
	<input type="text" name="firstName">
	姓氏
	<input type="text" name="lastName" >
	
	<input type="submit" value="submit">
	<br>
	<%
	// 通过内嵌java代码将web.xml中配置的servlet容器的初始化参数取出并打印到返回页面上;
	out.print(application.getInitParameter("yoyoServletContextInit"));
	out.println("&nbsp;");
	out.println("(由java内嵌代码输出)");
	out.println("<br>");
	// 将web.xml中配置的elDemoRequestJspServlet的初始化参数取出并打印到页面上;
	out.println(config.getInitParameter("jspinit"));
	out.println("&nbsp;");
	out.println("(由java内嵌代码输出)");
	%>
	<br>
	<!-- 通过EL表达式将web.xml中配置的servlet容器的初始化参数取出并打印到返回页面上; -->
	${initParam.yoyoServletContextInit }&nbsp;(由EL表达式输出)
	<br>
	<!-- 我们没有办法使用EL表达式将web.xml中配置的elDemoRequestJspServlet的初始化参数取出 -->
	
	
	<%pageContext.setAttribute("pageTemp", "page中存的值"); %>
	${pageTemp}&nbsp;(EL表达式输出)
	<br>
	<%=pageContext.getAttribute("pageTemp") %>&nbsp;(java内置表达式输出，注意这里使用java内置表达式与前面使用java内嵌代码输出使用上的区别)
	<br>
	<%
		out.println("路径演示开始");
		out.println("<br>");
		out.println("contextPath: " + request.getContextPath());
		out.println("<br>");
		out.println("servletPath: " + request.getServletPath());
		out.println("<br>");
		out.println("realPath: " + application.getRealPath(request.getRequestURI()));
		out.println("<br>");
		out.println("applicationRealPath: " + application.getRealPath("/"));
		out.println("<br>");
		out.println("路径演示结束");
		
		out.println("<br>");
		// 演示读取WebContent下的文件
		String applicationRealPath = application.getRealPath("/");
		FileReader fileReader = new FileReader(applicationRealPath + "/text/a.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String value = bufferedReader.readLine(); 
		while(value != null){
			out.println(value);
			out.println("<br>");
			value = bufferedReader.readLine();
		}
		bufferedReader.close();
		fileReader.close();
	%>
	
	<br>
	爱好<br>
	足球&nbsp;&nbsp;&nbsp;&nbsp;<input type=checkbox name="hobbies" value="足球" ><br>
	篮球&nbsp;&nbsp;&nbsp;&nbsp;<input type=checkbox name="hobbies" value="篮球"><br>
	排球&nbsp;&nbsp;&nbsp;&nbsp;<input type=checkbox name="hobbies" value="排球"><br>
	羽毛球<input type=checkbox name="hobbies" value="羽毛球"><br>
</form>
</body>
</html>