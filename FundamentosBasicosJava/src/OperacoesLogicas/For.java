package OperacoesLogicas;

public class For {
	public static void main(String[] args) {
		/* Estrutura de repetição for */
		/*
		 * For: Executa o loop enquanto a condição for verdadeira, porém você pode
		 * instanciar as variaveis contadoras dentro da estrutura do loop.
		 */
		
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero atual: " + numero);
		}
		System.out.println("\n");
		/*============================================================*/
		
		for (int numero = 10; numero >=0; numero--) {
			System.out.println("Numero atual: " + numero);
		}
		System.out.println("\n");
		/*==========================================================*/
		/*estrutura de repetição FOR com Break(parada)*/
		
		for (int numero = 0; numero <=10; numero++) {
			if (numero == 7) {
				System.out.println("Numero encontrado " + numero);
				break;
			}
			System.out.println("\n");
		/*estrutura de repetição FOR com Continue.*/
			
		for (int numero1 = 0; numero1 <=10; numero1++) {
			if (numero1 == 3 || numero1 == 6 || numero1 == 9) {
				System.out.println("Numero encontrado " + numero1);
				continue;
				}
			}
		} 
	}
}
