package POO.Pessoa;

import java.util.Scanner;


/*/* Uso de setters e getters com entrada de dados via teclado*/

public class MainPessoa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Pessoa pessoa1 = new Pessoa();

		System.out.println("Digite o nome do usuário:");
		pessoa1.setNome(scanner.nextLine());

		System.out.println("Digite a idade do usuário: ");
		pessoa1.setIdade(scanner.nextInt());

		System.out.println(pessoa1.dadosUsuario());

	}
}
