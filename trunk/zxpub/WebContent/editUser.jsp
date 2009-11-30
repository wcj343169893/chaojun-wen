<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>足下软件论坛</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/setday.js"></script>
	<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/pro_city.js"></script>
</head>
<body onload="setProvince(${users.province.provinceCd }),setCity(${users.city.cityCd })">
		<DIV class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>
			<!-- *************网站导航地图************* -->
			<DIV class=container>
				<DIV>
					<FORM enctype="multipart/form-data" method="post" action="edituser.do" name=reg onSubmit="return validate(this)"
						method=post>
						<INPUT type=hidden value=5ff95e3e name=formhash>
						<DIV class="mainbox formbox">
							<H1>
								编辑个人资料
							</H1>

							<TABLE cellSpacing=0 cellPadding=0 summary=编辑个人资料>
								<TR>
									<TH>
										<LABEL for=bdaynew>
											生日
										</LABEL>
									</TH>
									<TD>
									<fmt:formatDate var="birth" pattern="yyyy-MM-dd" value="${users.birthday}"></fmt:formatDate>
										<input type="text" id="bday" name="editUserForm.birthday" size="25" onclick="setday(this)" value="${birth }"
											tabindex="10" /> 
									</TD>
								</TR>
								<TR>
									<TH>
										<LABEL for=email>
											Email
										</LABEL>
									</TH>
									<TD>
										<INPUT id=email value="${users.email }"
											onclick="showcalendar(event, this)" size=25
											name=editUserForm.email>
									</TD>
								</TR>
								<TR>
									<TH>
										<LABEL for=locationnew>
											省
										</LABEL>
									</TH>
									<TD>
										<select id="province" name="editUserForm.provinceCd"
			tabindex="20" onchange="setCity(0)"></select>
									</TD>
								</TR>
								<TR>
									<TH>
										<LABEL for=sitenew>
											市
										</LABEL>
									</TH>
									<TD>
										<select id="city" name="editUserForm.cityCd" tabindex="21"></select>
									</TD>
								</TR>
								<TR>
									<TH>
										<LABEL for=qqnew>
											用户头像
										</LABEL>
									</TH>
									<TD>
										<img alt="${users.userName }的头像" src="${pageContext.request.contextPath}/head/${users.photoPath}" width="40px" height="30px" > <INPUT name="editUserForm.photo" type="file">
									</TD>
								</TR>
								<TR>
									<TH>
										<LABEL for=taobaonew>
											自我介绍
										</LABEL>
									</TH>
									<td>
										<textarea rows="5" cols="30" id="bio" name="editUserForm.comment" tabindex="28"></textarea>
									</td>
								</TR>

								<TR>
									<TH>
										&nbsp;

									</TH>
									<TD>
										<BUTTON class=submit id=editsubmit name=editsubmit type=submit
											value="true">
											提交
										</BUTTON>
									</TD>
								</TR>
							</TABLE>
						</DIV>
					</FORM>
				</DIV>
			</DIV>
			<!-- 尾 -->
			<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
			</iframe>
			<!-- 尾 -->
		</DIV>
</body>
</html>