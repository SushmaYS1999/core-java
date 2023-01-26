package tetra3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/famJam")
public class FamJam extends HttpServlet{

	public FamJam() {
		System.out.println("welcome to home tour");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in family server..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget inside...");
		System.out.println(Thread.currentThread().getName());
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String Gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String Location=req.getParameter("place");
		String Collage=req.getParameter("collage");
		String Employee=req.getParameter("emp");
		String surname=req.getParameter("sname");
		String FatherName=req.getParameter("fathername");
		String MotherName=req.getParameter("mothername");
		String SiblingName=req.getParameter("brothername");
		String siblingAge=req.getParameter("broAge");
		String siblingEducation=req.getParameter("broeducation");
		String NoOfCousins=req.getParameter("cousins");
		String FavCousinName=req.getParameter("fav");
		String GrandMother=req.getParameter("gmaa");
		String GrandFather=req.getParameter("gpaa");
		String Nephew=req.getParameter("child");
		String NephewGender=req.getParameter("nephew");
		String familySurName=req.getParameter("famsurName");

		
		System.out.println(name);
		System.out.println(age);
		System.out.println(Gender);
		System.out.println(dob);
		System.out.println(Location);
		System.out.println(Collage);
		System.out.println(Employee);
		System.out.println(surname);
		System.out.println(FatherName);
		System.out.println(MotherName);
		System.out.println(SiblingName);
		System.out.println(siblingAge);
		System.out.println(siblingEducation);
		System.out.println(NoOfCousins);
		System.out.println(FavCousinName);
		System.out.println(GrandMother);
		System.out.println(GrandFather);
		System.out.println(Nephew);
		System.out.println(NephewGender);
		System.out.println(familySurName);
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:purple;'>");
		write.print(FavCousinName+ " is sushma's fav cousin");
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy in server method");
	}
}
