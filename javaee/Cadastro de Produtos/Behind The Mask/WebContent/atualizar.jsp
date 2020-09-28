<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
String id = (String) request.getAttribute("id");
String nomeproduto = (String) request.getAttribute("nomeproduto");
String descricao = (String) request.getAttribute("descricao");
String preco = (String) request.getAttribute("preco");
String tamanho = (String) request.getAttribute("tamanho");
String genero = (String) request.getAttribute("genero");
String situacao = (String) request.getAttribute("situacao");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CRUD - Atualizar</title>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Varela+Round&display=swap" rel="stylesheet">
<link rel="stylesheet" href="estilo.css">
</head>
<body>
	<h1>Atualizar Produto</h1>
	<form name="frmNovo" action="update2">
		<table>
			<tr>
				<td><input type="text" name="id" value="<%=id %>" readonly class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="nomeproduto" value="<%=nomeproduto %>" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao" value="<%=descricao %>" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="preco" value="<%=preco %>" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="tamanho" value="<%=tamanho %>" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="genero" value="<%=genero %>" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="situacao" value="<%=situacao %>" class="Caixa1"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" onClick="validar()" class="BotãoNovo">
	</form>
	<script src="validador.js"></script>
</body>
</html>