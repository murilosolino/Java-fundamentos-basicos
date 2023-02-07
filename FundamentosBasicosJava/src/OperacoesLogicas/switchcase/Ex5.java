package OperacoesLogicas.switchcase;
import java.util.Scanner;
public class Ex5 {
	/*
	 * A taxa de natalidade e a taxa de mortalidade são indicadores estatísticos de
	 * fundamental importância por ajudar a compreender aquilo que os especialistas
	 * chamam de dinâmica populacional e a entender sua relação com variáveis que
	 * influenciam o desenvolvimento, como qualidade de vida, migrações, , fatores
	 * socioeconômicos e localização. Sabendo disso, crie um programa que calcule os
	 * dois indicadores utilizando o comando switch.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int escolha;
		int habitantes;
		int morte;
		int nascimento;
		int	natalidade;
		int mortalidade;
		
		System.out.println("Esolha oq você deseja calcular \n 1 - taxa de natalidade \n 2- taxa de mortalidade");
		escolha = scanner.nextInt();
		
		System.out.println("Digite a quantidade de habitantes");
		habitantes = scanner.nextInt();
		
		
		switch (escolha) {
		case 1:
			System.out.println("Quantidade de nascimentos: ");
			nascimento=scanner.nextInt();
			natalidade = (nascimento * 1000) / habitantes;
			System.out.println("A taxa de natalidade é de "  + natalidade);
			break;
		case 2:
			System.out.println("Quantidade de mortes: ");
			morte=scanner.nextInt();
			mortalidade = (morte * 1000) / habitantes;
			System.out.println("A taxa de natalidade é de "  + mortalidade);
			break;

		default:
			break;
		}
	}
}
