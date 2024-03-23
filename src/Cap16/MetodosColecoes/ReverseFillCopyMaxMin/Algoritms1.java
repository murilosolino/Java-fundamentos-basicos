package Cap16.MetodosColecoes.ReverseFillCopyMaxMin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Metodos de Collectiond reverse, fill, copy, max e min
public class Algoritms1 {
    public static void main(String[] args) {
        //cria e exibe uma lista de caracter
        Character[] characters = {'P','C','M'};
        List<Character> list = Arrays.asList(characters);
        output(list); // metodo que imprime a lista


        //inverte e exibe uma list
        Collections.reverse(list);
        System.out.println("After calling reverse, list contains: ");
        output(list);

        // cria um copyList de um array de 3 caracteres 
        Character[] charCopy = new Character[3];
        List<Character> copyList = Arrays.asList(charCopy);

        //copia o conteudo de list para copyList
        Collections.copy(copyList, list);
        System.out.println("After calling copy, copyList contains: ");
        output(copyList);

        //preence a lista somente com R's
        Collections.fill(list, 'R');
        System.out.println("After calling fiil, copyList contains: ");
        output(list);


    }

    
    private static void output(List<Character> listRef) { // envia as informacoes para a saida
       System.out.println("The list is: ");

       for (Character character : listRef) {
            System.out.printf("%s ", character);
       }

       System.out.printf("%nMax: %s", Collections.max(listRef));
       System.out.printf(" Min: %s%n", Collections.min(listRef));
    }
}// fim da classe
