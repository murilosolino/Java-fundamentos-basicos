package Cap6;
//Declaracao de metodos sobrecarregados

public class MethodOverLoad {

    private static int y;


    //Teste dos metodos square sobrecarregados
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }

    public static int square (int x){

        System.out.println("Called square with int argument " + x);
         return x * x;
    }

    
    public static double square (double x){

        System.out.println("Called square with double argument " + x);
         return x * x;
    }
}
