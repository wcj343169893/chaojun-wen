<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帖子</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script src="js/common.js" type="text/javascript"></script>
</head>
<body>
<div class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>
			<!-- *************网站导航地图************* -->
			<div class="wrap">
				<DIV class=pages_btns>
					<DIV class=pages >
						&nbsp;第1/1页&nbsp;&nbsp;『首页』&nbsp;&nbsp;
						『<span onclick="alert('上一页')">上一页</span>』&nbsp;&nbsp;『<span>下一页</span>』&nbsp;&nbsp;『尾页』&nbsp;&nbsp;
						<input type="text" style="width: 20px" />
						<input type="button"
								style="width: 26px; height: 20px; border: 0px; background-image: url(img/go.gif);"
								value="GO" />
					</DIV>
					<c:if test="${!empty users}">
					<SPAN class=postbtn id=newspecial
						onmouseover="$('newspecial').id = 'newspecialtmp';this.id = 'newspecial';showMenu(this.id)"><A
						title=参与竞价
						href="addNote.jsp?mCd=${param.mCd }&cmCd=${param.cmCd }"><IMG
								alt=发布新贴 src="img/newtopic.gif">
					</A> </SPAN></c:if>
				</DIV>
				<DIV class="mainbox threadlist">
					<H1>
						<A class=bold href="#">${childModule.childModuleName }</A>
					</H1>
					<FORM name=moderate
						action=topicadmin.php?action=moderate&amp;fid=102 method=post>
						<INPUT type=hidden value=9f2ea0b1 name=formhash>
						<TABLE cellSpacing=0 cellPadding=0 summary=forum_102>
							<THEAD class=category>
								<TR>
									<TD class=folder>
										&nbsp;
									</TD>
									<TD class=icon>
										&nbsp;
									</TD>
									<TH>
										标题
									</TH>
									<TD class=author>
										作者
									</TD>
									<TD class=nums>
										回复/查看
									</TD>
									<TD class=lastpost>
										最后发表
									</TD>
								</TR>
							</THEAD>
							<c:if test="${empty noteDTOs}">
							<tbody>
								<tr>
									<td colspan="6">
									<div align="center">暂无帖子</div>
									</td>
								</tr>
							</tbody>
							</c:if>
							<c:forEach items="${noteDTOs}" var="noteDTO">							
							<TBODY>
								<TR>
									<TD class=folder>
										<IMG alt=announcement src="img/folder_common.gif">
									</TD>
									<TD class=icon>
										&nbsp;
									</TD>
									<TH>
										<A
											href="showNote.do?noteCd=${noteDTO.note.noteCd}"><c:out value="${noteDTO.note.title}" /></A>
									</TH>
									<TD class=author>
										<CITE><A
											href="userDetailInit.do?userName=${noteDTO.note.user.userName}"><c:out value="${noteDTO.note.user.userName}" /></A>
										</CITE>
										<EM>${noteDTO.note.publishDate }</EM>
									</TD>
									<TD class=nums>
										${noteDTO.replayCount }/${noteDTO.note.point }
									</TD>
									<TD class=lastpost>
									<c:choose>
										<c:when test="${!empty noteDTO.lastFellowNote}">
												<CITE><A href="showNote.do?noteCd=${noteDTO.note.noteCd}">${fn:substring(noteDTO.lastFellowNote.flwContent,0,10) }</A>......<br/>
												${noteDTO.lastFellowNote.publishDate }</CITE>
										</c:when>
										<c:otherwise>
											暂无
										</c:otherwise>
									</c:choose>
									</TD>
								</TR>
							</TBODY>
								</c:forEach>
							</TABLE>
					</FORM>
				</DIV>
				<DIV class=pages_btns>
					<DIV class=pages>
						&nbsp;第1/1页&nbsp;&nbsp;『首页』&nbsp;&nbsp;
						『上一页』&nbsp;&nbsp;『下一页』&nbsp;&nbsp;『尾页』&nbsp;&nbsp;
						<input type="text" style="width: 20px" />
						&nbsp;&nbsp;GO&nbsp;
					</DIV>
						<c:if test="${!empty users}">
					<SPAN class=postbtn id=newspecial
						onmouseover="$('newspecial').id = 'newspecialtmp';this.id = 'newspecial';showMenu(this.id)"><A
						title=参与竞价
						href="addNote.jsp?mCd=${param.mCd }&cmCd=${param.cmCd }"><IMG
								alt=发布新贴 src="img/newtopic.gif">
					</A> </SPAN></c:if>
				</DIV>
			</div>
		</div>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
</body>
</html>