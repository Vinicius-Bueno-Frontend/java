package poo;

//Aula 3 (Jos� de Assis): Heran�a
//Aula 4 (Jos� de Assis): Polimorfismo (Sobrescrita de um m�todo)

public class Cessna {

//Exemplo (Aula3): Usando um m�todo herdado (acelerar) da classe-modelo "Carro"
//Exemplo (Aula4): Sobrescrevendo o m�todo acelerar.
	
	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		cessna.ano = 2015;
		cessna.cor = "Branco";
		cessna.envergadura = 11;
		System.out.println("Avi�o: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Cor " + cessna.cor);
		System.out.println("Envergadura: " + cessna.envergadura + "m");
		cessna.ligar();
		cessna.acelerar();

	}

}
