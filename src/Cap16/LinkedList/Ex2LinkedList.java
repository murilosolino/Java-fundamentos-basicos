package Cap16.LinkedList;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* Escreva um programa que insere 25 inteiros aleatórios
de 0 a 100 em ordem em um objeto LinkedList. O programa deve classificar os elementos e, então, calcular a soma dos elementos e a
média de ponto flutuante deles.*/
public class Ex2LinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        SecureRandom randomNumber = new SecureRandom();

        //preenche linkedlist com numeros 25 aleatorios de 0 a 100
        for (int i = 0; i < 25; i++){
            list.add(randomNumber.nextInt(100));
        }

        //lista desordenada
        System.out.println("Lista desordenada: "+ list.toString());

        Collections.sort(list); // ordena a lista

        System.out.println("Lista ordenada: " + list.toString());

        // faz a soma 
        int soma= 0;
        for (Integer integer : list) {
           soma += integer;
        }

        System.out.println("Soma dos resultados da lista: " + soma);

        //calcula a media

        double media = soma / list.size();
        
        // imprime a media
        System.out.println("Media dos elementos da linkedlis: " + media);

    }
}
