package poo;

//Aula 1 e 2 (José de Assis): Abstração

public class Camaro {

	//Usando o primeiro construtor (sem parâmetro)
	
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
