package Cap16.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Lists, LinkedLists e  ListIterators
public class ListTest {
    public static void main(String[] args) {
        //adiciona elementos color a list1
        String[] colors = {"white", "yellow", "green", "blue", "black", "silver"};
        List<String> list1 = new LinkedList<String>();
        
        for (String color : colors) {
            list1.add(color);
        }

        //adiona elementos color2 a list2
        String[] colors2 = {"grey", "brown", "violet", "blue", "red", "silver"};
        List<String> list2 = new LinkedList<String>();
        
        for (String color : colors2) {
            list2.add(color);
        }

        System.out.println("Before concat");
        printList(list1);
        //concatena as listas 
        list1.addAll(list2);
        list2 = null; // libera os dados(limpa a lista)
        System.out.println("After concat");
        printList(list1);

        convertToUpperCaseList(list1);
        printList(list1);

        System.out.printf("Deleting elements 4 to 6");
        removeItens(list1,4,7);
        printList(list1);
        printReversedList(list1);
    }// fim da classe ListTest


    //imprime lista invertida
    private static void printReversedList(List<String> list1) {
        ListIterator<String> iterator = list1.listIterator(list1.size());

        System.out.printf("%nReversed List:%n");

        //imprime lista na ordem inversa
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
            System.out.println();
        }
    }


    // obtém sublista e utiliza método clear para excluir itens da sublista
    private static void removeItens(List<String> list1, int start, int end) {

        list1.subList(start, end).clear();//limpa(remove) os itens atraves dos parametros passados 

    }//fim metodo removeItens


    //gera saida do conteudo da list
    private static void printList(List<String> list) {
       System.out.printf("%n%nList:%n");

       for (String string : list) {
            System.out.printf("%s",string);
            System.out.println();
       }
    }//fim do metodo printList()


    //localiza objetos e converte em maiusculas
    private static void convertToUpperCaseList(List<String> list) {
        //obetm ietrador  de lista
        ListIterator<String> iterator = list.listIterator();
        
        //enquanto o ietrador possuir proximo
        while (iterator.hasNext()) {
            String color = iterator.next(); //capta o registro 
            iterator.set(color.toUpperCase()); // passa o registro para maisucula
        }
        
    }// fim convertToUpperCaseList()
}
