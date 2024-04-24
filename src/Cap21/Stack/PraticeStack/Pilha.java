package Cap21.Stack.PraticeStack;

//Pilha estatica

public class Pilha<T> {
    
    //gere a classe Pilha com os metodos push, pop e toString
    private T[] pilha;
    private int topo;

    public Pilha(int tamanho){
        pilha = (T[]) new Object[tamanho];
        topo = -1;
    }

    public void push(T obj){
        if(topo == pilha.length - 1){
            System.out.println("Pilha cheia");
            return;
        }
        pilha[++topo] = obj;
    }

    public T pop(){
        if(topo == -1){
            System.out.println("Pilha vazia");
            return null;
        }
        return pilha[topo--];
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = topo; i >= 0; i--){
            builder.append(pilha[i] + " ");
        }
        return builder.toString();
    }

    

}
