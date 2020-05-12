package poo;

//Aula 1 e 2 (José de Assis): Abstração

public class Ferrari {

	//Exemplo 1 com a classe-modelo
	
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();

	}

}
