<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="doUploadFile.jsp" method="post" enctype="multipart/form-data">
        <table align="center">
            <tr>
                <td>帐户名：</td>
                <td><input type="text" name="name" value=""></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password"" name="password" value=""></td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" name="gender" value="1" checked="checked">男
                    <input type="radio" name="gender" value="1">女
                </td>                
            </tr>
            <tr>
                <td>头像</td>
                <td>
                    <input type="radio" name="head" value="1.gif" checked="checked">
                    <img src="images/head/1.gif">
                    <input type="radio" name="head" value="2.gif">
                    <img src="images/head/2.gif">
                </td>
            </tr>
            <tr>
                <td>上传头像：</td>
                <td>
                    <input type="file" name="picture">
                </td>                
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>               
            </tr>
        </table>

        
        
    </form>
</body>
</html>