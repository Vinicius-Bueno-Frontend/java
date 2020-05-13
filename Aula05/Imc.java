package imc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vinicius Bueno Silva
 *
 */

public class Imc {

	public static void main(String[] args) {
		//variaveis
		double peso, altura, imc;
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
		imc = peso / (altura * altura);
		//saida
		System.out.println("IMC: " + formatador.format(imc));
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9 ) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc <= 29.9 ) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9 ) {
			System.out.println("Obesidade grau 1");
		} else if (imc >= 35 && imc <= 39.9 ) {
			System.out.println("Obesidade grau 2 (severa)");
		} else {
			System.out.println("Obesidade grau 3(mórbida)");
		}
		
		leitor.close();
	}

}
