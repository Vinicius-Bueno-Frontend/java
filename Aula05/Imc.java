package imc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		//variaveis
		double peso, altura, media;
		//objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		//objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo do IMC");
		//entrada
		System.out.print("Peso: ");
		peso = leitor.nextDouble();
		System.out.print("Altura: ");
		altura = leitor.nextDouble();
		//processamento
		media = peso / (altura * altura);
		//saida
		System.out.println("Média: " + formatador.format(media));
		if (media < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (media >= 18.5 && media <= 24.9 ) {
			System.out.println("Peso normal");
		} else if (media >= 25 && media <= 29.9 ) {
			System.out.println("Sobrepeso");
		} else if (media >= 30 && media <= 34.9 ) {
			System.out.println("Obesidade grau 1");
		} else if (media >= 35 && media <= 39.9 ) {
			System.out.println("Obesidade grau 2 (severa)");
		} else {
			System.out.println("Obesidade grau 3(mórbida)");
		}
		
		leitor.close();
	}

}
