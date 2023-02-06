package OperacoesLogicas.switchcase;

import java.util.Scanner;

public class Ex2 {
	/*
	 * Desenvolva um programa que simule as 4 operações matemáticas básicas.
	 * 
	 * A entrada para a escolha de uma das 4 operações disponíveis é dada da
	 * seguinte forma:
	 * 
	 * Soma Subtração Multiplicação Divisão Seguida dos 2 operandos que participarão
	 * efetivamente da operação.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int operacao, a, b;
		
		System.out.println("Digite a operação que deseja \n" + "1-soma \n" + "2-subtração \n" + "3-multiplicação \n"
		+ "4-divisão");
		operacao = scanner.nextInt();
		
		System.out.println("Digite os dois números para a operação");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		switch (operacao) {
		case 1:
			int soma = a + b;
			System.out.println("Resultado da soma = " + soma);
			break;
		case 2:
			int sub = a - b;
			System.out.println("Resultado da sub = " + sub);
			break;
		case 3:
			int mult = a * b;
			System.out.println("Resultado da mult = " + mult);
			break;
		case 4:
			int div = a / b;
			System.out.println("Resultado da div = " + div);
			break;
		default:
			System.out.println("Operação inválida");
			break;
		}
		
		
	}
}
