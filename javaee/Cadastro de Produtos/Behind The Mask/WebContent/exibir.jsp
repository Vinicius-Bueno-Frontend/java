<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.DAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.JavaBeans"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CRUD - Exibir</title>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Varela+Round&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="estilo.css">
</head>
<body>
	<h1>Estoque - BEHIND THE MASK</h1>
	<table>
		<thead>
			<th>ID</th>
			<th>Nome do Produto</th>
			<th>Descrição</th>
			<th>Preço</th>
			<th>Tamanho</th>
			<th>Gênero</th>
			<th>Situação</th>
			<th>Operações</th>
		</thead>
		<tbody>
			<%
				DAO acessoDAO = new DAO();
			ArrayList<JavaBeans> acessoJB = acessoDAO.exibirProdutos();
			for (int i = 0; i < acessoJB.size(); i++) {
			%>
			<tr>
				<td class="td2"><%=acessoJB.get(i).getId()%></td>
				<td class="td2"><%=acessoJB.get(i).getNomeproduto()%></td>
				<td class="td2"><%=acessoJB.get(i).getDescricao()%></td>
				<td class="td2"><%=acessoJB.get(i).getPreco()%></td>
				<td class="td2"><%=acessoJB.get(i).getTamanho()%></td>
				<td class="td2"><%=acessoJB.get(i).getGenero()%></td>
				<td class="td2"><%=acessoJB.get(i).getSituacao()%></td>
				<td class="td2"><a href="update1?id=<%=acessoJB.get(i).getId()%>"
					class="BotaoModificar">Modificar</a><a
					href="delete?id=<%=acessoJB.get(i).getId()%>" id="botaodelete">Deletar</a></td>
			</tr>

			<%
				}
			%>

		</tbody>
	</table>
</body>
</html>