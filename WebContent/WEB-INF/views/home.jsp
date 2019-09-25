<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soccer</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
</script>
</head>
<body>
	<h2><a id ="a_position" href="#">2. 포지션보기</a></h2>

	<!-- 4. 팀아이디로 해당팀의 포지션별 선수 검색기능 예) 수원팀(id:k02), 골키퍼 -->
	<h2>4. 팀 아이디와 포지션 입력하면 해당 선수정보 출력</h2>
	<form id = "btn4" action="<%=request.getContextPath()%>/player.do" >
	ID: <input type="text" name ="teamId" /><br/>
	POSITION: <input type="text" name ="position" /><br/>
	<input type="hidden" name ="action" value = "find4"/>
	<input type="hidden" name = "page" value = "4.find_by_teamid_position"/>
	<input type="submit" value ="찾기" />
	</form>

	<h2>5. 팀 아이디와 포지션 입력하면 해당 선수정보 출력</h2>
	<form id = "btn5" action="<%=request.getContextPath()%>/player.do">
	팀id <input type="text" name = "teamId"/><br/>
	선수이름 <input type="text" name ="playerName"/><br/>
	키 <input type="text" name ="height"/><br/>
	<input type="hidden" name ="action" value = "find5"/>
	<input type="hidden" name = "page" value = "5.fund_by_teamid_height_name"/>
	<input type="submit" value = "검색"/>
	</form>
</body>
<script>
$('#a_position').click(function(){
	location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions');
});

$('#btn4').submit(function(){
});

$('#btn5').submit(function(){
});

</script>
</html>