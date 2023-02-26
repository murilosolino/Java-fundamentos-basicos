package OperacoesLogicasWhile;

import java.util.Scanner;

/*Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.*/

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, soma;
		String resposta = null;

		while (resposta == null || !resposta.equals("n")) {
			System.out.println("Operação Adição");

			System.out.println("Digite o primeiro numero: ");
			a = scanner.nextInt();

			System.out.println("Digite o segundo numero: ");
			b = scanner.nextInt();

			soma = a + b;

			System.out.println("Resultado: " + a + " + " + b + " = " + soma);

			System.out.println("Deseja realizar mais uma soma? [s ou n]");
			System.out.println("Resposta: ");
			resposta = scanner.next();

		}

	}
}
