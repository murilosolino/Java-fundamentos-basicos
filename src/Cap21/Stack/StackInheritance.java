package Cap21.Stack;

import Cap21.List.List;
//Pilha dinamica utilizando uma lista encadeada como base
// Pilha utilizando heranca da classe List
public class StackInheritance<T> extends List<T> {

    //contrutor 
    public StackInheritance(){
        super("Stack");
    }

    //adiciona Objeto a pilha
    public void push(T object){
        insertAtFront(object);
    }

    //remove Objeto da pilha
    public void pop(){
        removeFromFront();
    }
} //fim da classe
