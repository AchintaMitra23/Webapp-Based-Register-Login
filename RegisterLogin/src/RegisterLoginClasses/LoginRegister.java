package RegisterLoginClasses;

import java.io.IOException;
//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public LoginRegister() {
        super();
    }
/*
	public void init(ServletConfig config) throws ServletException {}

	public void destroy() {}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		CustomerDAO cust = new CustomerOp();
		String userName = request.getParameter("user");
		String email = request.getParameter("email");
		String passWord = request.getParameter("pass");
		String phoneNo = request.getParameter("phone");
		String submit = request.getParameter("submit");
		Customer custom = new Customer();
		custom = cust.getCustomer(userName, passWord);
		
		if (submit.equals("LOGIN") && custom!=null && custom.getUserName()!=null) {
			request.setAttribute("msg", custom.getUserName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else if (submit.equals("REGISTER")) {
			custom.setUserName(userName);
			custom.setPassWord(passWord);
			custom.setEmail(email);
			custom.setPhoneNo(phoneNo);
			cust.insertData(custom);
			
			request.setAttribute("smsg", "Data has been inserted successfully...");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Data Not found...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
