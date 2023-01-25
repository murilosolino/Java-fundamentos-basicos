package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex8 {

	/*
	 * Faça um programa que pergunte o preço de três produtos e informe qual produto
	 * você deve comprar, sabendo que a decisão é sempre o mais barato.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3, menor;

		System.out.println("Digite 3 valores");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();

		if (num1 < num2 && num1 < num3) {
			menor = num1;
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
		System.out.println("O item de valor mais barato é " + menor);
	}
}
