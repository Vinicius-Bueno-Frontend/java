package poo;

//Aula 3 (José de Assis): Herança
//Aula 4 (José de Assis): Polimorfismo (Sobrescrita de um método)

public class Aviao extends Carro{
	double envergadura;
	
	//Método
	void aterrizar() {
		System.out.println("----------____________");
	}
	
	//Polimorfismo
	void acelerar() {
		System.out.println("_______________-------------");
	}
}
