<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%//NÃO ESQUECER DE IMPORTAR OS OBJETOS UTILIZADOS %>
<%@ page import="java.util.LinkedList"%>
<%@ page import="objetos.Carro"%>
    
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<!-- SE VOCÊ TIVER UM CSSS, IMPORTE-O ABAIXO! -->
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Listagem de Carros</title>
</head>

<body>

<% 
@SuppressWarnings("unchecked")
LinkedList<Carro> listagemRet = (LinkedList<Carro>) session.getAttribute("lista"); 
%>

<a class="botao" href="../index.jsp">Cadastrar Carro</a>

<table>
	<tr>
		<th>Placa</th>
		<th class="ordenado">Montadora</th>
		<th>Modelo</th>
		<th>Ano</th>
		<th>Opcionais</th>
	</tr>
<% for(Carro instancia: listagemRet){ %>
	<%int a = instancia.getOpcionais().length + 1; %>
	<tr>
		<td rowspan="<%=a %>"><%=instancia.getPlaca()%></td>
		<td rowspan="<%=a %>"><%=instancia.getMontadora()%></td>
		<td rowspan="<%=a %>"><%=instancia.getModelo()%></td>
		<td rowspan="<%=a %>"><%=instancia.getAno()%></td>
			<%for (String opcional : instancia.getOpcionais()) { %>
				<%if(opcional.equals("null")){%>				
	        		<tr><td><%="n/a"%></td></tr>
	        	<%} else { %>
	        		<tr><td><%=opcional%></td></tr>
	        	<% } %>
        	<% } %>
	</tr>
	
<%} %>
</table>

</body>
</html>