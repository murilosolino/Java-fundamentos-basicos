package Cap16.MetodosColecoes.addAllFrequencyedisjoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//metodos colecctions addAll,Frequency e disjoint
public class Algorithms2 {
    public static void main(String[] args) {
        String[] colors ={"red", "white", "blue", "black", "yellow",
            "purple", "tan", "pink"};

        List<String> list = Arrays.asList(colors);
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("green");

        System.out.print("Before addAll, list2 contains: ");

        //exibe elementos em arrayList
        for (String string : arrayList) {
            System.out.printf("%s ", string);
        }

        Collections.addAll(arrayList, colors);

        System.out.printf("%nAfter addAll, arrayList contains: ");

         //exibe elementos em arrayList
         for (String string : arrayList) {
            System.out.printf("%s ", string);
        }

        //verfica a frequencia de red em arrayList
        int frequency = Collections.frequency(arrayList, "red");
        System.out.printf("%nFrequency of red in arrayList: %d%n", frequency);

        //verifica se list e arrayList tem intes em comum
        // se contem retorna falso
        //se nao contem retorna true
        boolean disjoint = Collections.disjoint(list, arrayList);
        System.out.printf("LIST and ARRAYLIST %s elements in common%n", (disjoint ? "do not have":"have"));


    }
}
