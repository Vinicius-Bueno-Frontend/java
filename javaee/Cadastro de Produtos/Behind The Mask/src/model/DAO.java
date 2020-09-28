package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	Connection con = null;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbmask?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return con;
	}

	public void novoProduto(JavaBeans acessoJB) {
		String create = "insert into tbprodutos (nomeproduto,descricao,preco,tamanho,genero,situacao) values (?,?,?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, acessoJB.getNomeproduto());
			pst.setString(2, acessoJB.getDescricao());
			pst.setString(3, acessoJB.getPreco());
			pst.setString(4, acessoJB.getTamanho());
			pst.setString(5, acessoJB.getGenero());
			pst.setString(6, acessoJB.getSituacao());

			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<JavaBeans> exibirProdutos() {
		ArrayList<JavaBeans> acessoJB = new ArrayList<>();
		String read = "select * from tbprodutos order by nomeproduto";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nomeproduto = rs.getString(2);
				String descricao = rs.getString(3);
				String preco = rs.getString(4);
				String tamanho = rs.getString(5);
				String genero = rs.getString(6);
				String situacao = rs.getString(7);
				acessoJB.add(new JavaBeans(id, nomeproduto, descricao, preco, tamanho, genero, situacao));
			}
			return acessoJB;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void atualizarProduto(JavaBeans acessoJB) {
		String update1 = "select * from tbprodutos where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update1);
			pst.setString(1, acessoJB.getId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				acessoJB.setId(rs.getString(1));
				acessoJB.setNomeproduto(rs.getString(2));
				acessoJB.setDescricao(rs.getString(3));
				acessoJB.setPreco(rs.getString(4));
				acessoJB.setTamanho(rs.getString(5));
				acessoJB.setGenero(rs.getString(6));
				acessoJB.setSituacao(rs.getString(7));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void alterarProduto(JavaBeans acessoJB) {
		String update2 = "update tbprodutos set nomeproduto=?, descricao=?, preco=?, tamanho=?, genero=?, situacao=? where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update2);
			pst.setString(1, acessoJB.getNomeproduto());
			pst.setString(2, acessoJB.getDescricao());
			pst.setString(3, acessoJB.getPreco());
			pst.setString(4, acessoJB.getTamanho());
			pst.setString(5, acessoJB.getGenero());
			pst.setString(6, acessoJB.getSituacao());
			pst.setString(7, acessoJB.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletarProduto(JavaBeans acessoJB) {
		String delete = "delete from tbprodutos where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, acessoJB.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}