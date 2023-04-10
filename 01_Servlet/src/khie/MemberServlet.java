package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ex03.jsp 폼 페이지에서 넘어온 정보들을 받아 주자.
		String userId = request.getParameter("id");
		String userPwd = request.getParameter("pwd");
		String userName = request.getParameter("name");
		String userAge = request.getParameter("age");
		String userPhone = request.getParameter("phone");
		
		// 응답 할 때 한글 깨짐 방지 설정.
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<div align = 'center'>");
		out.println("<h2>회원 정보</h2>");
		out.println("<table border = '1' cellspacing = '0'>");		
		out.println("<tr>");
		out.println("<th>회원 아이디</th>");
		out.println("<td>" + userId + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>회원 비밀번호</th>");	
		out.println("<td>" + userPwd + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>회원 이름</th>");	
		out.println("<td>" + userName + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>회원 나이</th>");	
		out.println("<td>" + userAge + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>회원 연락처</th>");	
		out.println("<td>" + userPhone + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
