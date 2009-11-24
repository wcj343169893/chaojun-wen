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
	<script type="text/javascript">
		function clickusername(obj){
			var userName=obj;
			if (userName.value=="用户名") {
				userName.value="";
			}
		}
	</script>
</head>
<body>
<DIV id=foruminfo>
<DIV id=userinfo><c:choose>
	<c:when test="${empty users}">
		<DIV id=nav>
		<FORM action="login.action" method="post"><INPUT maxLength="40" size="15"
			value="用户名" name="user.userName"
			onclick="clickusername(this);" onblur="if(this.value==''){this.value='用户名'}" /> <INPUT
			type="password" size="10" name="password.password" /> <INPUT
			type="submit" value="登录" /></FORM>
		</DIV>
	</c:when>
	<c:otherwise>
		<P>您上次访问是在: <EM>2009-4-23 10:58</EM> &nbsp;</P>
		<DIV id=nav><A href="#">足下技术论坛</A> - <A href="#">XXXXXX</A> - <A
			href="#">XXXXXX</A></DIV>
	</c:otherwise>
</c:choose></DIV>
<DIV id=forumstats>
<P>今日: <EM>274</EM>, 昨日: <EM>966</EM>, 最高日: <EM>2595</EM> &nbsp;</P>
<P>主帖: <EM>262031</EM>, 跟帖: <EM>1139404</EM></P>
</DIV>
</DIV>
</body>
</html>