<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>足下论坛主页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
</head>
<body>
<DIV class=wrap><!-- *************头************* --> <iframe
	width=100% height=109px src="head.jsp" frameborder=0> </iframe> <!-- *************头************* -->
<!-- *************网站导航地图************* --> <iframe width=100% height=48px
	src="navigation.jsp" frameborder=0 scrolling="no"> </iframe> <!-- *************网站导航地图************* -->
<DIV id=ad_text></DIV>
<TABLE class=portalbox cellSpacing=1 cellPadding=0 summary=HeadBox>
	<TBODY>
		<TR></TR>
	</TBODY>
</TABLE>
<DIV class="mainbox forumlist"><c:forEach items="${moduleDTOList}"
	var="moduleDTO">
	<SPAN class=headactions> 
		<c:if test="${users.roleCd==1}">
			<a href="addChildModule.jsp?mCd=${moduleDTO.module.moduleCd }">新增子模块</a>
		</c:if>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分区版主: <A class=notabs
		href="userDetailInit.do?userName=${moduleDTO.module.user.userName }">${moduleDTO.module.user.userName
	}</A> </SPAN>
	<H3>■${moduleDTO.module.moduleName }</H3>
	<TABLE id=category_73 cellSpacing=0 cellPadding=0 summary=category73>
		<THEAD class=category>
			<TR>
				<TH>版块</TH>
				<TD class=nums>主题</TD>
				<TD class=nums>帖数</TD>
				<TD class=lastpost>最后发表</TD>
					<c:if test="${!empty users}">
					<c:if test="${users.roleCd==1}">
						<TD>操作</TD>
					</c:if>
				</c:if>
			</TR>
		</THEAD>
		<c:forEach items="${moduleDTO.childModuleDTOList}" var="childModuleDTO">
			<TBODY id=forum102>
				<TR>
					<TH class=new>
					<H2><A
						href="noteBrowseInit.do?mCd=${moduleDTO.module.moduleCd }&cmCd=${childModuleDTO.childModule.childModuleCd }&p=1">${childModuleDTO.childModule.childModuleName
					}</A><EM> (今日: ${childModuleDTO.todayCount })</EM></H2>
					<P>${childModuleDTO.childModule.moduleComment }</P>
					<P class=moderators>版主: <A class=notabs
						href="userDetailInit.do?userName=${childModuleDTO.childModule.user.userName}"><c:out
						value="${childModuleDTO.childModule.user.userName}"></c:out></A>,</P>
					</TH>
					<TD class=nums><c:out value="${childModuleDTO.noteCount }"></c:out></TD>
					<TD class=nums><c:out value="${childModuleDTO.noteCount+childModuleDTO.fellowNoteCount}"></c:out>
					</TD>
					<TD class=lastpost><c:choose>
						<c:when test="${childModuleDTO.noteCount>0 }">
							<fmt:formatDate value="${childModuleDTO.lastNote.publishDate}" var="publishDate" pattern="yyyy-MM-dd HH:mm:ss"/>
								<A href="noteDetailInit.do?noteCd=${childModuleDTO.lastNote.noteCd }">${childModuleDTO.lastNote.title
								}</A>
								<CITE>by <A
									href="userDetailInit.do?userName=${childModuleDTO.lastNote.user.userName }">${childModuleDTO.lastNote.user.userName
								}</A> ${publishDate }</CITE>
						</c:when>
						<c:otherwise>
									此版块暂无帖子
									<c:if test="${!empty users}">
								<a
									href="addNote.jsp?mCd=${moduleDTO.module.moduleCd }&cmCd=${childModuleDTO.childModule.childModuleCd }">点此发表</a>
							</c:if>
						</c:otherwise>
					</c:choose></TD>
					<c:choose>
						<c:when test="${users.userName==childModuleDTO.childModule.user.userName}">
							<td><a href="childModule!editInit.action?cmCd=${childModuleDTO.childModule.childModuleCd }">修改</a>&nbsp;&nbsp;&nbsp;
							<a href="childModule!delete.action?cmCd=${childModuleDTO.childModule.childModuleCd }&uCd=${users.userCd }">删除</a></td>
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