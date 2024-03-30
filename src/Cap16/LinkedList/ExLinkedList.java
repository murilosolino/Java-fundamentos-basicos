package Cap16.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa. */
public class ExLinkedList {
    public static void main(String[] args) {
        Character[] charArray = {'a','b','c','d','e','f','g','h','i','j'};
        List<Character> list = new LinkedList<>(Arrays.asList(charArray));

        List<Character> list2 = new LinkedList<>();
        list2.addAll(list);


        Collections.reverse(list2);
        System.out.println("Ordem incial: " + list.toString());

        System.out.println("Ordem invertida: " + list2.toString());

        
    }
}
