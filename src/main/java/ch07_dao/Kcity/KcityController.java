package ch07_dao.Kcity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.catalina.util.RequestUtil;

import ch07_dao.City;
import ch07_dao.CityDao;

@WebServlet("ch07/Kcity/*")
// @WebServlet({"ch07/Kcity/list","ch07/Kcity/insert","ch07/Kcity/update","ch07/Kcity/delete"})
public class KcityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CityDao cDao = new CityDao();

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requesUri = request.getRequestURI();
		String[] uri = requesUri.split("/");
		String action = uri[uri.length -1];
		
		switch (action) {
		case "list":
			String district = request.getParameter("district");
			district = (district == null || district.equals("")) ? "Kyonggi" : district;
			String num_ = request.getParameter("num");
			int num = (num_ == null || num_.equals("")) ? 10 : Integer.parseInt(num_);
			String offset_ = request.getParameter("offset");
			int offset = (offset_ == null || offset_.equals("")) ? 0 : Integer.parseInt(offset_);
			
			List<City> list = cDao.getCityList(district, num, offset);
			RequestDispatcher rd = request.getRequestDispatcher("/ch07/kcity/list.jsp");
			request.setAttribute("list", list);
			rd.forward(request,response);
			break;
			
		case "insert":
			
		case "update":
			
		case "delete":
			
			
		}
		
		PrintWriter out = response.getWriter();
		out.print(requesUri);
	}

}
