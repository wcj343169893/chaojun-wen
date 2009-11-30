<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>足下软件论坛</title>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/css/style_10.css" />
	<script type="text/javascript">
		var IMGDIR = 'images/changlai';
		var attackevasive = '0';
		var gid = 0;
		var fid = parseInt('0');
		var tid = parseInt('0');
	</script>
	<script src="js/common.js" type="text/javascript"></script>
	<script src="js/menu.js" type="text/javascript"></script>
	<script src="js/ajax.js" type="text/javascript"></script>
</head>
<body>
<DIV class=wrap>
			<div class="wrap">
			<!-- *************头************* -->
			<iframe width=100% height=109px src="head.jsp" frameborder=0>
			</iframe>
			<!-- *************头************* -->
			<!-- *************网站导航地图************* -->
			<iframe width=100% height=48px src="navigation.jsp" frameborder=0>
			</iframe>			
			<!-- *************网站导航地图************* -->
				<script src="CSS/calendar.js" type="text/javascript"></script>
				<form name="bbrules" method="post" action="registInit.do">
					<input type="hidden" name="formhash" value="f68c3dba" />
					<input type="hidden" name="referer" value="index.php" />
					<div class="mainbox formbox">
						<h1>
							注册
						</h1>
						<table cellspacing="0" cellpadding="0" width="100%" align="center"
							class="register">
							<tbody>
								<tr>
									<td>
										<br />
										欢迎光临足下软件论坛------
										<br />
										到此报道者送到见面礼一份!
										<br />
										http://yiqunhazi.com
										<br />
										<br />
										论坛管理员yoyo代表足下网全体工作人员以及全体管理人员欢迎您!
										<br />
										欢迎您提出各种宝贵意见和建议！
										<br />
										<br />
									</td>
								</tr>
							</tbody>
							<tr class="btns" style="height: 40px">
								<td align="center" id="rulebutton">
									请仔细阅读以上的注册许可协议
								</td>
							</tr>
						</table>
					</div>
				</form>
				<script type="text/javascript">
	var secs = 9;
	var wait = secs * 1000;
	$('rulebutton').innerHTML = "请仔细阅读以上的注册许可协议 (" + secs + ")";
	for(i = 1; i <= secs; i++) {
		window.setTimeout("update(" + i + ")", i * 1000);
	}
	window.setTimeout("timer()", wait);
	function update(num, value) {
		if(num == (wait/1000)) {
			$('rulebutton').innerHTML = "请仔细阅读以上的注册许可协议";
		} else {
			printnr = (wait / 1000) - num;
			$('rulebutton').innerHTML = "请仔细阅读以上的注册许可协议 (" + printnr + ")";
		}
	}
	function timer() {
		$('rulebutton').innerHTML = '<button type="submit" id="rulesubmit" value="true">同 意</button> &nbsp; <button type="button" onclick="location.href=\'http://localhost:8080/zxpub/\'">不同意</button>';
	}
	</script>
			</div>

			<div style="display: none" id="ad_none">
				<div id="ad_headerbanner_none">
					<a href="http://10169.com/style/info/host.asp" target="_blank"><img
							src="image/gdata.gif" border="0">
					</a>
				</div>
				<div class="ad_footerbanner" id="ad_footerbanner1_none">
					<div class="ad_footerbanner">
					</div>
				</div>
			</div>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
		</DIV>

</body>
</html>