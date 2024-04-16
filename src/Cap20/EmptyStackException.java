package Cap20;

public class EmptyStackException extends RuntimeException{
    
    public EmptyStackException(){
        this("Pilha está vazia.");
    }

    public EmptyStackException(String msg){
        super(msg);
    }


}