<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 设置请求的字符集;如果这里不设置,传递过来的中文将可能出现乱码;
		request.setCharacterEncoding("UTF-8");
		// 通过java内嵌代码输出从上个页面(elDemoRequest.jsp)传递过来的firstName参数的值;
		out.println(request.getParameter("firstName"));
		// 通过java内嵌代码输出从上个页面(elDemoRequest.jsp)传递过来的firstName参数的值;
		out.println(request.getParameter("lastName"));
		// 在request中设置属性tantan,将其值设置为xiangxiang;
		request.setAttribute("requestKey","requestValue");
		// 在session中设置属性sessionKey,将其值设置为sessionValue;
		session.setAttribute("sessionKey","sessionValue");
		// 在application中设置属性applicationKey,将其值设置为applicationValue;
		application.setAttribute("applicationKey","applicationValue");
		// 请注意以上设置的requestKey、sessionKey、applicationKey这三个属性的名字和值是自己随便定义的，不是一定要写成事例中的名字和值;
	%>
	<!-- 
		地址栏不改变跳转--服务器跳转。
		执行到跳转语句后无条件立刻跳转--之后的代码不被执行。
		在跳转之前释放掉全部的资源。
		request设置的属性依然能保留在下一个页面。
	-->
	<jsp:forward page="elDemoResponse2.jsp"></jsp:forward>
	
	<!-- 
		地址栏改变跳转--客户端跳转。
		所有代码执行完毕之后再跳转。
		不能保存request属性--地址改变了。
		请分别执行这两中跳转比较区别。分别执行的时候不要注释，有的时候注释不太好使，直接删除掉其中一个。
	-->
	<%
		 // response.sendRedirect("elDemoResponse2.jsp");
	%>
	 
</body>
</html>