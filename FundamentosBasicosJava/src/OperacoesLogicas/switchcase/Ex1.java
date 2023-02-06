package OperacoesLogicas.switchcase;

import java.util.Scanner;

public class Ex1 {
	/*
	 * Desenvolva um programa que receba como entrada um número inteiro que
	 * represente um dos 7 dias da semana e imprima na tela se esse dia é útil,
	 * final de semana ou inválido.
	 * 
	 * Considere que Domingo é o dia 1 e Sábado o dia 7
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dia;

		System.out.println("Digite um avlor para saber a ultilidade do dia");

		dia = scanner.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Sábado - dia não útil");
			break;
		case 2:
			System.out.println("Segunda Feira - dia útil");
			break;
		case 3:
			System.out.println("Terça Feira - dia útil");
			break;
		case 4:
			System.out.println("Quarta Feira - dia útil");
			break;
		case 5:
			System.out.println("Quinta Feira - dia útil");
			break;
		case 6:
			System.out.println("Sexta Feira - dia útil");
			break;
		case 7:
			System.out.println("Domingo - dia não útil");
			break;
		default:
			System.out.println("Valor inválido");
			break;

		}
	}
}
