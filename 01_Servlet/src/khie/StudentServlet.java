package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청한 정보가 한글이 있으면 한글 깨짐 방지 설정.
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 1단계 : Ex06.jsp 폼 페이지에서 넘어온 정보들을 받자.
		String student_hakbun = request.getParameter("hakbun");
		String student_name = request.getParameter("name");
		String student_major = request.getParameter("major");
		String student_age = request.getParameter("age");
		String student_phone = request.getParameter("phone");
		// 여러 개의 데이터가 넘어올 경우
		String[] student_subjects = request.getParameterValues("subject");
		
		// 2단계 : 웹 브라우저에 요청한 결과를 보여 주자.
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<div align = 'center'>");
		out.println("<table border = '1' cellspacing = '0'");
		out.println("<tr>");
		out.println("<th>학생 학번</th>");
		out.println("<td>" + student_hakbun + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학생 이름</th>");
		out.println("<td>" + student_name + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학생 학과</th>");
		out.println("<td>" + student_major + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학생 나이</th>");
		out.println("<td>" + student_age + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학생 연락처</th>");
		out.println("<td>" + student_phone + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>취미</th>");
		out.println("<td>");
		for(int i = 0; i < student_subjects.length; i++) {
			out.println(student_subjects[i] + "&nbsp;&nbsp;&nbsp;");
		}
		out.println("</td>");
		out.println("</tr>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}