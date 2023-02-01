package OperacoesLogicas;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nota1 = 70;
		int nota2 = 70;
		int media = 0;

		media = (nota1 + nota2) / 2;

		/* SWITCH CASE: OPERAÇÕES EXTRAS */
		switch (media) {
		case 70:
			System.out.println("Aluno aprovado");
			break;
		case 50:
			System.out.println("Aluno reprovado");
			break;
		default:
			System.out.println("Valor não encontrado" + media);
			break;
		}
		int dia;
		
		System.out.println("Digite um valor de 1 a 7");
		
		dia = scanner.nextInt();
		
		switch (dia) {

		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-feira");
			break;

		case 3:
			System.out.println("Terça-feira");
			break;

		case 4:
			System.out.println("Quarta-feira");
			break;

		case 5:
			System.out.println("quinta-feira");
			break;

		case 6:
			System.out.println("Sexta-feira");
			break;

		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Valor não corresponde a nenhum dia da semana ");
			break;

		}

	}
}
