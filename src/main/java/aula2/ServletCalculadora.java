package aula2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
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
		PrintWriter saida = response.getWriter();
		 
		   saida.write("<HTML><BODY>Olá! ");
		   
		   int num1 = Integer.parseInt(request.getParameter("num1")); 
		   int num2 = Integer.parseInt(request.getParameter("num2")); 
		   int num3 = Integer.parseInt(request.getParameter("num3")); 
		   int num4 = Integer.parseInt(request.getParameter("num4")); 
		   int result = num1+num2+num3+num4;
		   
		 
		   saida.write("<br/>A soma de todos os parametros enviados é igual à <br/> "+ result);
		   saida.write(result);

		   saida.write("</BODY></HTML>");
		 
		   saida.close();
	}

}
