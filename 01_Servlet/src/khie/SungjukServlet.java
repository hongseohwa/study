package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/score")
public class SungjukServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SungjukServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력 내용 중 한글 깨짐 방지 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		// 출력 내용 중 한글 깨짐 방지 인코딩 설정
		response.setContentType("text/html; charset=UTF-8");
		
		// 1단계 : Ex09.jsp 폼 페이지에서 넘어온 정보들을 받아 주자.
		String name = request.getParameter("name").trim();
		int kor = Integer.parseInt(request.getParameter("kor").trim());
		int eng = Integer.parseInt(request.getParameter("eng").trim());
		int mat = Integer.parseInt(request.getParameter("mat").trim());
		
		// 2단계 : 총점 및 평균을 구하자.
		int total = kor + eng + mat;
		double avg = total / 3.0;
		
		// 3단계 : 학점을 구하자.
		String grade;
		if(avg >= 90) {
			grade = "A학점";
		} else if(avg >= 80) {
			grade = "B학점";
		} else if(avg >= 70) {
			grade = "C학점";
		} else if(avg >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		// 4단계 : 웹 브라우저에 성적 결과를 출력해 보자.
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<div align='center'>");
		out.println("<h2>" + name + "님 성적 결과</h2>");
		out.println("<table border = '1' cellspacing = '0'>");
		out.println("<tr>");
		out.println("<th>이 름</th>");
		out.println("<td>" + name + "</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>국어점수</th>");
		out.println("<td>" + kor + "점</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>영어점수</th>");
		out.println("<td>" + eng + "점</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>수학점수</th>");
		out.println("<td>" + mat + "점</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>총 점</th>");
		out.println("<td>" + total + "점</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>평 균</th>");
		out.println("<td>" + String.format("%.2f점", avg) + "</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학 점</th>");
		out.println("<td>" + grade + "</th>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}
