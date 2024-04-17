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

public class SelectionSortTest<T> {
    //classifica o array utilizando o selectionSort
    public  static <T extends Comparable> void selectionSort(T[] data) {
        //loop sobre data.length - 1 elementos
        for (int i = 0; i < data.length - 1; i++) {
            int menor = i; //primeiro indice do restante do array

            //loop para localizar o indice do menor elemento
            for (int index = i + 1; index < data.length; index++) {
                if (data[index].compareTo(data[menor]) < 0) {
                    menor = index;
                }
            }

            //troca o menor elemento com o primeiro elemento nao classificado
            swap(data, i, menor);
            printPass(data, i + 1, menor);
        }
    }

    //metodo para trocar dois elementos de um array
    public static <T> void swap(T[] data, int primeiro, int segundo) {
        T temporario = data[primeiro];
        data[primeiro] = data[segundo];
        data[segundo] = temporario;
    }

    //imprime um passo do algoritmo
    public static <T> void printPass(T[] data, int pass, int index) {
        System.out.printf("pass %2s: ", pass);

        //saida de elementos ate o item selecionado
        for (int i = 0; i < index; i++) {
            System.out.printf("%s ", data[i]);
        }

        System.out.printf("%s* ", data[index]); //indicador de troca

        //termina a saida do array
        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%s ", data[i]);
        }

        System.out.printf("%n");

        for (int i = 0; i < pass; i++) {
            System.out.print("-- ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom gerador = new SecureRandom();

        Integer[] data = new Integer[10]; //cria um array de inteiros
        Float[] data2 = new Float[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + gerador.nextInt(90);
        }

        for (int i = 0; i < data2.length; i++) {
            data2[i] = 10 + gerador.nextFloat(90);
        }


        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
        selectionSort(data); //classifica o array
        System.out.printf("Sorted array:%n%s%n", Arrays.toString(data));

        
        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data2));
        selectionSort(data2); //classifica o array
        System.out.printf("Sorted array:%n%s%n", Arrays.toString(data2));
    }

   
}
