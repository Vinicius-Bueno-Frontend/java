package poo;

//Aula 3 (Jos� de Assis): Heran�a
//Aula 4 (Jos� de Assis): Polimorfismo (Sobrescrita de um m�todo)

public class Aviao extends Carro{
	double envergadura;
	
	//M�todo
	void aterrizar() {
		System.out.println("----------____________");
	}
	
	//Polimorfismo
	void acelerar() {
		System.out.println("_______________-------------");
	}
}
