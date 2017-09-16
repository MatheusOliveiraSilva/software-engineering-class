package edu.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Hello")
public class MeuServlet extends HttpServlet{
	
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("Servlet acionado...");
		
		String profissao = request.getParameter("profissao");
		String nome = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		out.println("<h1>Servlet acionado...</h1>");
		out.println("<h2>Este servlet foi acionado pelo metodo GET</h2>");
		out.println("<p>Bem vindo "+nome+"</p>");
		out.println("<p>Parametro (profissão) : "+profissao+"</p>");		
		out.flush();
	}
	
}
