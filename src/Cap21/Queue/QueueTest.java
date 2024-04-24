package Cap21.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> fila = new Queue<>();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);

        fila.print();

        fila.dequeue();
        fila.print();
        fila.dequeue();
        fila.print();
        fila.dequeue();
        fila.print();
    }
}
