package Cap18;
// metodo recursivo de fibonacci

import java.math.BigInteger;

public class Fibonacci {
    
    public static BigInteger fibonacci(BigInteger number){
        if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)){ // caso basico
            return number;
        } else { // passo de recursap
            return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(BigInteger.TWO)));
        }
    }

    public static void main(String[] args) {
        for (int i = 0;  i <= 20; i++) {
            System.out.printf("Fibonacci of %d is: %d%n", i, fibonacci(BigInteger.valueOf(i)));
        }
    }

}
