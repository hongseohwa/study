package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/choiceCar")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CarServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// service 메서드는 method="get" 이나 method="post" 인 경우 service() 메서드에서 처리 가능
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String[] cars = request.getParameterValues("car");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body bgcolor='black'>"); // 배경색 지정		
		out.println("<table>");
		out.println("<tr>");
		for(int i = 0; i < cars.length; i++) {
			out.println("<td>");
			out.println("<img src = '" + cars[i] + "' width='200' height='100'>");
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}
