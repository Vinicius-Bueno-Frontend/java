package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//<ctrl><shift><f> (alinhamento do c�digo)//
		//variaveis
		double nota1, nota2, media;
		//objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		//objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("C�lculo da m�dia");
		//entrada
		System.out.print("Digite a nota1: ");
		nota1 = leitor.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = leitor.nextDouble();
		//processamento
		media = (nota1 + nota2) / 2;
		//saida
		System.out.println("M�dia: " + formatador.format(media));
		if (media < 2) {
			System.out.println("Reprovado");
		} else if (media >= 2 && media < 5) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Aprovado");
		}
		
		leitor.close();
		
	}
	
}
