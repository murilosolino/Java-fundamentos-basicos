package Cap7;
public class VarargsTest {
    
    // calcula a média
    // método avarage utiliza um número indefinido de argumentos de ponto flutuante
    // indefinicao permite que o método avarage seja chamado com qualquer número de argumentos de ponto flutuante
    // e eh caracaterizada pelas "..." apos o tipo do argumento
    public static double avarage (double... numbers){
        double total = 0.0;

        for (double i: numbers){
            total += i;
        }

        return total / numbers.length;

    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n", d1, d2, d3, d4);

        System.out.printf("Average of d1 and d2 is %.1f%n", avarage(d1, d2));
        System.out.printf("Average of d1, d2 and d3 is %.1f%n", avarage(d1, d2, d3));
        System.out.printf("Average of d1, d2, d3 and d4 is %.1f%n", avarage(d1, d2, d3, d4));
    }

}
