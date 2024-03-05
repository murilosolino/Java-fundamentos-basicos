package Cap14.Exercicio;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.printf("Digite o conteudo da string1: ");
       String string1 = scanner.nextLine();
        System.out.println("String 1: " + string1);

        System.out.printf("Digite o conteudo da string2: ");
       String string2 = scanner.nextLine();
        System.out.println("String 2: " + string2);

        System.out.println("Digite o indice inicial da comparação na string1: ");
        int toffset = scanner.nextInt();

        System.out.println("Digite o indice inicial da comparação na string2: ");
        int ooffset = scanner.nextInt();

        System.out.println("Digite o número de caracteres a serem comparados");
        int len = scanner.nextInt();

        if (string1.regionMatches(true,toffset,string2,ooffset,len)) {
            System.out.println("Strings são iguais");
        } else {
            System.out.println("Strings são diferentes");
        }
        

    }
}
