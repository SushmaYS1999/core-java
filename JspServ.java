

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspServ
 */
@WebServlet(name = "jspServ", urlPatterns = { "/sms" })
public class JspServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JspServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost inside server..");
		String FirstName = req.getParameter("fname");
		String SecondName = req.getParameter("sname"); 
		String Gender = req.getParameter("gender");
		String Reason = req.getParameter("reason");
		String Address = req.getParameter("address");
		
		RequestDispatcher dispacher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", FirstName);
		req.setAttribute("sname", SecondName);
		req.setAttribute("gender", Gender);
		req.setAttribute("reason", Reason);
		req.setAttribute("address", Address);
		dispacher.forward(req, resp);
		//doGet(request, response);
	}

}
