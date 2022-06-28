package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Product;

/**
 * Servlet implementation class ForwardEdit
 */
@WebServlet("/forwardEdit")
public class ForwardEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForwardEdit() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pid = request.getParameter("pid");
		DAO dao = new DAO();
		Product product = dao.getProductByID(pid);
		request.setAttribute("pid", pid);
		request.setAttribute("product", product);
		request.getRequestDispatcher("EditProduct.jsp").forward(request, response);

	}

}
