<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, br.com.caelum.dao.*,br.com.caelum.modelo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<% ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();
			
			for(Contato contato : contatos) {
		%>
			<tr>
				<p>Nome:
				<td><%=contato.getNome() %></td></p>
				<td><%=contato.getEmail() %></td>
				<td><%=contato.getEndereco() %></td>
				<td><%=contato.getDataNascimento().getTime() %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>