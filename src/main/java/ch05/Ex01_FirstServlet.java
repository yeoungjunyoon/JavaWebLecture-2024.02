package ch05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ex01_FirstServlet
 */
@WebServlet("/hello")
public class Ex01_FirstServlet extends HttpServlet {
	// Get 방식의 요청이 왔을때 처리해주는 코드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>첫번째 서블릿</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>자바에서 서블릿에서 작성한 코드입니다.</h1>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		response.setContentType("text/html;  charset-8");
		PrintWriter out =response.getWriter();
		out.print(html);
	}
	
	 // post 요청이 왔을때 처리해주는 코드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
