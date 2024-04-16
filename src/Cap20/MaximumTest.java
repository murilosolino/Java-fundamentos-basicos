package Cap20;

public class MaximumTest {
    public static void main(String[] args) {
        
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }

    //determina o maior dos 3 objetos
    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        
        T max = x; // supoe que x eh o maior valor

        // comparable retornar > 0
        if (y.compareTo(max) > 0){
            max = y; // y eh o maior valor
        }

        // comparable retornar > 0
        if (z.compareTo(max) > 0) {
            max = z; // z eh o maior valor
        }

        return max; //retorna o maior valor

    }
}
