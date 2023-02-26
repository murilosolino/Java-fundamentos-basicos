package OperacoesLogicas;

public class While {
	public static void main(String[] args) {
		/* Estrutura de repetição while */

		/* Imprimir número de 0 a 10 */
		int numero = 0;
		while (numero <= 10) { /*WHILE verifica e depois executa o código*/
			System.out.println("Número atual: " + numero);
			numero++;
		}
		/*------------------------------------------------------------------*/
		int numero2 = 0;
		do {/*DO WHILE primeiro executa depois verifica*/
			
			System.out.println("Número atual: " + numero2);
			numero2++;
		}while(numero2 <= 10);
		
	}
}
