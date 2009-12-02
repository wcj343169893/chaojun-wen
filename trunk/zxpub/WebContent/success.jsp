<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息提交成功</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<base target="_parent">
</head>
<body>
<DIV id=append_parent></DIV>
<DIV id=ajaxwaitid></DIV>
<DIV class=wrap><!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->

<DIV id=nav></DIV>
	<DIV class="box message">
	<center>
	<H1>提示信息</H1>
	</center>
	<center>
	<P class="STYLE2"><span class="STYLE3">信息提交成功！</span></P>
	</center>
	<center><input type="button" value="确 定"
		style="height: 20px; width: 40px; font-size: 10px" onclick="javascript:window.location.href='welcome.jsp'"></center>
	</DIV>
	<!-- 尾 --> 
	<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
	</iframe> 
	<!-- 尾 -->
</DIV>


</body>
</html>