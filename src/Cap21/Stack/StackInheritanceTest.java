package Cap21.Stack;

public class StackInheritanceTest {
    public static void main(String[] args) {

        StackInheritance<Integer> pilha = new StackInheritance<>();

        pilha.push(1);
        pilha.print();
        pilha.push(2);
        pilha.print();
        pilha.push(3);
        pilha.print();

        pilha.pop();
        pilha.print();
        pilha.pop();
        pilha.print();
        pilha.pop();
        pilha.print();
        
    }
}
