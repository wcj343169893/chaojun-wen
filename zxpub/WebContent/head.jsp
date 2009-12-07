<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
	<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<link href="css/menu.css" rel="stylesheet" type="text/css">
	<style type="text/css">
		.indentmenu ul {
			margin: 0;
			padding: 0;
			float: left;
			width: 100%;
			border: 0px solid #564c66;
			border-width: 0px 0;
			background: green url(${pageContext.request.contextPath}/img/title.JPG)
				center center repeat-x;
		}
		.indentmenu ul li a:hover,.indentmenu ul li .current {
			text-decoration:none;
			color: white !important; 
			padding-top: 6px; 
			padding-bottom: 4px;
			background: black url(${pageContext.request.contextPath}/img/title2.JPG)
				center center repeat-x;
		}
	</style>
</head>
<!-- 在父级窗口显示 -->
<base target="_parent">
<body>
<!-- *************头************* -->
<div class=head><span><b><font size="5" face=华文彩云
	color=#ffffff>足下软件论坛 </font> </b> </span></div>
<div class="indentmenu">
<ul>
<c:choose>
		<c:when test="${empty users}">
			<LI id=memcp><A href="login.jsp">登录</A></LI>
			<LI id=memcp><a href="preRegist.jsp">注册</a></LI>
			<LI id=memcp><A href="welcome.jsp">首页</A></LI>
		</c:when>
		<c:otherwise>
			<LI id=memcp><A href="">搜索</A></LI>
			<LI id=memcp><A href="">积分管理</A></LI>
			<LI id=memcp><A href="editPWD.jsp">修改密码</A></LI>
			<LI id=memcp><A href="editUser.jsp">个人信息编辑</A></LI>
			<LI id=memcp><A href="login!out.do">退出</A></LI>
			<LI id=memcp><A href="welcome.jsp">首页</A></LI>
			<LI id=memcp><CITE><A href="userDetailInit.do?userName=${users.userName }">${users.userName }</A> </CITE></LI>
			</c:otherwise>
	</c:choose>
</ul>
</div>
</body>
</html>