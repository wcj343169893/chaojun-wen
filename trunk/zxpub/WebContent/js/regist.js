function checkusername() {
	var userName = $("username");
	if (userName.value == "") {
		$("checkusername").innerHTML = "�û�������Ϊ��";
	} else {
		$("checkusername").innerHTML = "";
	}
}
function checkpassword() {
	var password = $("password");
	if (password.value == "") {
		$("checkpassword").innerHTML = "���벻��Ϊ��";
	} else {
		$("checkpassword").innerHTML = "";
	}
}

function checkpassword2() {
	var password = $("password");
	var password2 = $("password2");
	if (password.value != password2.value) {
		$("checkpassword2").innerHTML = "�����ȷ�����벻һ��";
	} else if (password.value == "") {
		$("checkpassword2").innerHTML = "ȷ�����벻��Ϊ��";
	} else {
		$("checkpassword2").innerHTML = "";
	}
}