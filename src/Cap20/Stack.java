package Cap20;

import java.util.ArrayList;


public class Stack<T>{
    
    protected final ArrayList<T> elements; //ArrayList armazena elementos da pillha

    //Construtor sem argumento cria uma pilha do tamanho padrao
    public Stack(){
        this(10); //tamanho padrao pilha
    }

    // construtor cria uma pilha com um numero especificado de elementos
    public Stack(int capacity) {
        
        int initCapacity = capacity > 0 ? capacity : 10; // valida
        elements = new ArrayList<T>(initCapacity); // cria arrayList

    }

    // adiciona elemento
    public void push(T pushValue){
        elements.add(pushValue);
    }

    //retorna elemento superior e o remove. Caso esteja vazia lanca uma exception
    public T pop(){

        if (elements.isEmpty()){
            throw new EmptyStackException("Pilha vazia, nao eh possivel remover");
        }

        return elements.remove(elements.size()-1);
    }


} //fim da classe Stack