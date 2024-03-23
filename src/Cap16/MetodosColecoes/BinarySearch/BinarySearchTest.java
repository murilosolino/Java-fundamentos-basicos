package Cap16.MetodosColecoes.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// metodo binarySearch de Collections
public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors ={"red", "white", "blue", "black", "yellow",
            "purple", "tan", "pink"};
    
        List<String> list = new ArrayList<String>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("Sorted arraylist: %s", list.toString());
        
        //pesquisa os valores na LISTA

        printedSearchResult(list, "black");
        printedSearchResult(list, "blue");
        printedSearchResult(list, "white");
        printedSearchResult(list, "pink");
        printedSearchResult(list, "green");
        printedSearchResult(list, "teal");
    }

    private static void printedSearchResult(List<String> list, String key) {
        
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result>=0){
            System.out.printf("Finden at index%d%n", result);
        } else{
            System.out.printf("Not Found at (%d)%n", result);
        }


    }
}
