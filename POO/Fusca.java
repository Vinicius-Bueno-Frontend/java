package poo;

//Aula 1 e 2 (Jos� de Assis): Abstra��o

public class Fusca {

	//Exemplo 2: Usando os 3 m�todos
	
	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1968;
		fusca.cor = "Azul";
		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();

	}

}
