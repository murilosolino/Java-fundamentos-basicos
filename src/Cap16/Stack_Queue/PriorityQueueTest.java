package Cap16.Stack_Queue;

import java.util.PriorityQueue;


public class PriorityQueueTest {
    public static void main(String[] args) {
        
        //fila com capacidade  11
        PriorityQueue<Double> fila = new PriorityQueue<>(); 
        
        //insere elementos na fila 
        fila.offer(3.2);
        fila.offer(9.8);
        fila.offer(5.2);

        // exibe fila
        System.out.println(fila.toString());

        System.out.println("Removendo da fila");
        //remove elementos da fila 
        while (fila.size() > 0) {
            System.out.printf("%.1f %n", fila.peek()); // retorna o elemento superior de fila
            fila.poll(); // remove o elemento visualizado anteriormente
        }


        System.out.println("Fila apos remocao dos elementos: " + fila.toString());
        
        
    }    
}
