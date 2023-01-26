package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex10 {
	/*
	 * Faça um programa que pergunte em que turno você estuda. Peça para digitar
	 * M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou
	 * “Boa Noite” ou “Valor inválido”, conforme o caso.
	 */
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			
			String periodo;
			
			System.out.println("Digite o periodo");
			periodo = scanner.next();
			
			if (periodo.equals("M") || periodo.equals("m")) {
				System.out.println("Bom Dia");
			}
			else if(periodo.equals("N") || periodo.equals("n")) {
				System.out.println("Boa Noite");
			}
			else {
				System.out.println("Valor inválido");
			}
		
		
		}
}
