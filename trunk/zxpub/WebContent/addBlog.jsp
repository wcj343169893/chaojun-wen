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
			<form action="addNote.do" method="post">
		
			<DIV class="mainbox formbox">
				<H1>
					发新话题
				</H1>
				<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
					<THEAD>
						<TR>
							<TH>
								用户名
							</TH>
							<TD>
								${users.userName }
								<A
									href="LogoutServlet">退出登录</A>]
							</TD>
						</TR>
					</THEAD>
					<TR>
						<TH style="BORDER-BOTTOM-WIDTH: 0px">
							<LABEL for=subject>
								标题
							</LABEL>
						</TH>
						<TD style="BORDER-BOTTOM-WIDTH: 0px">
							<input id=subject tabindex=3 size=45 name="note.title">
						</TD>
					</TR>
					<TR>
						<TH vAlign=top>
							<LABEL for=posteditor_textarea>
								内容
							</LABEL>
						</TH>
						<TD vAlign=top>
							<DIV id=posteditor>
								<TABLE class=editor_text style="TABLE-LAYOUT: fixed"
									cellSpacing=0 cellPadding=0 summary="Message Textarea">
									<TR>
										<TD>
											<TEXTAREA class=autosave id=posteditor_textarea
												style="WIDTH: 99%; HEIGHT: 250px" tabIndex=100 name="note.content"
												rows=10 cols=60></TEXTAREA>
										</TD>
									</TR>
								</TABLE>
								<DIV id=posteditor_bottom>
									<TABLE class=editor_button style="BORDER-TOP-STYLE: none"
										cellSpacing=0 cellPadding=0 summary="Enitor Buttons">
									</TABLE>
								</DIV>
							</DIV>
						</TD>
					</TR>
					<TR class=btns>
						<TH>
							&nbsp;


						</TH>
						<TD>

							<BUTTON id=postsubmit tabIndex=300 type=submit
								value="true">
								发新话题
							</BUTTON>
						</TD>
					</TR>
				</TABLE>
			</DIV>
			<BR>
			</FORM>
			<!-- 尾 -->
			<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
			</iframe>
			<!-- 尾 -->
		</DIV>
</body>
</html>