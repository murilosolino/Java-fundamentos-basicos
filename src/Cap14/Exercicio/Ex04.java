package Cap14.Exercicio;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as palavras para serem traduzidas em Latim de Porco. Separe as com espacoes em branco");

        String string01 = scanner.nextLine();

        printLatinWord(string01);


    }

    public static void printLatinWord (String string){

        String[] arrayString = string.split(" ");

        for(int i = 0; i < arrayString.length; i++){
            String stringAtual = arrayString[i];
            String letraPrimaria = stringAtual.substring(0, 1);
            String fraseLatimPorco = stringAtual.substring(1).concat(letraPrimaria + "ay");

            System.out.println(fraseLatimPorco);

        }

    }
}
