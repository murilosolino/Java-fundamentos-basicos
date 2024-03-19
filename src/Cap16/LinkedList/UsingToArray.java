package Cap16.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

//visualizando arrays como liste  convertendo list em arrays
public class UsingToArray {
    public static void main(String[] args) {
        //cria yma linkedList, adiciona elementos e converte em array
        String[] colors = {"black","blue","yellow"};
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(colors));

       list.addLast("red"); // add como ultimo item
       list.add("pink"); // adiciona ao final
       list.add(3, "green"); // add como terceiro item
       list.addFirst("cyan");// add como primeiro item

       //obtem elementos LinkedList como array
        colors = list.toArray(new String[list.size()]);

        System.out.println("colors: ");

        for (String string : colors) {
            System.out.println(string);
        }
    }
}
