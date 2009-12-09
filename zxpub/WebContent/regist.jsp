<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_10.css" />
	<script src="${pageContext.request.contextPath}/js/common.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/setday.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/pro_city.js"></script>
<script type="text/javascript">
var ispass=false;
	function showadv() {
		if(document.register.advshow.checked == true) {
			$("adv").style.display = "";
		} else {
			$("adv").style.display = "none";
		}
	}
	function checkusername() {
		var userName = $("username");
		if (userName.value == "") {
			$("checkusername").innerHTML = "用户名不能为空";
			ispass=false;
		} else {
			$("checkusername").innerHTML = "";
			ispass=true;
		}
		return ispass;
	}
	function checkpassword() {
		var password = $("password");
		if (password.value == "") {
			$("checkpassword").innerHTML = "密码不能为空";
			ispass=false;
		} else {
			$("checkpassword").innerHTML = "";
			ispass=true;
		}
		return ispass;
	}
	function checkpassword2() {
		var password = $("password");
		var password2 = $("password2");
		if (password.value != password2.value) {
			$("checkpassword2").innerHTML = "密码和确认密码不一致";
			ispass=false;
		} else if (password.value == "") {
			$("checkpassword2").innerHTML = "确认密码不能为空";
			ispass=false;
		} else {
			$("checkpassword2").innerHTML = "";
			ispass=true;
		}
		return ispass;
	}
	function checkemail() {
		var email = $("email");
		reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*h$/; 
		if (email.value == "") {
			$("checkemail").innerHTML = "邮箱不能为空";
			ispass=false;
		} else if (reg.test(email.value)) {
			$("checkemail").innerHTML = "邮箱格式不正确";
			ispass=false;
		} else {
			$("checkemail").innerHTML = "";
			ispass=true;
		}
		return ispass;
	}
	function checkform(){
		if (checkusername()&&checkpassword()&&checkpassword2()&&checkemail()) {
			return true;
		} else {
			return false;
		}
	}
</script>
<style type="text/css">
    #large{position:absolute;display:none;z-index:999;}
</style>
</head>
<body onload="setProvince(0),setCity(0)">
<DIV class=wrap><!-- *************头************* --> <iframe
	width=100% height=109px src="head.jsp" frameborder=0> </iframe> <!-- *************头************* -->
<!-- *************网站导航地图************* --> <iframe width=100% height=48px
	src="navigation.jsp" frameborder=0> </iframe> <!-- *************网站导航地图************* -->
<div class="wrap">
<form enctype="multipart/form-data" method="post" name="register"
	action="regist.action" onSubmit="return checkform()">
<div class="mainbox formbox">
<h1>注册</h1>
<table summary="注册" cellspacing="0" cellpadding="0">
	<thead>
		<tr>
			<th>基本信息 ( * 为必填项)</th>
			<td>&nbsp;</td>
		</tr>
	</thead>
	<tr>
		<th><label for="username"> 用户名 * </label></th>
		<td><input type="text" id="username" name="registForm.userName"
			size="25" maxlength="15" onBlur="checkusername()" tabindex="3" /> <span 
			id="checkusername" class="errorMessage"> <s:fielderror>
			<s:param>registForm.userName</s:param>
		</s:fielderror> ${userexist}</span></td>
	</tr>

	<tr>
		<td><label for="password"> 密码 * </label></td>
		<td><input type="password" name="registForm.password" size="25"
			id="password" onBlur="checkpassword()" tabindex="4" /> <span
			id="checkpassword" class="errorMessage"> <s:fielderror>
			<s:param>registForm.password</s:param>
		</s:fielderror> </span></td>
	</tr>

	<tr>
		<th><label for="password2"> 确认密码 * </label></th>
		<td><input type="password" name="registForm.password2" size="25"
			id="password2" onBlur="checkpassword2()" tabindex="5" /> <span
			id="checkpassword2" class="errorMessage"><s:fielderror>
			<s:param>registForm.password2</s:param>
		</s:fielderror></span></td>
	</tr>
	<tr>
		<th>性别</th>
		<td><label> <input type="radio" name="registForm.sex" value="男"
			checked="checked" tabindex="6" /> 男 </label> <label> <input
			type="radio" name="registForm.sex" value="女" tabindex="18" /> 女 </label><s:fielderror>
			<s:param>registForm.sex</s:param>
		</s:fielderror></td>
	</tr>
	<tr>
		<td><label for="email"> Email * </label></td>
		<td><input type="text" name="registForm.email" size="25" id="email"
			onBlur="checkemail()" tabindex="7" /> <span id="checkemail"
			class="errorMessage"> <s:fielderror>
			<s:param>registForm.email</s:param>
		</s:fielderror> </span></td>
	</tr>
	<tr>
		<th><label for="advshow"> 高级选项 </label></th>
		<td><input id="advshow" class="checkbox" type="checkbox"
			value="1" onclick="showadv()" tabindex="12" /> <label for="advshow">显示高级用户设置选项
		</label></td>
	</tr>
</table>

<table summary="注册 高级选项" cellspacing="0" cellpadding="0" id="adv"
	style="display: none;">
	<thead>
		<tr>
			<th>扩展信息</th>
			<td>&nbsp;</td>
		</tr>
	</thead>
	<tr>
		<th><label for="questionid"> 安全提问 </label></th>
		<td><select id="questionid"
			name="registForm.questionCd" tabindex="13">
			<c:forEach items="${questionMasters}" var="qm">
			<option value="${qm.questionCd }">${qm.question }</option>
			</c:forEach>
		</select> 如果您启用安全提问，登录时需填入相应的项目才能登录</td>
	</tr>
	<tr>
		<th><label for="answer"> 回答 </label></th>
		<td><input type="text" id="answer" name="registForm.answer"
			size="25" tabindex="14" /></td>
	</tr>
	<tr>
		<th><label for="province"> 省 </label></th>
		<td><select id="province" name="registForm.provinceCd"
			tabindex="20" onchange="setCity(0)"></select></td>
	</tr>
	<tr>
		<th><label for="city"> 市 </label></th>
		<td><select id="city" name="registForm.cityCd" tabindex="21"></select>
		</td>
	</tr>
	<tr>
		<th><label for="bday"> 生日 </label></th>
		<td><input type="text" id="bday" name="registForm.birthday" size="25"
			onclick="setday(this)" value="1990-01-01"
			tabindex="22" /> <s:fielderror>
			<s:param>registForm.birthday</s:param>
		</s:fielderror></td>
	</tr>
	<tr>
		<td><label for="alipay"> 用户头像 </label></td>
		<td><input id="alipay" name="registForm.photo" type="file" tabindex="23" />
		</td>
	</tr>
	<tr>
		<td valign="top"><label for="bio"> 自我介绍 </label></td>
		<td><textarea rows="5" cols="30" id="bio" name="registForm.comment"
			tabindex="24"></textarea></td>
	</tr>
</table>
<button class="submit" type="submit" value="true" tabindex="100">提交</button>
</div>
</form>
</div>
</div>
<!-- 尾 -->
<iframe width=100% height=113px src="cauda.jsp" frameborder=0>
</iframe>
<!-- 尾 -->

</body>
</html>