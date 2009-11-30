<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
</head>
<body><div class="wrap">
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>			
			<!-- *************网站导航地图************* -->
			<form method="post" action="editUser!pwd.do">
				<input type="hidden" name="formhash" value="f68c3dba" />
				<div class="mainbox formbox">
					<h1>
						修改密码
					</h1>
					<table summary="忘记密码" cellspacing="0" cellpadding="0">
						<tr>
							<th>
								<label for="username">
									用户名
								</label>
							</th>
							<td>
								${users.userName }&nbsp;&nbsp;<span style="color: red;">${editPwdError }</span>
							</td>
						</tr>
						<tr>
							<th>
								<label for="email">
									旧密码
								</label>
							</th>
							<td>
								<input type="password" id="oldPwd" name="editPwdForm.oldPwd" size="25" />
						</tr>
						<tr>
							<th>
								<label for="questionid">
									新密码
								</label>
							</th>
							<td>
								<input type="password" id="oldPwd" name="editPwdForm.newPwd" size="25" />
								&nbsp;
							</td>
						</tr>
						<tr>
							<th>
								<label for="answer">
									确认新密码
								</label>
							</th>
							<td>
								<input type="password" name="editPwdForm.newPwd2" size="25" />
							</td>
						</tr>
						<tr class="btns">
							<th>
								&nbsp;
							</th>
							<td>
								<button type="submit" class="submit" value="true">
									提交
								</button>
							</td>
						</tr>
					</table>
				</div>
			</form>

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
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
		</div>

		<ul class="popupmenu_popup headermenu_popup" id="memcp_menu"
			style="display: none">
			<li>
				<a href="memcp.php">控制面板首页</a>
			</li>
			<li>
				<a href="memcp.php?action=profile">编辑个人资料</a>
			</li>
			<li>
				<a href="memcp.php?action=credits">积分交易</a>
			</li>
			<li>
				<a href="memcp.php?action=creditslog">积分记录</a>
			</li>
			<li>
				<a href="memcp.php?action=usergroups">公众用户组</a>
			</li>
			<li>
				<a href="memcp.php?action=spacemodule" target="_blank">个人空间管理</a>
			</li>
		</ul>
		<ul class="popupmenu_popup headermenu_popup" id="stats_menu"
			style="display: none">
			<li>
				<a href="stats.php">基本概况</a>
			</li>
			<li>
				<a href="stats.php?type=forumsrank">版块排行</a>
			</li>
			<li>
				<a href="stats.php?type=threadsrank">主题排行</a>
			</li>
			<li>
				<a href="stats.php?type=postsrank">发帖排行</a>
			</li>
			<li>
				<a href="stats.php?type=creditsrank">积分排行</a>
			</li>
			<li>
				<a href="stats.php?type=trade">交易排行</a>
			</li>
			<li>
				<a href="stats.php?type=onlinetime">在线时间</a>
			</li>
			<li>
				<a href="stats.php?type=team">管理团队</a>
			</li>
			<li>
				<a href="stats.php?type=modworks">管理统计</a>
			</li>
		</ul>

		<br>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
</body>
</html>