package Cap6;

import java.security.SecureRandom;

// roda um dado de 6 faces 6.000.000 de vezes
public class RollDie {
    public static void main(String[] args) {
        
        // objeto para gerar valores aleatorios e seguros
        SecureRandom randomNumber = new SecureRandom();

        //instanciando e inicializanos as variaveis que representam as faces dos dados
        int face1 = 0; 
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;

        //faz o loop 6.000.000 de vezes
        for (int i =1; i <=6000000; i++){

            // gera o numero aleatorio entre 1 e 6
            int face = 1 + randomNumber.nextInt(6);

            // usa o valor 1–6 para as faces a fim de determinar qual contador incrementar
            switch (face) {
                case 1:
                    ++face1; // incrementa o contador de 1s
                    break;
                case 2:
                    ++face2; // incrementa o contador de 2s
                    break;
                case 3:
                    ++face3; // incrementa o contador de 3s
                    break;
                case 4:
                    ++face4; // incrementa o contador de 4s
                    break;
                case 5:
                    ++face5; // incrementa o contador de 5s
                    break;
                case 6:
                    ++face6; // incrementa o contador de 6s
                    break;
                default:
                    break;
            }

        }

        System.out.println("Face\tFrequency"); // cabeçalhos de saída
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", face1, face2, face3, face4, face5, face6);

    }
}
