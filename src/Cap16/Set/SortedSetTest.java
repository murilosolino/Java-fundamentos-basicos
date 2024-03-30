package Cap16.Set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

// Usando SortedSet e TreeSet
public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey",
         "white", "orange", "red", "green"};

         // cria TreeSet a partir do array de colors
         SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
         System.out.println("Sorted tree: ");
         printSorted(tree);

         //obtem headSet com Base em orange
         //headSet para obter um subconjunto do TreeSet em que cada elemento é menor que "orange"
         System.out.println("headSet (orange)");
         printSorted(tree.headSet("orange"));

         //obtem tailSet baseado em orange
         //tailSet para obter um subconjunto em que cada elemento é maior ou igual a “orange"
         System.out.println("tailSet (orange)");
         printSorted(tree.tailSet("orange"));

         //obtem os primeiros e últimos elementos
         System.out.println(tree.first());
         System.out.println(tree.last());   


    }

    // envia SortedSet para a saída usando a instrução for aprimorada
    private static void printSorted(SortedSet<String> tree) {
       for (String string : tree) {
            System.out.printf("%s ", string);
            System.out.println();
       }

       System.out.println();

    }
}
