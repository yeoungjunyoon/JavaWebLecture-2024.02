package ch06.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// localhost:8080/jw/ch06/params?id=101&title=title
// localhost:8080/jw/ch06/params?id=&title=				입력값은 ""
// localhost:8080/jw/ch06/params						입력값은 null
@WebServlet("/ch06/params")
public class Ex02_Parameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	String id_ = req.getParameter("id");
//    	int id = Integer.parseInt(id_);			// id 값이 안들어오면 예외 발생
    	int id = 0;			// 입력이 안됐을때 사용하는 기본값
    	if (id_ != null && !id_.equals(""))
    		id = Integer.parseInt(id_);
    	
    	String title = req.getParameter("title");
    	System.out.println("GET id: " + id + ", title: " + title);
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id_ = req.getParameter("id");
		int id = 0;			// 입력이 안됐을때 사용하는 기본값
    	if (id_ != null && !id_.equals(""))
    		id = Integer.parseInt(id_);
    	
    	String title = req.getParameter("title");
    	System.out.println("POST id: " + id + ", title: " + title);
	}

}