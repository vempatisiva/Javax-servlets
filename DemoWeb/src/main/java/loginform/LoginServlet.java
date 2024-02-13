package loginform;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
public class LoginServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // You should validate the username and password here
        // For simplicity, we'll assume a hardcoded valid username and password
        if (username.equals("siva") && password.equals("siva")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("home.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}