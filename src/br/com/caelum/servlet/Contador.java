package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class Contador extends HttpServlet {
	private int contador = 0; // Variável de instância

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		contador++; // a cada requisição a mesma variável é incrementada

		// Recebe o writer
		PrintWriter out = response.getWriter();

		// Escreve o texto
		out.println("<html>");
		out.println("<body>");
		out.println("Contado agora é: " + contador);
		out.println("</body>");
		out.println("</html>");
	}
}
