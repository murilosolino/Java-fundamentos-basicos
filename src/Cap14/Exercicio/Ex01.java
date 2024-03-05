package Cap14.Exercicio;
/*(Comparando Strings) Elabore um aplicativo que utiliza o método String compareTo para comparar duas entradas de strings pelo
usuário. Crie uma saída informando se a primeira string é menor que, igual a ou maior que a segunda. */
import java.util.Scanner;
import java.nio.charset.StandardCharsets;;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        String string1 = new String();
        String string2 = new String();

        System.out.printf("Digite o conteudo da string1: ");
        string1 = scanner.nextLine();
        System.out.println("String 1: " + string1);

        System.out.printf("Digite o conteudo da string2: ");
        string2 = scanner.nextLine();
        System.out.println("String 2: " + string2);

        if (string1.compareTo(string2) == 0) { // comparTo compara lexicograficamente
            System.out.println("Strings são iguais");
        } 
        else if (string1.compareTo(string2) < 0){
            System.out.println("String 1 é menor que String 2");
        } 
        else if (string1.compareTo(string2 ) > 0){
            System.out.println("String1 é maior que String 2");
        }



    }
}
