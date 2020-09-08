import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Login() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		if (name.equalsIgnoreCase("achinta") && pass.equalsIgnoreCase("12345")) {
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}
