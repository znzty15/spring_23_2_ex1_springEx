<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buy_ticket.jsp</title>
</head>
<body>
	<h3>카드 결제 화면</h3>
	<form action="buy_ticket_card">
	고객 아이디 : <input type="text" name="consumerId"><br>
	티켓 구매수 : <input type="text" name="amount"><br>
	<input type="submit" value="구매">
</form>
</body>
</html>