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


	<form action="buy_ticket_card" method="get">
		고객 아이디 : <input type="text" name="consumerId"><br/>
		티켓 구매수 : <input type="text" name="amount"><br/>
		에러 발생 여부 : <input type="text" name="error" value="0"><br/>
		<input type="submit" value="구매"> <br/>
	</form>

<h3>1을 입력하면 에러가 발생합니다</h3>

</body>
</html>