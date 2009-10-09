<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 演示通过param和paramValues输出请求参数，该参数是在elDemoRequest.jsp页面上提交过来的 -->
名字：${param.firstName }<br>
姓氏：${param.lastName}<br>
爱好：${paramValues.hobbies[0]}${paramValues.hobbies[1]}${paramValues.hobbies[2]}${paramValues.hobbies[3]}
<br>
<%
	// 设置请求的字符集;如果这里不设置,传递过来的中文将可能出现乱码;
	request.setCharacterEncoding("UTF-8");
	// 用java内嵌代码输出request中存放的值;
	out.println(request.getAttribute("requestKey"));
	out.println("(由java内嵌代码输出)");
	out.println("<br>");
	// 用java内嵌代码输出session中存放的值;
	out.println(session.getAttribute("sessionKey"));
	out.println("(由java内嵌代码输出)");
	out.println("<br>");
	// 用java内嵌代码输出application中存放的值;
	out.println(application.getAttribute("applicationKey"));
	out.println("(由java内嵌代码输出)");
%>
<br>
<!-- 用EL表达式输出requestScope中存放的值; -->
${requestScope.requestKey }&nbsp;(EL表达式输出)
<br>
<!-- 用EL表达式输出sessionScope中存放的值; -->
${sessionScope.sessionKey }&nbsp;(EL表达式输出)
<br>
<!-- 用EL表达式输出applicationScope中存放的值; -->
${applicationScope.applicationKey }&nbsp;(EL表达式输出)

<!-- 
	以下代码使用表单提交到本页面，提交后观察并思考上面输出的值的变化;
	另外工程中session失效时间设置为1分钟，等待一分钟之后再点击这个提交后观察有什么变化;
 -->
<form action="elDemoResponse2.jsp" method="get">
	<input type="submit" value="submit">
</form>
</body>
</html>