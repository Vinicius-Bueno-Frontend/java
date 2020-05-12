package poo;

//Aula 3 (José de Assis): Herança
//Aula 4 (José de Assis): Polimorfismo (Sobrescrita de um método)

public class Cessna {

//Exemplo (Aula3): Usando um método herdado (acelerar) da classe-modelo "Carro"
//Exemplo (Aula4): Sobrescrevendo o método acelerar.
	
	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		cessna.ano = 2015;
		cessna.cor = "Branco";
		cessna.envergadura = 11;
		System.out.println("Avião: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Cor " + cessna.cor);
		System.out.println("Envergadura: " + cessna.envergadura + "m");
		cessna.ligar();
		cessna.acelerar();

	}

}
