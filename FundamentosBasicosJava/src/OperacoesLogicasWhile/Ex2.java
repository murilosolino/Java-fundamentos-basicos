package OperacoesLogicasWhile;

import java.util.Scanner;

/*Faça um programa que mostre a tabuada de um número N (N será lido do teclado). */
public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int tabuada, contador=1;
		System.out.println("Digite o número da tabuada que deseja");
		tabuada = scanner.nextInt();
		
		while (contador <= 10) {
			
			System.out.println(tabuada + " x " + contador + " = " + tabuada * contador );
			contador++;
		}
	}
}
