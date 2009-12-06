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
	<script type="text/javascript" src="fckeditor/fckconfig.js"></script>
	<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
	<script type="text/javascript">
	function showFCK() {
		var oFCKeditor = new FCKeditor('posteditor_textarea');
		oFCKeditor.BasePath = '${pageContext.request.contextPath}/fckeditor/';
		oFCKeditor.ToolbarSet = 'Basic';
		oFCKeditor.Width = '100%';
		oFCKeditor.Height = '250';
		oFCKeditor.ReplaceTextarea();
	}
	</script>
	<script type="text/javascript">
	var ispass=false;
		function checktitle(){
				var title=document.getElementById("subject");
				if (title.value=="") {
					alert("标题不能为空!");
					ispass=false;
				} else {
					ispass=true;
				}
				return ispass;
			}
		function checkcontent(){
			var content=document.getElementById("posteditor_textarea");
				if (content.value=="") {
					alert("内容不能为空!");
					ispass=false;
				} else {
					ispass=true;
				}
				return ispass;
			}
		function checkform(){
				if (checktitle()&&checkcontent()) {
					ispass=true;
				}
				return ispass;
			}
	</script>
</head>
<body onload="showFCK()">
<DIV class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>
			<!-- *************网站导航地图*************  -->
			<form action="editNote.do" method="post" onsubmit="return checkform()">
			<input type="hidden" value="${note.noteCd }" name="editNoteForm.noteCd">
			<input type="hidden" value="${note.module.moduleCd }" name="editNoteForm.moduleCd">
			<input type="hidden" value="${note.childModule.childModuleCd }" name="editNoteForm.childModuleCd">
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
									href="login!out.do">退出登录</A>
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
							<input id=subject tabindex=3 size=45 name="editNoteForm.title" onblur="checktitle()" value="${note.title }">
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
												style="WIDTH: 99%; HEIGHT: 250px" tabIndex=100 name="editNoteForm.content"
												rows=10 cols=60 onblur="checkcontent()">${note.content }</TEXTAREA>
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
								提交修改
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