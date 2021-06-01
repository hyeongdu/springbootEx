<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome : Member</h1>
	
	<sec:authorize access="isAuthenticated()">
	<h1>Log-In</h1>
	</sec:authorize>
	
	<sec:authorize access="!isAuthenticated()">
	<h1>Log-Out</h1>
	</sec:authorize>
	
	User Id = <sec:authentication property="name"/><br/>
	
	<c:url value="/logout" var="logoutUrl"/>
	<a href="${logoutUrl}">Log OUt</a><br/>
	
	
</body>
</html>