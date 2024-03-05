package Cap14.Character;

import java.util.Scanner;

public class StaticCharMethod {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Entre com radical: ");
        int radical = scanner.nextInt();

        System.out.printf("Escolha entre as duas opcoes: %n 1 - converter digito em caracter %n 2 - converter caracter para digito");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.printf("Entre com o digito: ");
                int digito = scanner.nextInt();
                System.out.println("Convertendo para caracter: " + Character.forDigit(digito, radical));
                break;
            case 2:
            System.out.printf("Entre com o caracter: ");
                char caracter = scanner.next().charAt(0);
                System.out.printf("Convertendo para digito: %s%n", Character.digit(caracter, radical));
                break;

            default:
                break;
        }
    }    
}
