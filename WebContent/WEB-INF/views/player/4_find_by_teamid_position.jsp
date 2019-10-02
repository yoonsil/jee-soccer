<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<!-- 쿼리 -->
<h2>4. 팀아이디와 포지션 입력하면 해당 선수 정보 출력</h2>
<form id="btn4" action="${ctx}/player.do">
	팀아이디 : <input type="text" name="teamId" /><br />
	포지션 : <input type="text" name="position" /><br />
	<input type="hidden" name="action" value="find" /><br />
	<input type="hidden" name="page" value="4_find_by_teamid_position" /><br />
	<input type="submit" value="전 송"/>
</form>
<body>
<!-- 결과-->
해당ID와 ${player.teamId} 포지션 ${player.position}이 일치하는 선수는 홍길동입니다.
</body>
</html>