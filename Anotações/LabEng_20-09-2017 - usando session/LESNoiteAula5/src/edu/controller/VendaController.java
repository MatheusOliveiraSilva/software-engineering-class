package edu.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.entidade.Venda;

@WebServlet("/VendaController")
public class VendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VendaController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCliente = request.getParameter("nomeCliente");
		String plataforma = request.getParameter("plataforma");
		String descricao = request.getParameter("descricao");
		String data = request.getParameter("data");
		String valor = request.getParameter("valor");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Venda> listaVendas =  (List<Venda>)request.getSession().getAttribute("LISTA");
		
		//request.getSession().SetAttribute("LISTA", listaVendas);
		
		if(listaVendas == null) {
			listaVendas = new ArrayList<Venda>();
			request.getSession().getAttribute("LISTA");
		}
		Venda v = new Venda();
		v.setNomeCliente(nomeCliente);
		v.setDescricao(descricao);
		v.setPlataforma(plataforma);
		try {
			v.setData(sdf.parse(data));
			v.setValor(Float.parseFloat(valor));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		listaVendas.add(v);
		
		System.out.println( "Venda cadastrada");
		System.out.println( v );
		
		response.sendRedirect("./venda.jsp");
	}

}
