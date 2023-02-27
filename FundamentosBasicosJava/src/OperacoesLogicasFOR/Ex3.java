package OperacoesLogicasFOR;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tabuada, contador,ntabuada;
		
			System.out.println("Digite o numero para vizualizar a tabuada: ");
			ntabuada = scanner.nextInt();
			
			for(contador = 0; contador <= 10; contador++) {
				tabuada = ntabuada *contador;
				System.out.println(ntabuada + " x " + contador + " = " + tabuada);
			}
		
		
	}
}
