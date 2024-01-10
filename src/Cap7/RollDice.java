package Cap7;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
            
          SecureRandom randomNumber = new SecureRandom(); // inicia um objeto para gerar numeros ale atorios
            int[] frequency = new int[7]; // array para armazenar a frequencia de cada numero

            for (int roll = 1; roll <= 6000000; roll++){
                ++frequency[1+randomNumber.nextInt(6)]; // incrementa a frequencia de cada numero
            }
                //imprime o cabecalho
                for (int face = 1; face < frequency.length; face++){
                    System.out.printf("%4d%10d%n", face, frequency[face]);
                }
                
    }
}
