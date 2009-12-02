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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1[1].2.1.pack.js"></script>
<script language="javascript" src="${pageContext.request.contextPath}/js/showPic.js">
</script>
<style type="text/css">
    #large{position:absolute;display:none;z-index:999;}
</style>
</head>

<body>

上传预览图片:<br>
<input id="f1" type="file" /><br>
<img id="head" width="120" height="80" src="${pageContext.request.contextPath}/head/male.jpg">

<div id="large"></div>

<br><br><br><br><br><br>
鼠标滑过预览图片:<br>
<img width="120" height="60" src="http://www.cssrain.cn/skins/tim/logo-jq.gif"><br>
<img width="120" height="60" src="http://www.cssrain.cn/demo/JQuery+API/logo-json.gif"><br>
</body>
</html>