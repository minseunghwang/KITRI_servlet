package step3_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiServlet
 */
@WebServlet("/MultiServlet")
public class MultiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		out.println("성별 : " + gender);
		out.println("<hr>");
		
		String kisoo = request.getParameter("kisoo");
		out.println("기수 : " + kisoo + "기");
		out.println("<hr>");
		
		String str = "";
		String people[] = request.getParameterValues("names");
		for(int i=0; i<people.length; i++) {
			str += people[i];
		}
		out.println("선택한 사람 : " + str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
