<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("userId").trim();
	String pwd = request.getParameter("userPwd").trim();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<h2>입력받은 아이디 : <%=id %><br>
			입력받은 비밀번호 : <%=pwd %>
		</h2>
	</div>
</body>
</html>