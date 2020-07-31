package step3_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBoxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// getParametersValues(); 이름이 name인 모든 파라미터의 값을 배열로 구한다. 존재하지 않을 경우 null 값. 리턴타입 String[]
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String str1 = "";
		String menu[] = request.getParameterValues("menu");		// 배열타입을 받을때 사용한다.
		for(int i=0;i<menu.length;i++) {
			str1 += menu[i];
		}
		out.println(str1+" "+"선택");
	}

}
