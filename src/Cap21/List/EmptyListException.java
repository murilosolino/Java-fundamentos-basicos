package Cap21.List;

public class EmptyListException extends RuntimeException {
    
    public EmptyListException (){
        this("List"); // chama outro construtor de EmptyListException
    }

    public EmptyListException(String name){
        super(name + "is empty"); // chama construtor de superclasse
    }

}
