<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
</head>
<body onkeydown=
	if (event.keyCode == 27)
		return false;;
>
<DIV class=wrap><!-- *************头************* --> <iframe
	width=100% height=109px src="head.jsp" frameborder=0> </iframe> <!-- *************头************* -->
<!-- *************网站导航地图************* --> <iframe width=100% height=48px
	src="navigation.jsp" frameborder=0> </iframe> <!-- *************网站导航地图************* -->
<DIV id=ad_text></DIV>
<TABLE class=portalbox cellSpacing=1 cellPadding=0 summary=HeadBox>
	<TBODY>
		<TR></TR>
	</TBODY>
</TABLE>
<DIV class="mainbox forumlist"><c:forEach items="${modules_db}"
	var="module">
	<SPAN class=headactions> <c:choose>
		<c:when test="${users.roleCd==1}">
			<a href="addChildModule.jsp">新增子模块</a>
		</c:when>
	</c:choose> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分区版主: <A class=notabs
		href="userDetailInit.do?userName=${module.user.userName }">${module.user.userName
	}</A> </SPAN>
	<H3>■${module.moduleName }</H3>
	<TABLE id=category_73 cellSpacing=0 cellPadding=0 summary=category73>
		<THEAD class=category>
			<TR>
				<TH>版块</TH>
				<TD class=nums>主题</TD>
				<TD class=nums>帖数</TD>
				<TD class=lastpost>最后发表</TD>
				<c:choose>
					<c:when test="${!empty users}">
						<TD>操作</TD>
					</c:when>
				</c:choose>
			</TR>
		</THEAD>
		<c:forEach items="${module.childModule}" var="childModule">
			<c:set value="${fn:length(childModule.notes) }" var="noteslength"></c:set>
			<c:set value="${fn:length(childModule.fellowNotes)}"
				var="fellowslength"></c:set>
			<TBODY id=forum102>
				<TR>
					<TH class=new>
					<H2><A
						href="childModule.do?mCd=${module.moduleCd }&cmCd=${childModule.childModuleCd }">${childModule.childModuleName
					}</A><EM> (今日: 53)</EM></H2>
					<P>${childModule.moduleComment }</P>
					<P class=moderators>版主: <A class=notabs
						href="userDetailInit.do?userName=${childModule.user.userName}"><c:out
						value="${childModule.user.userName}"></c:out></A>,</P>
					</TH>
					<TD class=nums><c:out value="${noteslength }"></c:out></TD>
					<TD class=nums><c:out value="${noteslength+fellowslength }"></c:out>
					</TD>
					<TD class=lastpost><c:choose>
						<c:when test="${noteslength>0 }">
							<c:forEach items="${childModule.notes}" var="lastnote"
								begin="${noteslength-1}" end="${noteslength}">
								<A href="showNote.do?noteCd=${lastnote.noteCd }">${lastnote.title
								}</A>
								<CITE>by <A
									href="userDetailInit.do?userName=${lastnote.user.userName }">${lastnote.user.userName
								}</A> ${lastnote.publishDate }</CITE>
							</c:forEach>
						</c:when>
						<c:otherwise>
									此版块暂无帖子
									<c:if test="${!empty users}">
								<a
									href="addNote.jsp?mCd=${module.moduleCd }&cmCd=${childModule.childModuleCd }">点此发表</a>
							</c:if>
						</c:otherwise>
					</c:choose></TD>
					<c:choose>
						<c:when test="${users.userName==childModule.user.userName}">
							<td><a href="子模块修改.html" target="blank">修改</a>&nbsp;&nbsp;&nbsp;
							<a>删除</a></td>
						</c:when>
						<c:otherwise>
							<td>&nbsp;</td>
						</c:otherwise>
					</c:choose>

				</TR>
			</TBODY>
		</c:forEach>
	</TABLE>
</c:forEach></DIV>
<DIV id=ad_intercat_73></DIV>
<DIV id=ad_intercat_2></DIV>
<DIV id=ad_intercat_11></DIV>
<DIV id=ad_intercat_6></DIV>

<DIV id=ad_intercat_19></DIV>



<UL class=popupmenu_popup id=creditlist_menu style="DISPLAY: none">
	<LI>积分: 2
	<LI>威望: 0
	<LI>银币: 0 个</LI>
</UL>
<!-- 尾 --> <iframe width=100% height=113px src="cauda.jsp" frameborder=0>
</iframe> <!-- 尾 --></DIV>


</body>
</html>