package poo;

//Aula 1 e 2 (Jos� de Assis): Abstra��o

public class Camaro {

	//Usando o primeiro construtor (sem par�metro)
	
	public static void main(String[] args) {
		Carro camaro = new Carro();
		camaro.ano = 2012;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		camaro.acelerar();

	}

}
