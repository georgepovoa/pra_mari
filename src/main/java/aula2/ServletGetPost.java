package aula2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPost
 */
@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		 
	      saida.write("<HTML><BODY>Olá! ");
	 
	      saida.write("Mesma resposta para o método GET.");
	 
	      saida.write("</BODY></HTML>");
	 
	      saida.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		 
		   saida.write("<HTML><BODY>Olá! ");
		   
		   String PrimeiroNome = request.getParameter("PrimeiroNome");
		   String UltimoNome = request.getParameter("UltimoNome");
		   
		 
		   saida.write("<br/>Muito Obrigado por acessar esse humilde teste para a questão 1 Senhor ou Senhora <br/>");
		   saida.write(PrimeiroNome + " ");
		   saida.write(UltimoNome);
		   saida.write("</BODY></HTML>");
		 
		   saida.close();

	}

}
