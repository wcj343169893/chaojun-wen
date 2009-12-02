<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
</head>
<body onkeydown="if(event.keyCode==27) return false;"><DIV class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>			
			<!-- *************网站导航地图************* -->
			<DIV id=ad_text></DIV>
			<TABLE class=portalbox cellSpacing=1 cellPadding=0 summary=HeadBox>
				<TBODY>
					<TR></TR>
				</TBODY>
			</TABLE>
			<DIV class="mainbox forumlist">
				<SPAN class=headactions>
				<c:choose>
					<c:when test="${!empty users}">
				<a href="addChildModule.jsp">新增子模块</a>
					</c:when>
				</c:choose>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分区版主: <A class=notabs href="">lx7903</A>,
					<A class=notabs href="http://bbs.thec.cn/space.php?username=zyawen">zyawen</A>
				</SPAN>
				<c:forEach items="${modules_db}" var="module">					
				<H3>
					<A href="module.jsp?mCd=${module.moduleCd }">■${module.moduleName }</A>
				</H3>
				<TABLE id=category_73 cellSpacing=0 cellPadding=0 summary=category73>
					<THEAD class=category>
						<TR>
							<TH>
								版块
							</TH>
							<TD class=nums>
								主题
							</TD>
							<TD class=nums>
								帖数
							</TD>
							<TD class=lastpost>
								最后发表
							</TD>
						<c:choose>
						<c:when test="${!empty users}">
								<TD>
									操作
								</TD>
						</c:when>
						</c:choose>
						</TR>
					</THEAD>
					<c:forEach items="${module.childModule}" var="childModule">
						
					<TBODY id=forum102>
						<TR>
							<TH class=new>
								<H2>
									<A href="childModule.do?mCd=${module.moduleCd }&cmCd=${childModule.childModuleCd }">${childModule.childModuleName }</A><EM>
										(今日: 53)</EM>
								</H2>
								<P>
									${childModule.moduleComment }
								</P>
								<P class=moderators>
									版主:
									<A class=notabs href="">btmir2</A>,
									<A class=notabs href="">wb0606</A>,
									<A class=notabs href="">wangziqi</A>,
									<A class=notabs href="">fqqk2007</A>
								</P>
							</TH>
							<TD class=nums>
								22258
							</TD>
							<TD class=nums>
								125130
							</TD>
							<TD class=lastpost>
								<A
									href="http://bbs.thec.cn/redirect.php? tid=437115&amp;goto=lastpost#lastpost">方案
									...</A>
								<CITE>by <A
									href="http://bbs.thec.cn/space.php?username=%B2%DD% BD%E6">草芥</A>
									- 2009-4-23 12:30</CITE>
							</TD>
							<c:choose>
							<c:when test="${!empty users}">
								<td>
									<a href="子模块修改.html" target="blank">修改</a>&nbsp;&nbsp;&nbsp;
									<a>删除</a>
								</td>
							</c:when>
							</c:choose>
							
						</TR>
					</TBODY>				
					</c:forEach>
				</TABLE>
				</c:forEach>
			</DIV>
			<DIV id=ad_intercat_73></DIV>
			<DIV id=ad_intercat_2></DIV>
			<DIV id=ad_intercat_11></DIV>
			<DIV id=ad_intercat_6></DIV>

			<DIV id=ad_intercat_19></DIV>



			<UL class=popupmenu_popup id=creditlist_menu style="DISPLAY: none">
				<LI>
					积分: 2
				<LI>
					威望: 0
				<LI>
					银币: 0 个
				</LI>
			</UL>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->

		</DIV>


</body>
</html>