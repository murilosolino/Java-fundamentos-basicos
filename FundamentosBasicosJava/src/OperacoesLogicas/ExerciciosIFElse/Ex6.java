package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex6 {
	/*
	 * 6- Faça um programa que leia três números, verifique (usando if e else), e
	 * mostre o maior deles.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Digite 3 números");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O numéro " + num1 + " é o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O numéro " + num2 + " é o maior");
		} else{
			System.out.println("O numéro " + num3 + " é o maior");
		}

	}
}
