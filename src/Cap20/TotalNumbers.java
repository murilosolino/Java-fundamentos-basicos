package Cap20;

import java.util.ArrayList;
import java.util.List;

public class TotalNumbers {

    public static void main(String[] args) {

        // cria, incializa e gera a saida de ArrayList de numeros contendo
        // Integers e Doubles, e entao exibe o total de elementos

        Number[] number = { 1, 2.4, 3, 4.1 };
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element : number) {
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));

        Integer[] numberInt = { 1, 44, 3, 41 };
        ArrayList<Number> numberListInt = new ArrayList<>();

        for (Integer element : numberInt) {
            numberListInt.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberListInt);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberListInt));

        Double[] numberDoubles = { 1.1, 2.4, 3.6, 4.1 };
        ArrayList<Number> numberListDouble = new ArrayList<>();

        for (Double element : numberDoubles) {
            numberListDouble.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberListDouble);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberListDouble));

    }

    /*
     * Os curingas
     * permitem especificar parâmetros de método, valores de retorno, variáveis ou
     * campos e assim por diante, que atuam como supertipos
     * ou subtipos de tipos parametrizados.
     * 
     * ArrayList<? extends Number>
     * 
     * Um argumento do tipo curinga é denotado pelo ponto de interrogação (?), que
     * representa por si mesmo um “tipo desconhecido”.
     * 
     * Nesse caso, o curinga estende a classe Number, o que significa que ele tem um
     * limite superior de Number. Portanto, o argumento de
     * tipo desconhecido deve ser
     * ou uma subclasse de Number
     * Number
     */

    private static double sum(ArrayList<? extends Number> numberList) {

        double totalDouble = 0.0;

        for (Number number : numberList) {
            totalDouble += number.doubleValue();
        }

        return totalDouble;
    }

}
