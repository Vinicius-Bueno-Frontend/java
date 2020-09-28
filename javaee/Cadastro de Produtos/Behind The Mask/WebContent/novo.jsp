<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CRUD - Novo</title>
<link rel="stylesheet" href="estilo.css">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Varela+Round&display=swap" rel="stylesheet">
</head>
<body>
<h1>Novo Produto</h1>
	<form name="frmNovo" action="insert" >
		<table>
			<tr>
				<td><input type="text" name="nomeproduto" placeholder="Nome do Produto" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao" placeholder="Descrição" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="preco" placeholder="Preço" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="tamanho" placeholder="Tamanho" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="genero" placeholder="Gênero" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="situacao" placeholder="Situação" class="Caixa1"></td>
			</tr>
		</table>
			<input type="button" value="Adicionar" onClick="validar()" class="BotãoNovo">
	</form>
	<script src="validador.js"></script>
</body>
</html>