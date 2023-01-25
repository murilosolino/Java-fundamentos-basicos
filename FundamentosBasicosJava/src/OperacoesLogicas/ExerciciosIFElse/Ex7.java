package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex7 {
	/*
	 * 7- Faça um programa que leia três números, verifique (usando if e else) e
	 * 	  mostre o maior e o menor deles;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3, maior, menor;

		System.out.println("Digite 3 números");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			maior = num1;
		}

		else if (num2 > num1 && num2 > num3) {
			maior = num2;
		}

		else {
			maior = num3;
		}
		
		if (num1 < num2 && num1 < num3) {
			menor=num1;		
		}
		else if (num2 < num1 && num2 < num3) {
			menor=num2;
		}
		else {
			menor=num3;
		}

		System.out.println("Maior número: " + maior + " Menor número: " + menor);
	}
}
