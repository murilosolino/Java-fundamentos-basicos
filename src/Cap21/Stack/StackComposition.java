package Cap21.Stack;
import Cap21.List.*;
//pilha dinamica utilizando composicao com atributo do tipo list;
public class StackComposition<T> {
    
    private List<T> stacklist;

    public StackComposition(){
        stacklist = new List<T>("Stack");
    }

    public void push(T obj){
        stacklist.insertAtFront(obj);
    }

    public T pop() throws EmptyListException{
        return stacklist.removeFromFront();
    }

    public boolean isEmpty(){
        return stacklist.isEmpty();
    }

    public void print(){
        stacklist.print();
    }

}
