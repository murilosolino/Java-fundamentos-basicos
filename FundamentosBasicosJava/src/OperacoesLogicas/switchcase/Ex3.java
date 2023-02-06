package OperacoesLogicas.switchcase;

import java.util.Scanner;

public class Ex3 {
	/*
	 * Faça um programa que calcule o “peso ideal” de um usuário de acordo com um
	 * caractere identificador de sexo (“M” para Masculino ou “F” para Feminino)
	 * inserido pelo mesmo.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double peso, pesoideal = 0;
		String sexo;
		
		System.out.println("Selecione o seu sexo M ou F");
		sexo = scanner.next();
		
		System.out.println("Iforme o seu peso");
		peso = scanner.nextDouble();
		
		switch (sexo) {
		case "M":
		
			pesoideal = (peso - 100) * 0.9;
			
			
			
			break;
		case "F":
			
			pesoideal = (peso - 100) * 0.85;
			
			
		default:
			break;
			
		}
		System.out.println("Seu peso ideal é " + pesoideal);
	}
}
