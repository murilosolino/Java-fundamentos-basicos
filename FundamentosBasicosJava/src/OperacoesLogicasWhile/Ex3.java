package OperacoesLogicasWhile;

import java.util.Scanner;

public class Ex3 {
	/*Ler um número inteiro n. Escrever a soma de todos os números de 1 até n*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, contador = 0, somafinal;
		System.out.println("Digite o numero que deseja");
		n = scanner.nextInt();
		
		while (contador <= n) {
			somafinal = contador + n;
			System.out.println("Soma: " + n + " + " + contador + " = " + somafinal);
			contador++;
		}
		
	}
}
