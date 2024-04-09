package Cap19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

// Utiliza a pesquisa binária para localizar um item em um array.
public class BinarySearchTest {
    // realiza a pesquisa binaria sobre os dados
    public static int binarySearch(int[] array, int key){
        int minimo = 0; // extremidade baixa da area de pesquisa
        int maximo = array.length -1; // estremidade alta da area de pesquisa
        int meio = (minimo + maximo + 1) / 2; //elemento do meio
        int location = -1; // valor do retorno se nao localizado
         
        do {
            //imprime elementos remanescentes do array
            System.out.println(remanescentes(array,minimo,maximo));

            for (int i = 0; i < meio; i++) 

                System.out.print(" ");
                System.out.println(" * ");//indica o meio atual

                //se o elemento for localizado no meio
                if (key == array[meio]) {
                    location = meio; // a loxalizacao eh o meio atual
                } else if (key < array[meio]){ // elemento do meio eh maior
                    maximo = meio -1; //elimina metade mais alta
                } else { // elemento do meio eh menor
                    minimo = meio + 1; // elimina metade mais baixa
                }
            
            meio = (minimo + maximo + 1) / 2; //recalcula o meio
        } while ((minimo <= maximo) && (location == -1));

         return location; // retorna a localizacao da chave de pesquisa
    }

    // metodo para gerar saida de certos valores no array
    private static String remanescentes(int[] array, int minimo, int maximo) {
       StringBuilder temporario = new StringBuilder();

       //acresenta espacos para alinhamento
       for (int i = 0; i < minimo; i++) {
        temporario.append(" ");
       }

       //gera saida de elementos que permanecem no array
       for (int i = minimo; i <= maximo; i++) {
            temporario.append(array[i] + " ");
       }

       return String.format("%s%n", temporario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom gerador = new SecureRandom();

        int[] array = new int[15]; // cria o array

        for (int i = 0; i < array.length; i++) {
            array[i] =  10 + gerador.nextInt(90); //preenche o array
        }

        Arrays.sort(array); //ordena o array
        System.out.printf("%s%n%n", Arrays.toString(array)); //imprime o array

        //obtem a entrada do usuario
        System.out.printf("Por favor entre com o numero inteiro que deseja buscar. Digite -1 para sair: ");
        int buscaChave = scanner.nextInt();

        //insere repetidamente um inteiro
        while (buscaChave != -1) {
            
            //realiza a pesquisa
            int location = binarySearch(array, buscaChave);

            if(location == -1){
                System.out.println(buscaChave + " nao encontrado");
            } else {
                System.out.printf("%d encontrado na posicao %d %n%n", buscaChave, location);
            }

            System.out.printf("Por favor entre com o numero inteiro que deseja buscar. Digite -1 para sair: ");
            buscaChave = scanner.nextInt();
        }

    }

    

    

}
