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
<script type="text/javascript" src="fckeditor/fckconfig.js"></script>
<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
<style type="text/css">
#main {
	z-index: 0;
	width: 100%;
	height: 100%;
}

#middle {
	display: none;
	background-color: #cccccc;
	z-index: 1;
	height: 100%;
	width: 100%;
	left: 0px;
	top: 0px;
	filter: alpha(opacity = 50);
	position: absolute;
}

#show {
	display: none;
	width: 750px;
	height: 520px;
	position: absolute;
	z-index: 3;
	left: 200px;
	top: 200px;
}
</style>
<script type="text/javascript">
	function show() {
		document.getElementById("middle").style.display = "block";
		document.getElementById("show").style.display = "block";
	}
	function show1() {
		document.getElementById("middle").style.display = "none";
		document.getElementById("show").style.display = "none";
	}
</script>
<SCRIPT type=text/javascript>
	function clear1() {
		document.getElementById("posteditor_textarea").value = "";
	}
	function jiancha() {
		var obj = document.getElementById("posteditor_textarea").value;
		var mun1 = obj.length;
		var mun = (40000 - mun1) / 2;
		alert("您还可以输入" + parseInt(mun) + "个字");
	}
</SCRIPT>
<script type="text/javascript">
	function showFCK() {
		var oFCKeditor = new FCKeditor('posteditor_textarea');
		oFCKeditor.BasePath = '/zxpub/fckeditor/';
		oFCKeditor.ToolbarSet = 'Basic';
		oFCKeditor.Width = '100%';
		oFCKeditor.Height = '250';
		oFCKeditor.ReplaceTextarea();
	}
</script>
</head>
<body onload="showFCK()">
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
						<SPAN class=replybtn><a href="javascript:show()"><IMG alt="" src="img/reply.gif" border=0></a> </SPAN>
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
												<c:out escapeXml="true" value="${requestScope.note.content }" />
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
					<c:forEach items="${requestScope.note.fellowNote }" var="fellowNote">
					<DIV class="mainbox viewthread">
						<TABLE id=pid1556661 cellSpacing=0 cellPadding=0
							summary=pid1556661>
							<TBODY>
								<TR>
									<TD class=postauthor>
										<CITE><A class=dropmenu id=userinfo1556661
											onmouseover=showMenu(this.id)
											href="http://bbs.thec.cn/space.php?uid=88014" target=_blank>${fellowNote.user.userName }</A>
										</CITE>
										<DIV class=avatar>
											<img height=95 alt="" src="head/${fellowNote.user.photoPath }" width=95 border=0>
										</DIV>
										<P class=customstatus>
											小虫博客
										</P>
										<DL class=profile>
											<DT>
												UID
											</DT>
											<DD>
												${fellowNote.user.userCd }&nbsp;
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
												${fellowNote.user.registDate }&nbsp;
											</DD>
											<DT>
												最后登录
											</DT>
											<DD>
												${fellowNote.user.lastLoginDate }&nbsp;
											</DD>
										</DL>

									</TD>
									<TD class=postcontent>
										<DIV class=postinfo>
											<STRONG id=postnum1556661 title=复制帖子链接到剪贴板
												onclick="setcopy('http://bbs.thec.cn/viewthread.php?tid=382348&amp;page=1#pid1556661', '帖子链接已经复制到剪贴板')"></STRONG>
											发表于${fellowNote.publishDate }
										</DIV>
										<DIV id=ad_thread2_1></DIV>
										<DIV class="postmessage defaultpost">
											<DIV id=ad_thread3_1></DIV>
											<DIV id=ad_thread4_1></DIV>
											<DIV class=t_msgfont id=postmessage_1556661>
											<c:out value="${fellowNote.flwContent }" escapeXml="false"></c:out>	
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
</c:forEach>
					<DIV class=pages_btns>
						<div style="width: 800px; height: 30px;">

							第1/1页『首页』 『上一页』『下一页』『尾页』『定价』
							<input type="text"
								style="width: 20px; border: 1px solid #999999;" />
							<input type="button"
								style="width: 26px; height: 20px; border: 0px; background-image: url(img/go.gif);"
								value="GO" />
						</div>
						<c:if test="${!empty users}">
						<SPAN class=replybtn><a href="javascript:show()"><IMG alt="" src="img/reply.gif" border=0></a> </SPAN>
						</c:if>
					</DIV>
				</FORM>
			</div>
		</div>
		
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
		<div id="middle"></div>
			<div id="show">
			<div>
				<table width="100%">
					<tr style="background-color: #51A200">
						<td align="left">
							&nbsp;
							<b style="font-size: 12px; color: #FFFFFF;">回复页面</b>
						</td>
						<td align="right">
							<a href="javascript:show1();"><img src="img/cloes3.bmp"
									border="0" />
							</a>
						</td>
					</tr>
				</table>
			</div>
			<FORM id=postform
				action="addfellow.do"
				method=post onsubmit="return checkcontent()">
				<INPUT type=hidden value="${requestScope.note.noteCd }" name="fellowNoteForm.noteCd">
				<DIV class="mainbox formbox"
					style="border-top: none; margin-top: 0px">
					<H1 align="left">
						发表回复
					</H1>
					<TABLE cellSpacing=0 cellPadding=0 summary=发表回复>
						<THEAD>
						</THEAD>
						<TBODY>
							<TR>
								<TH vAlign=top>
									<LABEL for=posteditor_textarea>
										内容
									</LABEL>
								</TH>
								<TD>
									<DIV>
										<TABLE class=editor_text style="TABLE-LAYOUT: fixed"
											cellSpacing=0 cellPadding=0 summary="Message Textarea">
											<TBODY>
												<TR>
													<TD> 
														<TEXTAREA class=autosave id="posteditor_textarea"
															style="WIDTH: 99%; HEIGHT: 250px" tabIndex=100
															name="fellowNoteForm.content" rows=10 cols=60></TEXTAREA>
													</TD>
												</TR>
											</TBODY>
											<tfoot>

												<tr style="background-color: #f7f7f7;">
													<td>
														<div class=editor_button align="right" id="">

															<input type="button" onclick="jiancha()"
																style="color: #009900; border: none; background-color: #f7f7f7;"
																value="字数检查" />
															<input type="button" onclick="clear1()"
																style="color: #009900; border: none; background-color: #f7f7f7;"
																value="清空内容" />
														</div>
													</td>
												</tr>
											</tfoot>
										</TABLE>
						<script type="text/javascript">
							function checkcontent(){
									var contents=document.getElementById("posteditor_textarea");
									if (contents.value=="" ||contents.value=="<br />") {
										alert("请不要回复空信息!");
										return false;
									} else {
										return true;
									}
								}
						</script>           
									</DIV>
								</TD>
							</TR>
							<TR>
								<TH>
									<LABEL for=subject>
										出价
									</LABEL>
								</TH>
								<TD align="left">
									<INPUT id=subject tabIndex=3 size=20 name=subject>
										&nbsp;&nbsp;元 &nbsp;&nbsp;(可选)
									<EM class=tips></EM>
								</TD>
							</TR>
							<TR class=btns>
								<TH>
									&nbsp;
								</TH>
								<TD align="left">
									<INPUT id=posteditor_mode type=hidden value=0 name=wysiwyg>
									<INPUT id=fid type=hidden value=96 name=fid>
									<BUTTON id=postsubmit tabIndex=300 type=submit 
										value="true">
										发表回复
									</BUTTON>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</DIV>

			</FORM>
		</div>
	</body>
</html>