package model;

public class JavaBeans {
	private String id;
	private String nomeproduto;
	private String descricao;
	private String preco;
	private String tamanho;
	private String genero;
	private String situacao;
	
	public JavaBeans() {
		
	}
	

	public JavaBeans(String id, String nomeproduto, String descricao, String preco, String tamanho, String genero, String situacao) {
		this.id = id;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.preco = preco;
		this.tamanho = tamanho;
		this.genero = genero;
		this.situacao = situacao;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}

