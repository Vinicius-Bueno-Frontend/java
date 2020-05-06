package exercicios;

import java.util.Scanner;

public class Jokenpow {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int computador, jogador;
		System.out.println("-----JokenPow-----");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("");
		System.out.print("Digite um numero: ");
		jogador = leitor.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Digite entre 1 - 3 ");
			break;
		}
		
		if (jogador > 3) {
			System.exit(0);
		}
		
		computador = (int) (Math.random() * 3 + 1);

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra ");
			break;
		case 2:
			System.out.println("Computador escolheu Papel ");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura ");
			break;
		}
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1
				|| jogador == 3 && computador == 2) {
			System.out.println("Jogador Venceu");
		} else {
			System.out.println("Computador Venceu");
		}
		leitor.close();
	}


	}


