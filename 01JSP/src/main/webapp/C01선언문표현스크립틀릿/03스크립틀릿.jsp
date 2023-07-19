<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스클립틀릿 : JSP->Servlet로 변환될때 Servlet내의 Service라는 함수안에서 
	처리되는 로직 Service라는 함수내에서 동작하기 때문에 지역번수나 반복/분기처리 가능
	하지만 함수를 벗어나면 지역변수들은 소멸되기 때문에 새로고침하게 되면 상태값이 초기화된다.  -->
<%
String str1 = "WellDone"; // 변수정의가능
String str2 = "Wow Interesting"; // 변수정의가능
String str3 = str1 +str2; // 연산가능
int a = 0 ;
//절차지향문법(반복문/분기문)
for(int i=0;i<10;i++){
	a++;
	System.out.println("WellDone"+i);
}
%>
<%=str1 %><br/>
<%=str2 %><br/>
<%=str3 %><br/>
<%=a %><br/>

</body>
</html>