<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	// String userId = request.getParameter("id").trim();
	String userPwd = request.getParameter("pwd").trim();
	String userName = request.getParameter("name").trim();
	String userPhone = request.getParameter("phone").trim();
	String userAddr = request.getParameter("addr").trim();
	String sido = request.getParameter("sido").trim();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<h2>가입 회원 정보 페이지</h2>
		<table border = "1" cellspacing = "0">
			<tr>
				<th>회원 아이디</th>
				<td><%=request.getParameter("id").trim() %></td>
			</tr>
			<tr>
				<th>회원 비밀번호</th>
				<td><%=userPwd %></td>
			</tr>
			<tr>
				<th>회원 이름</th>
				<td><%=userName %></td>
			</tr>
			<tr>
				<th>회원 연락처</th>
				<td><%=userPhone %></td>
			</tr>
			<tr>
				<th>회원 주소</th>
				<td><%=userAddr %></td>
			</tr>
			<tr>
				<th>회원 거주지</th>
				<td><%=sido %></td>
			</tr>
		</table>
	</div>
</body>
</html>