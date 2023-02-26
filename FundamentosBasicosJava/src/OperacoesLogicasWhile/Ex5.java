package OperacoesLogicasWhile;

import java.util.Scanner;

public class Ex5 {
	/*
	 * . Escreva um programa que apresente quatro opções: (1) consulta saldo, (2)
	 * saque e (3) depósito e (4) sair. O saldo deve iniciar em R$ 0,00. A cada
	 * saque ou depósito o valor do saldo deve ser atualizado
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		double saldo = 0, saque = 0, deposito = 0;
		do {

			System.out.println("Opçoes:");
			System.out.println("1-CONSULTA DE SALDO");
			System.out.println("2-SAQUE");
			System.out.println("3-DEPOSITO");
			System.out.println("4-SAIR");

			System.out.println("Digite o numero da opçao desejada:");
			opc = scanner.nextInt();

			if (opc == 1) {

				System.out.println("SALDO ATUAL: " + saldo + "\n");
			}

			if (opc == 2) {

				if (saldo == 0) {
					System.out.println("Não é possível realizar o saque, pois o valor de sua conta é de R$ " + saldo);
				} else {

					System.out.println("Digite a quantida que deseja sacar");
					saque = scanner.nextDouble();
					if (saque > saldo) {
						System.out.println("Saldo decai para valor negativo, não é possível realizar o saque.");
					} else {
						System.out.println("Você sacou R$ " + saque + "\n");
						saldo = saldo - saque;
					}
				}
			}

			if (opc == 3) {
				System.out.println("Digite a qunatidade que deseja depositar:");
				deposito = scanner.nextDouble();
				System.out.println("Você depositou R$ " + deposito + "\n");
				saldo = deposito + saldo;

			}

		} while (opc <= 4);
	}
}
