package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/insert", "/update1", "/update2", "/delete" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JavaBeans acessoJB = new JavaBeans();
	DAO acessoDAO = new DAO();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/insert")) {
			novoProduto(request, response);
		} else if (action.contentEquals("/update1")) {
			atualizarProduto(request, response);
		} else if (action.contentEquals("/update2")) {
			atualizarProduto2(request, response);
		} else if (action.contentEquals("/delete")) {
			deletarProduto(request, response);
		}

	}

	protected void novoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeproduto = request.getParameter("nomeproduto");
		String descricao = request.getParameter("descricao");
		String preco = request.getParameter("preco");
		String tamanho = request.getParameter("tamanho");
		String genero = request.getParameter("genero");
		String situacao = request.getParameter("situacao");

		acessoJB.setNomeproduto(nomeproduto);
		acessoJB.setDescricao(descricao);
		acessoJB.setPreco(preco);
		acessoJB.setTamanho(tamanho);
		acessoJB.setGenero(genero);
		acessoJB.setSituacao(situacao);

		acessoDAO.novoProduto(acessoJB);
		response.sendRedirect("index.jsp");

	}

	protected void atualizarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		acessoJB.setId(id);
		acessoDAO.atualizarProduto(acessoJB);
		request.setAttribute("id", acessoJB.getId());
		request.setAttribute("nomeproduto", acessoJB.getNomeproduto());
		request.setAttribute("descricao", acessoJB.getDescricao());
		request.setAttribute("preco", acessoJB.getPreco());
		request.setAttribute("tamanho", acessoJB.getTamanho());
		request.setAttribute("genero", acessoJB.getGenero());
		request.setAttribute("situacao", acessoJB.getSituacao());
		RequestDispatcher rd = request.getRequestDispatcher("atualizar.jsp");
		rd.forward(request, response);
	}

	protected void atualizarProduto2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		acessoJB.setId(request.getParameter("id"));
		acessoJB.setNomeproduto(request.getParameter("nomeproduto"));
		acessoJB.setDescricao(request.getParameter("descricao"));
		acessoJB.setPreco(request.getParameter("preco"));
		acessoJB.setTamanho(request.getParameter("tamanho"));
		acessoJB.setGenero(request.getParameter("genero"));
		acessoJB.setSituacao(request.getParameter("situacao"));
		acessoDAO.alterarProduto(acessoJB);
		response.sendRedirect("exibir.jsp");
	}

	protected void deletarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		// System.out.println(id);
		acessoJB.setId(id);
		acessoDAO.deletarProduto(acessoJB);
		response.sendRedirect("index.jsp");
	}
}
