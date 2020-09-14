<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	   /**** Conexão com o Banco de Dados ****/
	   Connection con = null;
	   String driver = "com.mysql.cj.jdbc.Driver"; /* Driver de conexão */
	   String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC"; /*URL e IP*/
	   String user = "root"; /* Autenticação */
	   String password = ""; /* Autenticação */
	   /**** CRUD - CREATE ****/
	   try {
		   Class.forName(driver);
		   con = DriverManager.getConnection(url, user, password);
		   // Parâmetros capturados pelo formulário
		   String nome = request.getParameter("nome");
		   String telefone = request.getParameter("telefone");
		   String email = request.getParameter("email");
		   String create = "insert into contatos (nome,telefone,email) values('"+ nome +"','"+ telefone +"','"+ email +"')";
		   con.createStatement().executeUpdate(create);
		   // Após o insert, redirecionar para o arquivo agenda.jsp
		   response.sendRedirect("agenda.jsp");
	   } catch (Exception e){
		   out.println(e);
	   } finally {
		   con.close();
	   }
	%>
</body>
</html>