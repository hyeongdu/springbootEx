<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("<h1>Form 사용하기 Test1</h1>");
%>
<h1>당신의 아이디는 ${member.id} 입니다</h1>
<h1>당신의 이름은 ${member.name} 입니다</h1>
</body>
</html>