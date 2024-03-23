package Cap16.MetodosColecoes.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Cap8.Secao8_5.Time2;

public class Sort2 {
    public static void main(String[] args) {

        List<Time2> list = new ArrayList<Time2>(); // cria list

        //adiciona elementos a list
        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 4, 24));

        //gera saida de elementos list
        System.out.printf("Unsorted list elements %s%n", list.toString());

        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted list elements %s%n", list.toString());


    }
}
