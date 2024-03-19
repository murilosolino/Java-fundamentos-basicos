package Cap16.ArrayList_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


//Interface collection demonstrada por meio de um objeto ArrayList
public class CollectionTest {
    public static void main(String[] args) {
        //adiciona elementos ao array collor a ser passado para a lista
        String[] colors = {"MAGENTA","RED","WHITE","BLUE","GREEN"};

        //impplementa interface list e gera um objeto ArrayList
        List<String> list = new ArrayList<String>();

        //percorre o vetor e adiciona cada elemento no ArrayList
        for(String color : colors){
            list.add(color);
        }

        //adicona elementos no array removeColors em removeList
        String[] removeColors = {"RED", "WHITE","MAGENTA"};
        List<String> removeList = new ArrayList<String>();

        for(String color : removeColors){
            removeList.add(color);
        }

        // gera a saida do conteudo da list
        System.out.println("ArrayList: ");
        for(int i=0; i < list.size(); i ++){
            System.out.printf("%s ", list.get(i));
        }

        removeColors(list, removeList);

        // gera a saida apos a remocao
        System.out.printf("%n%nArrayList apos alteracao: ");
        for(int i=0; i < list.size(); i ++){
        }

    }

    //// remove cores especificadas em collection2 a partir de collection1
    private static void removeColors(Collection<String> collection01, Collection<String> collection02) {
        //obtem iterador
       Iterator<String> iterator = collection01.iterator();

       //loop enquanto a colecao tiver itens
       while (iterator.hasNext()) {

       if (collection02.contains(iterator.next())){
        iterator.remove();// remove o elemento na colecao 1 caso o mesmo elemento seja presente na colecao 2
        }

       }
    }
}// fim da classe collectionTest
