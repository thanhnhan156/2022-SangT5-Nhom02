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

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/signup")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignUpController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		String repass = request.getParameter("repassword");

		DAO dao = new DAO();

		if (!pass.equalsIgnoreCase(repass)) {
			request.setAttribute("error", "Nhập lại mật khẩu không khớp!!");
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		} else if (dao.checkAccount(user) != null) {
			request.setAttribute("check", "Tài khoản đã tồn tại!");
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		} else {
			dao.addAccount(user, pass);
			Account acc = dao.login(user, pass);
			HttpSession accSession = request.getSession();
			accSession.setAttribute("acc", acc);
			accSession.setMaxInactiveInterval(300);
			response.sendRedirect("Home");
		}

	}

}
