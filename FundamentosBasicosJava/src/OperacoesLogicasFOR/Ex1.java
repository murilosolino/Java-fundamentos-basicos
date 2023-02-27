package OperacoesLogicasFOR;

import java.util.Scanner;

public class Ex1 {
	/*
	 * Faça um programa, utilizando for, que permita o usuário fazer três contas de
	 * subtração.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, subtracao, resultado;

		for (subtracao = 1; subtracao <= 3; subtracao++) {
			System.out.println("Digite os números para a subtração");
			System.out.println("Digite o 1º numero: ");
			a = scanner.nextInt();
			System.out.println("Digite o 2º numero: ");
			b = scanner.nextInt();
			resultado = a - b;
			System.out.println("Resultado = " + resultado + "\n");
		}
	}
}
