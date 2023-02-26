package OperacoesLogicasWhile;

import java.util.Scanner;

public class ex4 {
/*Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.*/
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n, contador = 2, somafinal;
	System.out.println("Digite o numero que deseja");
	n = scanner.nextInt();
	
	while (contador <= n){
	 
	        somafinal = n + contador;
			System.out.println("Soma: " + n + " + " + contador + " = " + somafinal);
			contador+=2;
		
	}
}
}
