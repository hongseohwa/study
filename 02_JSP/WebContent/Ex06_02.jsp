<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("id").trim();
	String userPwd = request.getParameter("pwd").trim();
	
	// 원래는 DB의 회원 관리 테이블에서 입력한 아이디와 입력한 비밀번호가 맞는지 확인을 하여 회원이면 메인 페이지로 이동.
	String dbId = "hong";
	String dbPwd = "1234";
	
	if(userId.equals(dbId)) {
		if(userPwd.equals(dbPwd)) {
			// 회원인 경우 메인 페이지로 이동 ==> 페이지 이동
			request.setAttribute("name", "홍길동");
			request.setAttribute("addr", "서울시 중구 남대문로");
			
			RequestDispatcher rd = request.getRequestDispatcher("Ex08.jsp");
			
			response.sendRedirect("Ex08.jsp");
		} else {
			System.out.println("비밀번호가 틀립니다.");
		}
	} else {
		System.out.println("아이디가 틀리거나, 회원이 아닙니다.");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>