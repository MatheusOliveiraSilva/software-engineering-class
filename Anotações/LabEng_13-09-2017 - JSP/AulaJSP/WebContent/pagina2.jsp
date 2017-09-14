<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página 2</title>
</head>
<body>
	<h1>Página 2</h1>
	<%
		//String nome = (String)application.getAttribute("NOME"); // application.getAttribute sempre retonr um Object
		String nome = (String)request.getAttribute("NOME"); // application.getAttribute sempre retonr um Object
		//String nome = (String)session.getAttribute("NOME");
	%>
	
	<h2>Objeto resgatado pela chave NOME: <%=nome%></h2> <%--Em <%=nome%> é chamada a variável criada na linha acima --%>

</body>
</html>