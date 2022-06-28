package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Category;
import entity.Product;

@WebServlet("/Home")
public class HomeControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeControl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		List<Product> listRandom =dao.getRandomProduct();
		List<Product> list = dao.getAllProduct();
		List<Category> listC = dao.getAllCategory();
		Product last = dao.getLast();


		request.setAttribute("listRandom", listRandom);		
		request.setAttribute("listP", list);
		request.setAttribute("listC", listC);
		request.setAttribute("last", last);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
