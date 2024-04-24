package Cap21.Queue.PraticeQueue;

public class Fila<T> {
    //Fila estatica
    private T[] fila; // Array que armazena os elementos da fila.
    private int inicio; // Indica o início da fila.
    private int fim; // Indica o fim da fila.

    // Construtor que recebe o tamanho da fila.
    public Fila(int tamanho) {
        fila = (T[]) new Object[tamanho]; // Inicializa o array com o tamanho especificado.
        inicio = fim = -1; // Inicializa inicio e fim com -1.
    }

    public void enqueue(T obj) {
        // Se fim for igual ao tamanho do array - 1, a fila está cheia.
        if (fim == fila.length - 1) {
            System.out.println("Fila cheia");
            return;
        }
        // Se inicio for igual a -1, a fila está vazia.
        if (inicio == -1) {
            inicio = 0;
        }
        // Incrementa fim e adiciona o objeto na posição de fim.
        fila[++fim] = obj;
    }

    public T dequeue() {
        if (inicio == -1) {
            System.out.println("Fila vazia");
        }
        T temp = fila[inicio]; // Armazena o elemento que está no início da fila.

        // Se inicio for igual a fim, a fila está vazia.
        if (inicio == fim) {
            inicio = fim = -1;
        } else {
            inicio++; // Se houver mais de um elemento na fila, inicio é incrementado para apontar para o próximo elemento da fila.
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = inicio; i <= fim; i++) {
            builder.append(fila[i] + " ");
        }
        return builder.toString();
    }
}
