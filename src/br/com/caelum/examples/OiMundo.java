package br.com.caelum.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "MinhaServlet3", urlPatterns = { "/oi", "/eita" })
public class OiMundo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// Escreva o texto
		out.print("<html>");
		out.print("<body>");
		out.print("Eita! Minha Primeira servlet");
		out.println("Grandes evolução com GitHub.");
		out.print("</body>");
		out.print("</html>");
	}

}
