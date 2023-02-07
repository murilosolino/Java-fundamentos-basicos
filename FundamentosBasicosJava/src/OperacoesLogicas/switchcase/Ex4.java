package OperacoesLogicas.switchcase;

import java.util.Scanner;

public class Ex4 {
	/*
	 * Uma loja fornece 10% de desconto para funcionários e 5% de desconto para
	 * clientes vips. Faça um programa que calcule o valor total a ser pago por uma
	 * pessoa. O programa deverá ler o valor total da compra efetuada e um código
	 * que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip
	 * (3).
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int valorDaCompra;
		int cliente;
		double valorFinal=0;

		System.out.println("Selecione o tipo de cliente \n 1-Cliente comum \n 2-Funcionário \n 3- VIP");
		cliente = scanner.nextInt();

		System.out.println("Digite o valor da compra");
		valorDaCompra = scanner.nextInt();

		switch (cliente) {
		case 1:

			valorFinal = valorDaCompra;
			break;

		case 2:

			valorFinal = valorDaCompra - (valorDaCompra * 0.10);

			break;

		case 3:

			valorFinal = valorDaCompra - (valorDaCompra * 0.05);

			break;

		default:
			break;
		}
		System.out.println("O valor final a ser pago é R$ " + valorFinal);
	}
}
