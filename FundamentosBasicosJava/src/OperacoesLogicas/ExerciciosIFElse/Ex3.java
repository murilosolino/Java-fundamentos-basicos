package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex3 {
	/*
	 * Fácil 3- Faça um programa que verifique (usando if e else) se uma letra
	 * digitada é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino,
	 * Sexo inválido.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String letra;

		System.out.println("Digite a letra F ou M");
		letra = scanner.next();

		/*
		 * String.equals() para comparar da forma que quer…pois como a String se trata
		 * de uma Classe e não de um tipo primitivo
		 */

		if (letra.equals("F") || letra.equals("f")) {
			System.out.println(letra + " == Sexo Feminino");
			
		} else if (letra.equals("M") || letra.equals("m")) {
			System.out.println(letra + " == Sexo Masculino");
			
		} else {
			System.out.println("Sexo Indefinido");
		}

	}
}
