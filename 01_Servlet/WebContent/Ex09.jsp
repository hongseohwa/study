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
		<h2>성적 처리 폼 페이지</h2>
		<form method = "post" action = "score">
		<table border = "1" cellspacing = "0">
			<tr>
				<th>이 름</th>
				<td><input type = "text" name = "name"></td>
			</tr>
			<tr>
				<th>학생 국어 점수</th>
				<td><input type = "text" name = "kor"></td>
			</tr>
			<tr>
				<th>학생 영어 점수</th>
				<td><input type = "text" name = "eng"></td>
			</tr>
			<tr>
				<th>학생 수학 점수</th>
				<td><input type = "text" name = "mat"></td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">
				<input type = "submit" value = "성적처리">&nbsp;
				<input type = "reset" value = "다시작성">
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>