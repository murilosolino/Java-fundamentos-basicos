package Cap7;

import java.util.Arrays;

//Metdos da classe Arrays e System.arraycopy
public class ArrayManipulation {

    public static void main(String[] args) {
        //classifica doubleArray em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");
        //exibe array classificado
        for (double valor : doubleArray) {
            System.out.printf("%.1f ", valor);
        }

        //preenche o array de 10 elementos com 7
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        //copia array intArray em array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // verifica a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        // verifica a igualdade de intArray e filledIntArray
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));

        //pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);
        //se o valor for encontrado em intArray
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        //pesquisa o valor 8763 em intArray
        location = Arrays.binarySearch(intArray, 8763);
        //se o valor for encontrado em intArray
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }

    }

    //gera saída de valores em cada array
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (int valor : array) {
            System.out.printf("%d ", valor);
        }
    }

} // Fim da classe ArrayManipulation

