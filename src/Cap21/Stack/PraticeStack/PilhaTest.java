package Cap21.Stack.PraticeStack;

public class PilhaTest {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
    }
}
