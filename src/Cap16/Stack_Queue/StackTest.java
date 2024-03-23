package Cap16.Stack_Queue;

import java.util.EmptyStackException;
import java.util.Stack;

//Classe Stack(Pilha ED) do pacote java.util
public class StackTest {
    public static void main(String[] args) {

        Stack<Number> pilha = new Stack<Number>(); //cria uma pilha que recebe qualquer tipo de numero

        // utiliza push (atribuir valor a pilha)
        pilha.push(30L); // adiciona um long
        pilha.push(34267); // adicona um int 
        pilha.push(1.0F); // adiciona um float
        pilha.push(1234.4578); // adiciona um double

        printStack(pilha);
        System.out.printf("Elemento no topo da pilha: %s%n", pilha.peek()); //  retorna o elemento do topo

        // remove itens da pilha 
        try {
            Number removedObject = null;

                while (!pilha.isEmpty()) { // enqunato a pilha nao estiver vazia  remove elemento
                    removedObject = pilha.pop();
                    System.out.printf("Retirado %s%n", removedObject);
                    printStack(pilha); 
            }

        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> pilha) {
        if (pilha.isEmpty()) { // se estiver vazia
            System.out.println("Pilha esta vazia");
        } else{
            System.out.printf("Pilha contem: %s (topo) %n",pilha.toString());
        }
    }
}
