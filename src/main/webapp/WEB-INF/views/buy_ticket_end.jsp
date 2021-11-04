<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buy_ticket_end.jsp</title>
</head>
<body>
	<h3>티켓구매가 완료되었습니다.</h3>
	구매자아이디 : ${ticketInfo.consumerId }<br>
	결제 매수 : ${ticketInfo.amount }
</body>
</html>