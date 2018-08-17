package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class OiMundo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// Escreva o texto
		out.print("<html>");
		out.print("<body>");
		out.print("Primeira servlet");
		out.print("</body>");
		out.print("</html>");
	}

}
