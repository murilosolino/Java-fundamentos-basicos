package Cap16.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// O programa conta o número de ocorrências de cada palavra em uma String
public class WordTypeCount {
    public static void main(String[] args) {
        // cria HasMap para armazenar chaves String e valors Integer
        Map<String, Integer> myMap =  new HashMap<>();
        createMap(myMap); // cria mapa com base na entrada de usuário
        displayMap(myMap); // exibe conteúdo do mapa
    }

    private static void displayMap(Map<String, Integer> myMap) {
        Set<String> keys = myMap.keySet(); //obtem as chaves
        
        //classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // gera a saída de cada chave do mapa
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n",  key, myMap.get(key));
        }
        System.out.printf("%nSize: %d%n Is Empty: %b%n", myMap.size(), myMap.isEmpty());
    }

    private static void createMap(Map<String, Integer> myMap) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a String: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens) {

            String word = token.toLowerCase(); //obtem a palvra em letras minusculas

            if (myMap.containsKey(word)){ // se no map já existe a palavra
                int count = myMap.get(word);  // obtem a contagem atual
                myMap.put(word, count +1); // incrementa a contagem
            } else { // se a palvra não existe em Map
                myMap.put(word, 1);
                // coloca a palvra em Map com uma contagem de 1 para Map
            }
        }
    }
} // fim da classe
