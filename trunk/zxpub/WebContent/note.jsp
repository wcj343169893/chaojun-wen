<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
<script src="js/common.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/jquery-1[1].2.1.pack.js"></script>
<script language="javascript" src="${pageContext.request.contextPath}/js/showPic.js"></script> 
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
				<FORM name=modactions method=post>
					<DIV class=pages_btns>
						<div class=pages>
							第1/1页『首页』 『上一页』『下一页』『尾页』『定价』
							<input type="text"
								style="width: 20px; border: 1px solid #999999;" />
							<input type="button"
								style="width: 26px; height: 20px; border: 0px; background-image: url(img/go.gif);"
								value="GO" />
						</div>
						<c:if test="${!empty users}">
						<SPAN class=replybtn><a href="#"><IMG alt="" src="img/reply.gif" border=0></a> </SPAN>
						</c:if>
					</DIV>
					<INPUT type=hidden value=6b487188 name=formhash>
					<DIV class="mainbox viewthread">
						<div id="div01" style="background-color: #83B733; width: 100%">
							<div id="01" style="float: left; width: 100%">
								<h1>
								<c:out value="${requestScope.note.title }" />	
								</h1>
							</div>
						</div>
						<TABLE id=pid1556509 cellSpacing=0 cellPadding=0
							summary=pid1556509>
							<TBODY>
								<TR>
									<TD class=postauthor>
										<CITE><A class=dropmenu id=userinfo1556509
											onmouseover=showMenu(this.id)
											href="http://bbs.thec.cn/space.php?uid=77624"><c:out value="${requestScope.note.user.userName }" />	</A>
										</CITE>
										<DIV class=avatar>
											<img height=95 alt="" src="head/${requestScope.note.user.photoPath }" width=95 border=0>
										</DIV>
											<div id="large" style="width: 140px;height: 140px"></div>
										<P>
											<EM>版主</EM>
										</P>
										<P class=customstatus>
											<c:out value="${requestScope.note.module.user.userName }" />
										</P>
										<DL class=profile>
											<DT>
												UID
											</DT>
											<DD>
												${requestScope.note.user.userCd }&nbsp;
											</DD>
											<DT>
												帖子
											</DT>
											<DD>
												1233&nbsp;
											</DD>
											<DT>
												积分
											</DT>
											<DD>
												3471&nbsp;
											</DD>
											<DT>
												注册时间
											</DT>
											<DD>
												${requestScope.note.user.registDate }&nbsp;
											</DD>
											<DT>
												最后登录
											</DT>
											<DD>
												${requestScope.note.user.lastLoginDate }&nbsp;
											</DD>
										</DL>
									</TD>
									<TD class=postcontent>
										<DIV class=postinfo>
										<fmt:formatDate value="${requestScope.note.publishDate}" var="pd" pattern="yyyy-MM-dd HH:mm:ss"/>
											<STRONG id=postnum1556661 title=复制帖子链接到剪贴板
												onclick="setcopy('http://bbs.thec.cn/viewthread.php?tid=382348&amp;page=1#pid1556661', '帖子链接已经复制到剪贴板')"></STRONG>
											发表于 ${pd }&nbsp;
										</DIV>
										<DIV id=ad_thread2_0></DIV>
										<DIV class="postmessage defaultpost">
											<DIV id=ad_thread3_0></DIV>
											<DIV id=ad_thread4_0></DIV>
											<H2>
												<c:out value="${requestScope.note.title }" />
											</H2>
											<DIV class=t_msgfont id=postmessage_1556509>
												<c:out value="${requestScope.note.content }" />
											</DIV>
										</DIV>
										<DIV></DIV>
									</TD>
								</TR>
								<TR>
									<TD class=postauthor>
										<DIV class="popupmenu_popup userinfopanel"
											id=userinfo1556509_menu style="DISPLAY: none">
											<DL>
												<DT>
													UID
												</DT>
												<DD>
													77624&nbsp;
												</DD>
												<DT>
													威望
												</DT>
												<DD>
													1667 &nbsp;
												</DD>
											</DL>
											<P>
												<A
													href="http://bbs.thec.cn/space.php?action=viewpro&amp;uid=77624"
													target=_blank>查看详细资料</A>
											</P>
										</DIV>
									</TD>
									<TD class=postcontent>
										<DIV class=postactions>
											<DIV id=ad_thread1_0></DIV>
										</DIV>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</DIV>
					<DIV class="mainbox viewthread">
						<TABLE id=pid1556661 cellSpacing=0 cellPadding=0
							summary=pid1556661>
							<TBODY>
								<TR>
									<TD class=postauthor>
										<CITE><A class=dropmenu id=userinfo1556661
											onmouseover=showMenu(this.id)
											href="http://bbs.thec.cn/space.php?uid=88014" target=_blank>newname</A>
										</CITE>
										<DIV class=avatar>
											<IMG height=120 alt="" src="img/88014.jpg" width=117 border=0>
										</DIV>
										<P class=customstatus>
											小虫博客
										</P>
										<DL class=profile>
											<DT>
												UID
											</DT>
											<DD>
												88014&nbsp;
											</DD>
											<DT>
												帖子
											</DT>
											<DD>
												326&nbsp;
											</DD>
											<DT>
												积分
											</DT>
											<DD>
												423&nbsp;
											</DD>
											<DT>
												注册时间
											</DT>
											<DD>
												2007-9-20&nbsp;
											</DD>
											<DT>
												最后登录
											</DT>
											<DD>
												2009-2-14&nbsp;
											</DD>
										</DL>

									</TD>
									<TD class=postcontent>
										<DIV class=postinfo>
											<STRONG id=postnum1556661 title=复制帖子链接到剪贴板
												onclick="setcopy('http://bbs.thec.cn/viewthread.php?tid=382348&amp;page=1#pid1556661', '帖子链接已经复制到剪贴板')"></STRONG>
											发表于 2008-6-26 00:47
										</DIV>
										<DIV id=ad_thread2_1></DIV>
										<DIV class="postmessage defaultpost">
											<DIV id=ad_thread3_1></DIV>
											<DIV id=ad_thread4_1></DIV>
											<DIV class=t_msgfont id=postmessage_1556661>
												我也不太清楚！
												<BR>
													你还是去问Google好了!! 
											</DIV>
										</DIV>
										<DIV></DIV>
									</TD>
								</TR>
								<TR>
									<TD class=postauthor>
										<DIV class="popupmenu_popup userinfopanel"
											id=userinfo1556661_menu style="DISPLAY: none">
											<DL>
												<DT>
													UID
												</DT>
												<DD>
													88014&nbsp;
												</DD>
												<DT>
													威望
												</DT>
												<DD>
													339 &nbsp;
												</DD>
												<DT>
													性别
												</DT>
												<DD>
													男&nbsp;
												</DD>
											</DL>
											<P>
												<A
													href="http://bbs.thec.cn/space.php?action=viewpro&amp;uid=88014"
													target=_blank>查看详细资料</A>
											</P>
										</DIV>
									</TD>
									<TD class=postcontent>
										<DIV class=postactions>
											<DIV id=ad_thread1_1></DIV>
										</DIV>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</DIV>

					<DIV class=pages_btns>
						<div style="width: 800px; height: 30px;">
							第1/1页『首页』 『上一页』『下一页』『尾页』『定价』
							<input type="text"
								style="width: 20px; border: 1px solid #999999;" />
							<input type="button"
								style="width: 26px; height: 20px; border: 0px; background-image: url(img/go.gif);"
								value="GO" />
						</div>
						<SPAN class=replybtn><IMG alt="" src="img/reply.gif" border=0></A> </SPAN>
					</DIV>
				</FORM>
			</div>
		</div>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->

</body>
</html>