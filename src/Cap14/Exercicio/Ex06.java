package Cap14.Exercicio;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma linha de texto");
        String texto = scanner.nextLine();

        String[] stringArray = texto.split(" ");

        for(int i=0; i < stringArray.length; i++){
            String invertido = new StringBuilder(stringArray[i]).reverse().toString();
            System.out.println(invertido);
        }
    }
}
