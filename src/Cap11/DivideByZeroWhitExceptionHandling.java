package Cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

// Tratando ArithmeticExceptio e InputMismatchExceptions
public class DivideByZeroWhitExceptionHandling {

    //demonstra o lancamento de uma excecao quando dividio por zer

    public static int quotient(int numerador, int denominador) throws ArithmeticException
    {
        return numerador / denominador; // possivel divisao por 0
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; //determina se mais entradas sao necessarias

        do {
            try {
                System.out.println("Entre com o numerador");
                int numerador = scanner.nextInt();
                System.out.println("Entre com o denominador");
                int denominador = scanner.nextInt();

                int resultado = quotient(numerador, denominador);
                System.out.println("Resuultado: " + numerador + " / " + denominador + " = " + resultado);
                continueLoop = false; // entrada e metodo bem sucedidos, fim do loop
            } catch (InputMismatchException exceptionInputMismatchException) {
                // TODO: handle exception

                System.out.println("Excecao: " + exceptionInputMismatchException);
                scanner.nextLine(); // descarta a entrada para o usuario tentar novamente
                System.err.println("Deve entrar somente com inteiros. Por favor tente novamente");

            }catch (ArithmeticException exceptionArithmeticException){
                System.out.println("Excecao: " + exceptionArithmeticException);
                System.err.println("Zero nao eh valido como denominador. Por favor tente novamente");
            }
 
        } while (continueLoop);
    }

}// fim da classe.
