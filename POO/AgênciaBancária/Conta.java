package contas;

public class Conta {
	// Atributos
	public String cliente;
	public double saldo;
	
	// Construtor
	public Conta() {
		System.out.println("Ag�ncia 0267");
	}
	
	// M�todo sem retorno e sem par�metro
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	// M�todos sem retorno com par�metros (dados = vari�veis)
	void sacar(double valor) {
		saldo -= valor; //saldo = saldo - valor
		System.out.println("D�bito: " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor; //saldo = saldo + valor
		System.out.println("Cr�dito: " + valor);
	}
	
	// M�todo sem retorno com objeto
	// Conta -> classe modelo
	// destino -> objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //1� voc� debita da conta
		destino.depositar(valor); //2� transfer�ncia
		System.out.println("Transfer�ncia: " + valor);
	}
	
	// M�todo com retorno
	// N�o tem o void
	// � obrigat�rio retornar alguma coisa
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;
	}
}
