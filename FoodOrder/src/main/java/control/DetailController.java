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

@WebServlet("/detail")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		String id = request.getParameter("pid");
		List<Category> listC = dao.getAllCategory();
		Product last = dao.getLast();
		Product product = dao.getProductByID(id);

		request.setAttribute("listC", listC);
		request.setAttribute("last", last);
		request.setAttribute("product", product);
		request.getRequestDispatcher("Detail.jsp").forward(request, response);
	}


}
