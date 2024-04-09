package Cap19;

import java.security.SecureRandom;
import java.util.Arrays;

//classificando um array com SelectionSort
// Algoritmo ineficiente para classificar arrays grandes
// big O notation: O(n^2)
// melhor caso: O(n^2)
// pior caso: O(n^2)
// caso medio: O(n^2)
// melhor usar o metodo sort da classe Arrays

public class SelectionSortTest {
    //classifica o array utilizando o selectionSort
    public static void selectionSort(int[] data) {
        //loop sobre data.length - 1 elementos
        for (int i = 0; i < data.length - 1; i++) {
            int menor = i; //primeiro indice do restante do array

            //loop para localizar o indice do menor elemento
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[menor]) {
                    menor = index;
                }
            }

            //troca o menor elemento com o primeiro elemento nao classificado
            swap(data, i, menor);
            printPass(data, i + 1, menor);
        }
    }

    //metodo para trocar dois elementos de um array
    public static void swap(int[] data, int primeiro, int segundo) {
        int temporario = data[primeiro];
        data[primeiro] = data[segundo];
        data[segundo] = temporario;
    }

    //imprime um passo do algoritmo
    public static void printPass(int[] data, int pass, int index) {
        System.out.printf("pass %2d: ", pass);

        //saida de elementos ate o item selecionado
        for (int i = 0; i < index; i++) {
            System.out.printf("%d ", data[i]);
        }

        System.out.printf("%d* ", data[index]); //indicador de troca

        //termina a saida do array
        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }

        System.out.printf("%n");

        for (int i = 0; i < pass; i++) {
            System.out.print("-- ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom gerador = new SecureRandom();

        int[] data = new int[10]; //cria um array de inteiros

        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + gerador.nextInt(90);
        }

        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
        selectionSort(data); //classifica o array
        System.out.printf("Sorted array:%n%s%n", Arrays.toString(data));
    }

   
}
