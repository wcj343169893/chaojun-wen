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
</head>
<body>
	<div class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0 scrolling="no">
			</iframe>
			<!-- *************网站导航地图************* -->
			<div>
				<table width="100%">
					<tr style="background-color: #51A200">
						<td align="left">
							&nbsp;
							<b style="font-size: 12px; color: #FFFFFF;">修改回复</b>
						</td>
						<td align="right">
							&nbsp;
						</td>
					</tr>
				</table>
			</div>
			<FORM id=postform
				action="editfellow.do"
				method=post onsubmit="">
				<input type="hidden" name="editFellowNoteForm.fellowNoteCd" value="${fellowNote.fellowNoteCd }">
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
															name="editFellowNoteForm.content" rows=10 cols=60>${fellowNote.flwContent }</TEXTAREA>
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
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
	</body>
</html>