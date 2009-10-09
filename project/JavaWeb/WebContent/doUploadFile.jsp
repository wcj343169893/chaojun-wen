<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	//out.print(isMultipart);
	if (isMultipart) {
		FileItemFactory factory = new DiskFileItemFactory(); //文件项工厂；
		
		ServletFileUpload upload = new ServletFileUpload(factory); //文件上传对象；
	    upload.setHeaderEncoding("UTF-8"); //解决路径或文件名中文乱码问题；
		List<FileItem> items = upload.parseRequest(request);

		//由于可能在两处设定head的值，设置一个标志变量，以用户上传图片为优先；
		boolean flag = true;
		for (FileItem item : items) {
			if (item.isFormField()) {
				String name = item.getFieldName();
				String value = item.getString("UTF-8"); //解决表单项中文乱码问题；
			} else {
			    String filename = item.getName();   //文件名
			    
			    filename = filename.substring(filename.lastIndexOf(File.separator) + 1, filename.length());
			    long size = item.getSize();
			    if(filename == null || filename.equals("") || size == 0){
			    	flag = true;
			    	continue;
			    } else {
			    	/*
			    	String path = application.getRealPath("/");
			    	File dir = new File(path + "/images/head/");
			    	File file = new File(dir, filename);
			    	item.write(file);
			    	flag = false;   //不再处理head项；
			    	user.setHead(filename);
			    	
			    	*/
			    	InputStream in = item.getInputStream();
			    	
			    	byte[] result = new byte[(int)item.getSize()];
					in.read(result);
					
					FileOutputStream fileOutputStream = new FileOutputStream("c:/" + filename);
					fileOutputStream.write(result,0,result.length);
			    }
			}
		}
		
		//UserDAO.insertUser(user);
	} else {
		//错误处理界面；

	}
%>
</body>
</html>