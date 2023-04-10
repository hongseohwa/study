<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<hr width = "50%" color = "red">
		<h2>회원 정보 입력 폼 페이지</h2>
		<hr width = "50%" color = "red">
		<br>
		<form action = "member">
			<table border = "1" cellspacing = "0">
				<tr>
					<th>회원 아이디</th>
					<td><input type = "text" name = "id"></td>
				</tr>
				<tr>
					<th>회원 비밀번호</th>
					<td><input type = "password" name = "pwd"></td>
				</tr>
				<tr>
					<th>회원 이름</th>
					<td><input type = "text" name = "name"></td>
				</tr>
				<tr>
					<th>회원 나이</th>
					<td><input type = "text" name = "age"></td>
				</tr>
				<tr>
					<th>회원 연락처</th>
					<td><input type = "text" name = "phone"></td>
				</tr>
				<tr>
					<td colspan = "2" align = "center">
					<input type = "submit" value = "회원가입">&nbsp;
					<input type = "reset" value = "다시작성">
				</tr>
			</table>
		</form>
	</div>
</body>
</html>