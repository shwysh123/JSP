<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String title = request.getParameter("title");
String bgcolor = request.getParameter("bgcolor");
String hobbys[] = request.getParameterValues("hobbys");



if(bgcolor.equals("etc")){
	bgcolor="dragon";
}

System.out.println("제목 : "+ title);
System.out.println("배경색 : "+ bgcolor);
System.out.println("취미 : "+ hobbys);
for(int i=0; i<hobbys.length; i++){
	System.out.println(hobbys[i]);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=<%=bgcolor %>>
	

</body>
</html>