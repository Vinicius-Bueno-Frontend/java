package poo;

//Aula 1 e 2 (José de Assis): Abstração

public class Uno {
	
	//Usando o segundo construtor (Com 2 parâmetros)

	public static void main(String[] args) {
		Carro uno = new Carro(1991, "Branco");
		System.out.println("Carro: Uno");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		uno.ligar();
	}

}
