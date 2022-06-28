package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;


@WebServlet("/add")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	     String name = request.getParameter("txtName");
	     String image= request.getParameter("txtImage");
	     String priceP  = request.getParameter("txtPrice");
	     Double price= Double.parseDouble(priceP);
	     String title = request.getParameter("txtTitle");
	     String description = request.getParameter("txtDescription");
	     String CID = request.getParameter("txtLoai");
	     Integer cID= Integer.parseInt(CID);
	     
	     DAO dao= new DAO();
	    dao.addProduct(name, image, price, title, description, cID);
	     
	     response.sendRedirect("managerProduct");
	}

}
