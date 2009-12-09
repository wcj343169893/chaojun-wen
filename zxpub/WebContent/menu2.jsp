<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>²Ëµ¥</title>
<script type="text/javascript" src="js/jquery-1[1].2.1.pack.js"></script>
<script type="text/javascript">
	function mouse_x(){
		 var oEvent = window.event ? window.event : event;
		  var iTopx=oEvent.clientX;
		alert("X"+iTopx);
		}
	function mouse_y(){
		 var oEvent = window.event ? window.event : event;
		  var iTopx=oEvent.clientY;
		alert("Y"+iTopx);
		}
</script>
</head>
<body>
<div
	style="background-color: red; height: 150; width: 150px; cursor: pointer"
	id="m"></div>
</body>
</html>