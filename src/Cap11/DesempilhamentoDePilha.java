package Cap11;
public class DesempilhamentoDePilha {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) { // captura a execção lançada em metodo 1
            System.err.println(e.getMessage());
            e.printStackTrace();

            //obtem as informações de rastreamento de pilha 
            StackTraceElement[] traceElements = e.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
         System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }//fim main

    // chamada method2; lança exceções de volta para main
    public static void method1() throws Exception{
        method2();
    }
    
    // chamada method3: lança exceções para method1 
    public static void method2() throws Exception{
        method3();
    }

     // lança exceções para method2
    public static void method3() throws Exception{

     throw new Exception("Excecao lançada no metodo 3");

    }
}//fim da classe 
