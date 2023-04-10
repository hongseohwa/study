package khie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * - 서블릿은 자바로 만들어 졌으므로 당연히 클래스들 간의 계층 구조를 가짐.
 * 
 *      Servlet              ServletConfig
 *         ↑                      ↑
 *         |                      |
 *         --- GenericServlet  --- 
 *                   ↑
 *                   |
 *                HttpServlet
 *                
 * - 서블릿 API는 Servlet과 ServletConfig 인터페이스를 구현해 제공함.
 *   GenericServlet 추상 클래스가 이 두 인터페이스의 추상 메서드를 구현.
 *   그리고 이 GenericServlet을 다시 HttpServlet 클래스가 상속을 받음.
 *   
 * - 서블릿 API 를 구성하는 각 객체들의 특징.
 *   1. Servlet 인터페이스
 *      - javax.servlet 패키지에 선언이 되어 있음.
 *      - Servlet 관련 추상 메서드를 제공함.
 *      - init(), service(), destroy(), getServletInfo(),
 *        getServletConfig() 추상 메서드가 선언되어 있음.
 *   
 *   2. ServletConfig 인터페이스
 *      - javax.servlet 패키지에 선언이 되어 있음.
 *      - Servlet 관련 추상 메서드를 제공함.
 *      - getInitParameter(), getInitParameterNames(),
 *        getServletContext(), getServletName() 추상 메서드가 선언되어 있음.
 *        
 *   3. GenericServlet 추상 클래스.
 *      - javax.servlet 패키지에 선언이 되어 있음.
 *      - 상위 두 인터페이스를 구현하여 일반적인 서블릿 기능을 구현한 클래스.
 *      - GenericServlet을 상속을 받아 구현한 사용자 서블릿은 사용되는 프로토콜에 따라 service() 메서드를 오버라이딩 하여 구현함.
 *        
 *   4. HttpServlet 클래스
 *      - javax.servlet 패키지에 선언이 되어 있음.
 *      - GenericServlet 을 상속받아 HTTP 프로토콜을 사용하는 웹 브라우저에서 서블릿 기능을 수행함.
 *      - 웹 브라우저 기반 서비스를 제공하는 서블릿을 만들 때 상속받아 사용함.
 *      - 요청 시 service() 가 호출되면 요청 방식에 따라 doGet()나 doPost() 메서드가 차례로 호출이 됨. 
 */

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에 method = "get" 이라고 적혀 있는 경우나 method 속성이 안 적혀진 경우 doGet() 메서드에서 처리.
		/*
		 * request 매개변수
		 * - 사용자(클라이언트)의 요청에 대한 정보를 처리.
		 * - 클라이언트로부터 Servlet으로 요청이 들어오게 되면, 요청 파라미터라는 것이 같이 오게 되는데 이것에 대한 분석은 request.getParamenter() 라는 메서드를 이용하여 파악을 함.
		 *   
		 * response 매개변수
		 * - 사용자의 요청 정보에 대한 처리 결과를 클라이언트에 응답하여 처리.
		 * - 요청을 파악을 했다면 클라이언트로 내보낼 응답을 작성해야 함. 
		 *   대부분의 웹 프로그래밍은 응답을 텍스트로 작성하며, 이 텍스트는 대부분 HTML 페이지 모양을 하고 있게 됨.
		 * - 여기서 응답은 텍스트를 기록해야 하는데, 이 때 스트림 이라는 개념을 이용하여 기록을 하게 됨. 
		 *   말 그대로 데이터의 흐름이라고 생각하면 됨.
		 *   Servlet에서는 클라이언트쪽으로 보내는 데이터의 흐름을 건드려야 할 필요가 있게 됨.
		 * - response 인자를 활용하면 응답과 관련된 많은 작업들을 할 수 있음. 
		 *   응답 스트림에 텍스트를 기록하는 것도 가능함. 이 작업을 하기 위해서는 response.getWriter() 라는 메서드를 사용하면 됨. 
		 *   해당 메서드를 이용하여 응답으로 내보낼 출력 스트림을 얻어낸 후에 출력 스트림에 텍스트를 기록하면 됨. 
		 */
		
		// 로그인 폼 페이지에서 넘어온 정보를 받아주면 됨.
		String id = request.getParameter("userId");
		String pwd = request.getParameter("userPwd");
		
		System.out.println("입력한 아이디 >>> " + id);
		System.out.println("입력한 비밀번호 >>> " + pwd);
		
		// 응답은 response 객체를 이용함.
		// 클라이언트로 응답 시 한글을 작성을 하면 한글이 깨져서 나오는 현상이 발생을 함.
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 클라이언트에 응답을 해 주면 됨.
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>");
		out.println("입력한 아이디 : " + id + "<br>");		
		out.println("입력한 비밀번호 : " + pwd + "<br>");		
		out.println("</h2>");		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에 method = "post" 이라고 적혀 있는 경우나 method 속성이 안 적혀진 경우 doPost() 메서드에서 처리.
		
	}
}