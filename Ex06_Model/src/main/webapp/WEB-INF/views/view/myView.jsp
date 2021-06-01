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
	out.print("<h1>Hello World(test2)</h1>");
%>

<h1>${ObjectTest}</h1><br/>
<h1>${list}</h1><br/>

<c:forEach var="mylist" items="${lists}">
${mylist}<br>
</c:forEach>

<br>
당신의 이름은 ${name} 입니다. 
</body>
</html>