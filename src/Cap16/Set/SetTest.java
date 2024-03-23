package Cap16.Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//HashSet utilizando para remover valores duplicados do array de strings
public class SetTest {
    public static void main(String[] args) {
        //cria e exibe uma lista de Strings
        String[] colors  = {"red", "white", "blue", "green", "gray",
         "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

         List<String> list = Arrays.asList(colors);
         System.out.println(list.toString());

         //elimina duplictas entao imprime os valores unicos
         printNonDuplicates(list);

    }

    // cria um Set de uma cole;'ao para eliminar duplicatas
    private static void printNonDuplicates(Collection<String> values) {

        // cria um HashSet
        Set<String> set = new HashSet<>(values); // remove os valores duplicados do parametro

        //imprime o parametro sem os valores duplicados
        System.out.println("Non duplicates are: ");
        for (String string : set) {
            System.out.println(string);
        }
       
    }
}
