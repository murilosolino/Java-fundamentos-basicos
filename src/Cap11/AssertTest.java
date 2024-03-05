package Cap11;

import java.util.Scanner;

//verificando com assert se um valor esta dentro do intervalo
public class AssertTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero entre 0 e 10");
        int num =  scanner.nextInt();

        //afirma que o valor eh >=0 e <=10
        if (num < 0 || num > 10) {
            throw new AssertionError("Numero fora do intervalo");
            
        }

        System.out.println("Numero digitado: " + num);
    }
}
