function checkusername() {
	var userName = $("username");
	if (userName.value == "") {
		$("checkusername").innerHTML = "用户名不能为空";
	} else {
		$("checkusername").innerHTML = "";
	}
}
function checkpassword() {
	var password = $("password");
	if (password.value == "") {
		$("checkpassword").innerHTML = "密码不能为空";
	} else {
		$("checkpassword").innerHTML = "";
	}
}

function checkpassword2() {
	var password = $("password");
	var password2 = $("password2");
	if (password.value != password2.value) {
		$("checkpassword2").innerHTML = "密码和确认密码不一致";
	} else if (password.value == "") {
		$("checkpassword2").innerHTML = "确认密码不能为空";
	} else {
		$("checkpassword2").innerHTML = "";
	}
}