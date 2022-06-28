package control;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class SeachController
 */
@WebServlet("/search")
public class SeachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeachController() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String txtSearch = request.getParameter("txt");
		DAO dao = new DAO();
		List<Product> seachProduct = dao.getProductByName(txtSearch);
		List<Product> listRandom =dao.getRandomProduct();
		List<Category> listC = dao.getAllCategory();
		Product last = dao.getLast();
	
		request.setAttribute("listRandom", listRandom);	
		request.setAttribute("listC", listC);
		request.setAttribute("last", last);
		request.setAttribute("listP", seachProduct);
		request.setAttribute("seach", txtSearch);
		request.getRequestDispatcher("Home.jsp").forward(request, response);

	}

}
