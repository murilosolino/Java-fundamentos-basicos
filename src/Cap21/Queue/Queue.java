package Cap21.Queue;

import Cap21.List.EmptyListException;
import Cap21.List.List;
//Fila dinamica usando List como composicao
public class Queue<T> {
    
    private List<T> queueList;

    public Queue(){
        queueList = new List<T>("Queue");
    }

    //adiciona objeto a fila
    public void enqueue(T obj){
        queueList.insertAtBack(obj);
    }

    //remove objeto da fila
    public T dequeue() throws EmptyListException{
        return queueList.removeFromFront();
    }

    public void isEmpty(){
        queueList.isEmpty();
    }

    public void print(){
        queueList.print();
    }
}
