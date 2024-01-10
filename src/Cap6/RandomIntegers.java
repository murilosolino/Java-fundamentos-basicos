package Cap6;
//inteiros aleatorios deslocados e escalonados

import java.security.SecureRandom; // o programa utiliza a classe SecureRandom fornecida pela API JAVA

public class RandomIntegers {
    public static void main(String[] args) {

        // o objeto randomNumber produzira numeros aleatorios e seguros
        SecureRandom randomNumber = new SecureRandom();

        //faz o loop 20 vezes
        for (int counter = 1; counter <= 20; counter++){

            //seleciona um inteiro aleatorio entre 1 e 6 
            int face = 1 + randomNumber.nextInt(6);

            System.out.printf("%d", face); // exibe os valores

            // se o contador for divisivel por 5, pula para a proxima linha
            if (counter % 5 == 0) {
                System.out.println();
            }

        }
    }
}// fim da classe
