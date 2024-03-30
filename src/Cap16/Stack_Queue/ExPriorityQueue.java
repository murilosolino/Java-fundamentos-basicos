package Cap16.Stack_Queue;


import java.util.Collections;
import java.util.PriorityQueue;

/* Reescreva a a calsse PriorityQueueTest de modo que ela ordene os elementos Double em ordem decrescente
(isto é, 9.8 deve ser o elemento de maior prioridade em vez de 3.2).*/
public class ExPriorityQueue {
    
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>(Collections.reverseOrder());
        fila.offer(3.2);
        fila.offer(9.8);
        fila.offer(5.2);

        System.out.println(fila.toString());
        
    }

}
