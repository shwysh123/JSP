<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="03Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page import="C03.*" %>
<%
String name = request.getParameter("username");
int age = Integer.parseInt(request.getParameter("age"));
String addr = request.getParameter("addr");
%>

</body>
</html>