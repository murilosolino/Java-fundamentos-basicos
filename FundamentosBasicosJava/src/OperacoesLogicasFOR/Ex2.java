package OperacoesLogicasFOR;

import java.util.Scanner;

/*Faça um programa, utilizando for, que peça para o usuário inserir um número N e mostre na tela todos os números ímpares até N.

*/
public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, impar;
		System.out.println("Insira um número:");
		n = scanner.nextInt();
		System.out.println("Números impares até " + n);
		for (impar = 1; impar <= n; impar += 2) {

			System.out.print(impar + " ");
		}
	}
}
