package Cap14.Token;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Escreva a sentenca e pressione Enter: ");
        String sentenca = scanner.nextLine();

        String [] tokens = sentenca.split(" ");
        System.out.printf("Numeros de tokens: %d%n Os Tokens sao: ", tokens.length);
        
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
