package Cap21.Queue.PraticeQueue;

public class FilaTest {
    

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(5);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);
        
    }
}
