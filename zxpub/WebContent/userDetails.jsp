<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详细信息</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1[1].2.1.pack.js"></script>
<script language="javascript" src="${pageContext.request.contextPath}/js/showPic.js"></script> 
</head>
<body><DIV class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>
			<!-- *************网站导航地图************* -->
			<DIV class="wrap">
				<form method="post" name="register"
					action="register.php?regsubmit=yes"
					onsubmit="this.regsubmit.disabled=true;">
					<DIV class="mainbox formbox">
						<SPAN class=headactions><A href="个人贴子浏览后.html"
							target=_blank>该用户的所有帖子</A> </SPAN>
						<h1>
							用户${users.userName }的个人信息
						</h1>
						<table cellspacing="0" cellpadding="0">
							<thead>
								<tr>
									<th>
										个人基本信息
									</th>
									<td>
										&nbsp;

									</td>
								</tr>
							</thead>
							<tr>
								<th>
									<label for="username">
										用户名 *
									</label>
								</th>
								<td>
									${users.userName }
									<span id="checkusername">&nbsp;</span>
								</td>
								
							</tr>

							<tr>
								<th>
									性别
								</th>
								<td>
									${users.sex }
								</td>
							</tr>
							<tr>
								<td>
									<label for="email">
										Email *
									</label>
								</td>
								<td>
									${users.email }
								</td>
							</tr>
						</table>

						<table cellspacing="0" cellpadding="0" id="adv">
							<thead>
								<tr>
									<th>
										扩展信息
									</th>
									<td>
										&nbsp;

									</td>
								</tr>
							</thead>
							<tr>
								<th>
									<label for="bday">
										头像
									</label>
								</th>
								<td>
								<img id="head" width="70" height="70" src="${pageContext.request.contextPath}/head/${users.photoPath}">	
								<div id="large" style="width: 140px;height: 140px"></div>	
								</td>
							</tr>
							<tr>
								<th>
									<label for="bday">
										生日
									</label>
								</th>
								<td>
								<fmt:formatDate var="birth" pattern="yyyy-MM-dd" value="${users.birthday}"></fmt:formatDate>
								${birth }
								</td>
							</tr>

							<tr>
								<th>
									<label for="province">
										省
									</label>
								</th>
								<td>
									${users.province.provinceCd}
								</td>
							</tr>
							<tr>
								<th>
									<label for="city">
										市
									</label>
								</th>
								<td>
									${users.city.cityCd }
								</td>
							</tr>
							<tr>
								<th valign="top">
									<label for="bio">
										个人说明
									</label>
								</th>
								<td>
									${users.comment }
								</td>
							</tr>

							<tr>
								<th>
									<button class="submit" type="button" Name="xiugaigerenxinxi" onclick="javascript:window.location.href='editUser.jsp'" value="true"
										tabindex="100">
										修改个人 信息
									</button>
								</th>
								<td>
									<button class="submit" type="button" Name="fanhui" value="true" onclick="javascript:window.location.href='welcome.jsp'"
										tabindex="100">
										返回主页
									</button>
								</td>
							</tr>
						</table>
					</DIV>
				</form>
		</DIV>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
		</DIV>
</body>
</html>