package Cap7;

import java.util.ArrayList;

//demostrando o uso de ArrayList<T> generic
public class ArrayListCollection {
    public static void main(String[] args) {
        
        //cria um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); //anexa um item a lista
        items.add(0, "yellow"); //insere "yellow" no indice 0

        System.out.println();

        //cabeçalho
        System.out.print("Display dos componentes da lista com loop controlado por contador:");

        //exibe os dados da lista
        for (int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }

         //exibe as cores usando for aprimorado no método display
        display(items, "%nDisplay dos componentes da lista com for aprimorado:");

        items.add("green"); //adiciona "green" ao fim da lista
        items.add("yellow"); //adiciona "yellow" ao fim da lista
        display(items, "Lista com dois novos elementos:");

        items.remove("yellow"); //remove o primeiro "yellow"
        display(items, "Remove a primeira ocorrência de yellow:");

        items.remove(1); //remove o item no indice 1    
        display(items, "Remove o segundo elemento da lista (green):");

        //verifica se um valor esta na lista
        System.out.printf("\"red\" %sesta na lista%n", items.contains("red") ? "" : "não ");

        //exibe o numero de elementos em items
        System.out.printf("Tamanho: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header){
        System.out.print(header); //exibe o cabeçalho

        //exibe cada elemento em itens
        for (String item : items){
            System.out.printf(" %s", item);
        }

        System.out.println();
    }

}
