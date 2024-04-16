package Cap20;

public class StackElements {
    public static void main(String[] args) {
    // Como parâmetros de tipo só podem representar tipos por
    //referência, para que sejam capazes de passar os arrays
    
    Double[] doubleElements  = {1.1,2.2,3.3,4.4,5.5};
    Integer[] intElements = {1,2,34,5,6,7,8,9,10};

    // Criando um Stack<Double> e um Stack <Integer>
    Stack<Integer> stackInteger = new Stack<>();
    Stack<Double> stackDouble = new Stack<>(5);

        // coloca os elementos de doubleElements em doubleStack
        testPush("StackDouble",stackDouble,doubleElements);
        testPop(stackDouble);

        // coloca os elementos de integerElements em integerStack
        testPush("StackInteger", stackInteger, intElements);
        testPop(stackInteger);

    }

    // método genérico testPop remove elementos de uma Stack
    public static <T> void testPop(Stack<T> stack) {
        // remove os elementos da pilha
        try {

            System.out.println("Removendo itens em stack");
            T popValue; // armazena o elemento removido da pilha

            // remove todos os elementos da Stack
            while (true) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }

        } catch (EmptyStackException exception) {
           System.err.println();
           exception.printStackTrace();
        }

        
    }

    // método genérico testPush insere elementos em uma Stack
    public static <T> void testPush(String name, Stack<T> stack, T[] elements) {

        // insere elementos na Stack
        System.out.println("Alocando elementos em stack");
        for (T t : elements) {
            
            System.out.printf("%s ", t);
            stack.push(t);// insere o elemento na pilha
        }
    }

}
