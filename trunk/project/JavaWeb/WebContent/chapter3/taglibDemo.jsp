<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--
	导入自定义标签库;
	这里的 uri="date"中date来自于web.xml中配置的标签库信息。若在web.xml中没有配置
	标签库信息，则这里需要写为uri="/WEB-INF/tld/date.tld"。prefix="date"属性是用
	来定义本jsp中自定义标签库的前缀用的。这里定义为date，所以在本页面是用这个标签库
	时前缀为date，如：<date:displayDate />
--%>
<%@taglib prefix="date" uri="date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 
	使用自定义标签<date:infoTagBodyExample>，循环打印标签间文字内容及标签的userName属性，
	其中标签间文字分别在doStartTag()方法和doAfterBody()方法中被循环打印，所以将出现6次。
	count和userName都是该标签定义的属性，count表示循环次数。
	相应实现代码请参照InfoTagBodyExample.java
--%>
 <date:infoTagBodyExample count="3" userName="yoyo">123</date:infoTagBodyExample>
 <br>
 
 <date:demoSimpleTag num="3">adsfadf</date:demoSimpleTag>
 <br>
 
<!-- 
	使用自定义标签，由于该自定义标签的doStartTag方法返回的是TagSupport.EVAL_BODY_INCLUDE，
	所以标签间的内容字符串abcd会被输出到页面上。但如果返回的是TagSupport.SKIP_BODY，
	则标签间内容字符串将不会被输出到页面上。
-->
<date:displayDate>abcd</date:displayDate>
<br>

<%-- 
	由于上面使用的<date:displayDate>自定义标签的doEndTag方法返回的是TagSupport.SKIP_PAGE，
	该自定义标签后的jsp将不被处理(即后面的重庆足下软件学院不会显示)，所以下面的字符串不会显示在页面上。
	但如果返回的是TagSupport.EVAL_PAGE，则该自定义标签后的jsp将被执行。
 --%>
重庆足下软件学院

</body>
</html>