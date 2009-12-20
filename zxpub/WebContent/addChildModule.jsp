<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加子版块</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script type="text/javascript">
		function $(elementId){return document.getElementById(elementId);}
		function isNull(elementId){
		if($(elementId).value==""){
				alert("名称不能为空");
				return false;
			}
		}
		
	</script>
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
				<form method="post"	action="childModule!add.action" onsubmit="return isNull('childModuleName')">
					<input type="hidden" value="${param.mCd }" name="mCd"/>
					<div class="mainbox formbox">
						<h1>
							子模块
						</h1>
						<table summary="子版块" cellspacing="0" cellpadding="0">
							<tr>
								<th>
									模块名称:
								</th>
								<td>
									<input type="text" id="childModuleName" size="30" tabindex="1" name="childModuleName"/>
								</td>
							</tr>
							<tr>
								<th>
									板块公告:
								</th>
								<td>
									<textarea rows="5" cols="70" id="bio" name="moduleComment" tabindex="2"></textarea>
								</td>
							</tr>

							<tr>
								<th>
									版主:
								</th>
								<td>
									<input type="text" size="70" readonly="readonly" value="${users.userName }" tabindex="4"/>
								</td>
							</tr>
							<tr>
								<td align="center" colspan="2">
									<button type="submit" tabindex="3">
										提&nbsp;&nbsp;交
									</button>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		<!-- 尾 -->
		<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
		</iframe>
		<!-- 尾 -->
		</DIV>
</body>
</html>