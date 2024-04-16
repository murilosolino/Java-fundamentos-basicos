package Cap20;

public class RawTypeTest {
    public static void main(String[] args) {
        
        Double[] doubleElements  = {1.1,2.2,3.3,4.4,5.5};
        Integer[] intElements = {1,2,34,5,6,7,8,9,10};

        //Pilha de tipos brutos atribuidos a classe Stack da variavel de tipos brutos
        Stack rawTyStack01  = new Stack<>(5);

        //Stack <Double> atribuido a stack da variavel de tipo bruto
        Stack rawTypeStack02 = new Stack<Double>();

        //Pilha de tipo bruto atribuido a variavel Stack<Integer>
        Stack<Integer> rawTypeStack03 = new Stack<>();

       
        StackElements.testPush("rawTyStack01", rawTyStack01, doubleElements);
        StackElements.testPop(rawTyStack01);

        StackElements.testPush("rawTyStack01", rawTyStack01, intElements);

        StackElements.testPush("rawTypeStack02", rawTypeStack02, doubleElements);
        StackElements.testPop(rawTypeStack02);

        StackElements.testPush("rawTypeStack03", rawTypeStack03, intElements);
        StackElements.testPop(rawTypeStack03);

   
       
        


    }
}
