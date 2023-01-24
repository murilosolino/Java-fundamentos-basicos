package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex1 {
	/*
	 * Fácil 1- Faça um programa que peça dois números e verifique (usando if e
	 * else) e imprima o maior deles
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o primeiro número");
		num1 = scanner.nextInt();

		System.out.println("Digite o segundo número");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior");
		}
		else {
			System.out.println("O número " + num2 + " é maior");
		}
	}
}
