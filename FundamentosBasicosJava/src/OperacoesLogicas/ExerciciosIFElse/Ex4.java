package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex4 {
	/*
	 * 4- Faça um programa que verifique (usando if e else) se uma letra digitada é
	 * vogal ou consoante.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Digite uma Letra");
		letra = scanner.next();
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("Esta letra é uma vogal");
		}
		else {
			System.out.println("Esta letra é uma consoante");
		}
		
		
	}
}
