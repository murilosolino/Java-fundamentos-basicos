package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex2 {
	/*
	 * 2- Faça um programa que peça um valor e mostre na tela se o valor é positivo
	 * ou negativo
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int valor;
		System.out.println("Digite um valor");
		valor = scanner.nextInt();
		
		if (valor >=0) {
			System.out.println("O valor " + valor + " é positivo");
		}
		else {
			System.out.println("O valor " + valor + " é negativo");
		}
	}
}
