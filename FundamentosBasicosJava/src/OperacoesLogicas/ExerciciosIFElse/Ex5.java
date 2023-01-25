package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex5 {
	/*
	 * Faça um programa para a leitura de duas notas parciais de um aluno.
	 * 
	 * A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete; A
	 * mensagem “Aprovado com Distinção”, se a média for igual a dez; A mensagem
	 * “Reprovado” se a média for menor de do que sete;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nota1, nota2;

		System.out.println("Digite sua primeira nota");
		nota1 = scanner.nextDouble();

		System.out.println("Digite sua segunda  nota");
		nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
