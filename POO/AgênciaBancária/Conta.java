package contas;

public class Conta {
	// Atributos
	public String cliente;
	public double saldo;
	
	// Construtor
	public Conta() {
		System.out.println("Agência 0267");
	}
	
	// Método sem retorno e sem parâmetro
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	// Métodos sem retorno com parâmetros (dados = variáveis)
	void sacar(double valor) {
		saldo -= valor; //saldo = saldo - valor
		System.out.println("Débito: " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor; //saldo = saldo + valor
		System.out.println("Crédito: " + valor);
	}
	
	// Método sem retorno com objeto
	// Conta -> classe modelo
	// destino -> objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //1º você debita da conta
		destino.depositar(valor); //2º transferência
		System.out.println("Transferência: " + valor);
	}
	
	// Método com retorno
	// Não tem o void
	// É obrigatório retornar alguma coisa
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;
	}
}
