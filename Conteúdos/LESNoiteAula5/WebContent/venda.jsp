<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="edu.entidade.Venda, java.text.SimpleDateFormat, java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Venda de produto</title>
</head>
<body>
	<h1>Venda de produto</h1>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Venda vendaAtual = (Venda) session.getAttribute("VENDAATUAL");
		List<Venda> vendasEncontradas = (List<Venda>) session.getAttribute("VENDASENCONTRADAS");
		if (vendaAtual == null) { 
			vendaAtual = new Venda();
		}
	%>
	<form action="./VendaController" method="post">
		<table>
			<tr>
				<td>Nome do Cliente</td>
				<td><input type="text" name="nomeCliente" value="<%=vendaAtual.getNomeCliente()%>"/></td>
			</tr>
			<tr>
				<td>Plataforma</td>
				<td>
					<select name="plataforma">
						<option value="xbox" <%=vendaAtual.getPlataforma().equals("xbox") ? "selected" : ""%>>XBox 360</option>
						<option value="xboxone" <%=vendaAtual.getPlataforma().equals("xboxone") ? "selected" : ""%>>XBox One</option>
						<option value="ps3" <%=vendaAtual.getPlataforma().equals("ps3") ? "selected" : ""%>>Playstation III</option>
						<option value="ps4" <%=vendaAtual.getPlataforma().equals("ps4") ? "selected" : ""%>>Playstation IV</option>
						<option value="pc" <%=vendaAtual.getPlataforma().equals("pc") ? "selected" : ""%>>PC</option>
						<option value="gameboy" <%=vendaAtual.getPlataforma().equals("gameboy") ? "selected" : ""%>>Game Boy</option>
						<option value="nintendoswitch" <%=vendaAtual.getPlataforma().equals("nintendoswitch") ? "selected" : ""%>>Nintendo Switch</option>
						<option value="nintendowii" <%=vendaAtual.getPlataforma().equals("nintendowii") ? "selected" : ""%>>Nintendo Wii</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Data</td>
				<td><input type="text" name="data" value="<%=sdf.format(vendaAtual.getData())%>"/></td>
			</tr>		
			<tr>
				<td>Valor</td>
				<td><input type="text" name="valor" value="<%=vendaAtual.getValor()%>"/></td>
			</tr>				
			<tr>
				<td>Descri��o</td>
				<td>
					<textarea rows="5" cols="30"  name="descricao"><%=vendaAtual.getDescricao()%></textarea>
				</td>
			</tr>		
			<tr>
				<td><input type="submit" value="Adicionar" name="cmd"/></td>
				<td><input type="submit" value="Pesquisar" name="cmd"/></td>
			</tr>
		</table>
		
		<%	if (vendasEncontradas != null) {  %>
			<table>
			<%
				for (Venda v : vendasEncontradas) {	
			%>
				<tr>
					<td><%=v.getNomeCliente()%></td>
					<td><%=v.getPlataforma()%></td>
					<td><%=sdf.format(v.getData())%></td>
					<td><%=v.getValor()%></td>
				</tr>
				
			<%	} %>
			</table>
		<%	}%>
	</form>
</body>
</html>