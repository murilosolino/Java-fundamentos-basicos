package Cap16.Hash;

import java.util.Scanner;
import java.util.TreeSet;
/*Escreva um programa que utiliza um método String split para tokenizar uma linha
de entrada de texto fornecida pelo usuário e coloca cada token em um TreeSet. 
Imprima os elementos do TreeSet. [Observação: isso deve fazer com que os 
elementos sejam impressos na ordem de classificação ascendente.] */
public class TreeSetTest {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.printf("Digite a frase: ");
        String frase = scanner.nextLine();

        String[] tokens = frase.split(" ");

        TreeSet<String> treeSet = new TreeSet<>();
        
        for (String palavra : tokens) {
            treeSet.add(palavra);
        }

        for (String token : treeSet) {
            System.out.println(token);
        }
    }
}
