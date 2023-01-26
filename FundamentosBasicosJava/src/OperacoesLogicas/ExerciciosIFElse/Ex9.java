package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex9 {
	/*
	 * 9- Faça um programa que leia três números e mostre-os em ordem decrescente.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite 3 números");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if (a>=b && a>=c && b>=c) {
			System.out.println("A ordem decrescente é: " + a + " " + b + " " + c );
		}
		else if (a>=b && a>=c && c>=b) {
			System.out.println("A ordem decrescente é: " + a + " " + c + " " + b );
		}
		else if (b>=a && b>=c && a>=c) {
			System.out.println("A ordem decrescente é: " + b + " " + a + " " + c );
		}
		else if (b>=a && b>=c && c>=a) {
			System.out.println("A ordem decrescente é: " + b + " " + c + " " + a );
		}
		else if (c>=a && c>=b && b>=a) {
			System.out.println("A ordem decrescente é: " + c + " " + b + " " + a );
		}
		else if (c>=a && c>=b && a>=b) {
			System.out.println("A ordem decrescente é: " + c + " " + a + " " + b );
		}
		
	}
}
