<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página 1</title>
</head>
<body>
	<h1>Página 1</h1>
	
	<%
		String nomeUsuario = "Antonio Carvalho - pela pagina 1";//poderia ser uma List, Map, etc...
		//application.setAttribute( "NOME", nomeUsuario );
		request.setAttribute( "NOME", nomeUsuario );
		//session.setAttribute( "NOME", nomeUsuario );
	%>
	
	<jsp:forward page="./pagina2.jsp" />
	<%-- <a href="./pagina2.asp">Página 2</a> --%>

</body>
</html>