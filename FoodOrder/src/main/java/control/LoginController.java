package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Account;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String user = request.getParameter("username") ;
	 String pass = request.getParameter("password");
	 DAO dao = new DAO();
	 Account acc =  dao.login(user, pass);
	
	 if(acc == null ) {
		 request.setAttribute("mess", "Wrong user or password");
		 request.getRequestDispatcher("Login.jsp").forward(request, response);
	
	 } else if (acc.getIsAdmin()==1) {
		 response.sendRedirect("managerProduct");
		
	} 	else {	 
		 HttpSession session = request.getSession();
		session.setAttribute("acc", acc);
		session.setMaxInactiveInterval(300);
		response.sendRedirect("Home");	
	} 
	 
	
	}

}
