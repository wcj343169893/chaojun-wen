<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script type="text/javascript">
function reloadVerifyCode(obj){  
    obj.src = "<%=request.getContextPath()%>/validateImage.do";
} 
</script>
</head>
<body><DIV class=wrap>
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<FORM name=login action="login.do" method=post>
				<INPUT type=hidden value=9f2ea0b1 name=formhash>
				<INPUT type=hidden name=referer>
				<INPUT type=hidden value=2592000 name=cookietime>
				<DIV class=box style="MARGIN: 10px auto; WIDTH: 60%">
					<TABLE cellSpacing=0 cellPadding=4 width="100%">
						<THEAD>
							<TR>
								<TD>
									会员登录
								</TD>
								<td style="color: red;">${logerror }</td>
							</TR>
						</THEAD>
						<TBODY>
							<TR>
								<TD onclick=document.login.username.focus();>
									<LABEL>
										用户名
									</LABEL>
									<LABEL></LABEL>
								</TD>
								</LABEL>
								<TD>
									<INPUT type="text" id="userName" tabIndex=2 maxLength=40
										size=25 name="user.userName">
									&nbsp;
									<EM class=tips><A href="preRegist.jsp">注册</A>
									</EM>
								</TD>
							</TR>
							<TR>
								<TD>
									密码
								</TD>
								<TD>
									<INPUT type="password" id="userPwd" tabIndex=3 size=25
										name="password.password">
									&nbsp;
									<EM class=tips><A href="FindPWD.jsp">忘记密码</A> </EM>
								</TD>
							</TR>
								<TR>
								<TD>
									验证码
								</TD>
								<TD>
									  <input name="validateCode" type="text" size="4" maxlength="4" tabIndex=4 />
		  <img alt="看不清楚，换一张"
			src="validateImage.do"
			onclick="reloadVerifyCode(this);" style="cursor: hand;" />
								</TD>
							</TR>
							<TR>
								<TD></TD>
								<TD>
									<BUTTON onClick="check()" class="submit" type="submit"
										id=loginsubmit tabIndex=6>
										会员登录
									</BUTTON>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</DIV>
			</FORM>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
		</DIV>
		<UL class="popupmenu_popup headermenu_popup" id=memcp_menu
			style="DISPLAY: none">
			<LI>
				<A href="http://bbs.thec.cn/memcp.php">控制面板首页</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/memcp.php?action=profile">编辑个人资料</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/memcp.php?action=credits">积分交易</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/memcp.php?action=creditslog">积分记录</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/memcp.php?action=usergroups">公众用户组</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/memcp.php?action=spacemodule"
					target=_blank>个人空间管理</A>
			</LI>
		</UL>
		<UL class="popupmenu_popup headermenu_popup" id=stats_menu
			style="DISPLAY: none">
			<LI>
				<A href="http://bbs.thec.cn/stats.php">基本概况</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=forumsrank">版块排行</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=threadsrank">主题排行</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=postsrank">发帖排行</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=creditsrank">积分排行</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=trade">交易排行</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=onlinetime">在线时间</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=team">管理团队</A>
			</LI>
			<LI>
				<A href="http://bbs.thec.cn/stats.php?type=modworks">管理统计</A>
			</LI>
		</UL>

		<DIV id=ad_none style="DISPLAY: none">
			<DIV id=ad_headerbanner_none>
				<A href="http://10169.com/style/info/host.asp" target=_blank><IMG
						src="http://bbs.thec.cn/bbsimg/gdata.gif" border=0> </A>
			</DIV>
			<DIV class=ad_footerbanner id=ad_footerbanner1_none>
				<DIV class=ad_footerbanner>
					<BR>

				</DIV>
			</DIV>
			<DIV class=ad_footerbanner id=ad_footerbanner2_none></DIV>
			<DIV class=ad_footerbanner id=ad_footerbanner3_none></DIV>
		</DIV>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->

</body>
</html>