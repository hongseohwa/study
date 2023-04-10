package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login1Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("id").trim();
		String userPwd = request.getParameter("pwd").trim();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<div align='center'>");
		out.println("<h2>");
		out.println("아이디 : " + userId + "<br>");
		out.println("비밀번호 : " + userPwd + "<br>");
		out.println("</h2>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}