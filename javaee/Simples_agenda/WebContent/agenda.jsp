<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Agenda de Contatos</title>
</head>
<body>
	<h1>Agenda de Contatos</h1>
	<p>
		<a href="novo.html">Criar um novo contato</a>
	</p>
	<%
	   /**** Conexão com o Banco de Dados ****/
	   Connection con = null;
	   String driver = "com.mysql.cj.jdbc.Driver"; /* Driver de conexão */
	   String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC"; /*URL e IP*/
	   String user = "root"; /* Autenticação */
	   String password = ""; /* Autenticação */
	   /**** CRUD - READ ****/
	   try {
		   Class.forName(driver);
		   con = DriverManager.getConnection(url, user, password);
		   String read = "select * from contatos order by nome";
		   ResultSet rs = con.createStatement().executeQuery(read);
		   while(rs.next()) {
			   out.println(rs.getString(2));
			   out.println(" | ");
			   out.println(rs.getString(3));
			   out.println(" | ");
			   out.println(rs.getString(4));
			   out.println("<br>");
		   }
	   } catch (Exception e){
		   out.println(e);
	   } finally {
		   con.close();
	   }
	%>
</body>
</html>