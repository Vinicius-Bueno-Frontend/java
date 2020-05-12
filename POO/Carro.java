package poo;

import java.util.Random;

//Aula 1 e 2 (Jos� de Assis): Abstra��o
//Classe-Modelo

public class Carro {
	int ano;
	String cor;
	
	//Primeiro Construtor (Sem par�metros)
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	//Segundo Construtor (Com 2 par�metros)
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	//M�todos
	void ligar() {
		System.out.println("engine ON .........");
	}
	
	void desligar() {
		System.out.println("engine OFF .");
	}
	
	void acelerar() {
		System.out.println("vrummmmmmmm");
	}
}
