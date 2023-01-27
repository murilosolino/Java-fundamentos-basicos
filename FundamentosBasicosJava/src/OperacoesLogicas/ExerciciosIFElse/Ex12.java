package OperacoesLogicas.ExerciciosIFElse;

import java.util.Scanner;

public class Ex12 {
	/*
	 * 12- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
	 * descontos são do imposto de Renda, que depende do salário bruto (conforme
	 * tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
	 * salário bruto, mas não é descontado (é a empresa que deposita.)
	 * 
	 * O salário líquido corresponde ao salário bruto menos os descontos O programa
	 * deverá pedir ao usuário o valor da sua hora e a quantidade de horas
	 * trabalhadas no mês.
	 * 
	 * a. Desconto do IR; b. Salário Bruto ate R$900,00 (inclusive) – Isento; c.
	 * Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%; d. Salario bruto
	 * até R$ 2500,00 (Inclusive) – desconto de 10%; e. Salário bruto acima de 2500
	 * – Desconto de 20%.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qntHora = 0;
		int valorHora = 0;
		double salarioBruto;
		double descontoIR = 0;
		double salarioLiq = 0;
		double INSS = 0;
		double FGTS = 0;
		double totalDesconto = 0;

		System.out.println("Digite a quantidade de horas trabalhadas");
		qntHora = scanner.nextInt();

		System.out.println("Digite o valor da hora trabalhada");
		valorHora = scanner.nextInt();

		salarioBruto = qntHora * valorHora;

		if (salarioBruto <= 900) {
			descontoIR = 0;
			INSS = 0.10 * salarioBruto;
			FGTS = 0.11 * salarioBruto;
			totalDesconto = INSS + descontoIR;
			salarioLiq = salarioBruto - totalDesconto;

		} else if (salarioBruto > 900 || salarioBruto <= 1500) {
			descontoIR = 0.05 * salarioBruto;
			INSS = 0.10 * salarioBruto;
			FGTS = 0.11 * salarioBruto;
			totalDesconto = INSS + descontoIR;
			salarioLiq = salarioBruto - totalDesconto;
			
		} else if (salarioBruto > 1500 || salarioBruto <= 2500) {
			descontoIR = 0.10 * salarioBruto;
			INSS = 0.10 * salarioBruto;
			FGTS = 0.11 * salarioBruto;
			totalDesconto = INSS + descontoIR;
			salarioLiq = salarioBruto - totalDesconto;
			
		} else if (salarioBruto > 2500) {
			descontoIR = 0.20 * salarioBruto;
			INSS =   0.10  * salarioBruto;
			FGTS =   0.11  * salarioBruto;
			totalDesconto = INSS + descontoIR;
			salarioLiq = salarioBruto - totalDesconto;
		}
		
		System.out.println
		("Os reajustes foram de \n" + "Salario Bruto: " + salarioBruto + "\n" + "IR: " + descontoIR
		+ "\n" + "INSS: " + INSS + "\n" + "FGTS: " + FGTS + "\n" + 
		"Total de Desconto: " + totalDesconto + "\n"
		+ "Salario Liq: " + salarioLiq);

	}
}
