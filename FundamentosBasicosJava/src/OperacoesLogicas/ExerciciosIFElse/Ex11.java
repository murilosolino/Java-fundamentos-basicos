package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex11 {
	/**
	 * 11- As organizações CSM resolveram dar um aumento de salário aos seus
	 * colaboradores e lhe contrataram para desenvolver o programa que calculará os
	 * reajustes.
	 * 
	 * a. Faça um programa que recebe o salário de um colaborador e o reajuste
	 * segundo o seguinte critério, baseado no salário atual; 
	 * b. Salários até R$280,00 (incluindo): aumento de 20%; Após o aumento ser realizado; informe na tela;
	 * c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
	   d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
	   e. Salários de R$ 1500,00 em diante: aumento de 5%
	 * 
	 * a. O salário antes do reajuste; b. O percentual de aumento aplicado; c. O
	 * valor do aumento; d. O novo salário, após o aumento
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salarioInicial;
		double percentual = 0;
		double valorAumentado = 0;
		double novoSalario = 0;

		System.out.println("Digite seu salário");
		salarioInicial = scanner.nextDouble();

		if (salarioInicial <= 280) {
			percentual = 20.0 / 100.0;
			novoSalario = salarioInicial + (percentual * salarioInicial);
			valorAumentado = percentual * salarioInicial;

		} else if (salarioInicial > 280 && salarioInicial<=700) {
			percentual = 15.0 / 100.0;
			novoSalario = salarioInicial + (percentual * salarioInicial);
			valorAumentado = percentual * salarioInicial;
			
		} else if (salarioInicial > 700 && salarioInicial<=1500) {
			percentual = 10.0 / 100.0;
			novoSalario = salarioInicial + (percentual * salarioInicial);
			valorAumentado = percentual * salarioInicial;
			
		} else if (salarioInicial > 1500) {
			percentual = 5.0 / 100.0;
			novoSalario = salarioInicial + (percentual * salarioInicial);
			valorAumentado = percentual * salarioInicial;
			
		}
		System.out.println("salário antes do reajuste: " + salarioInicial  + "\n" + " percentual de aumento aplicado " + percentual +  "\n"  +
				" valor do aumento: " + valorAumentado + "\n" + " novo salário: " + novoSalario);
	}

}
