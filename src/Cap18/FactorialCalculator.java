package Cap18;

import java.math.BigInteger;

public class FactorialCalculator {
    // metodo fatorial recursivo
    public static BigInteger factorial(BigInteger number){

        if (number.compareTo(BigInteger.ONE) <= 0){ // testa o caso basico (condicao de parada)
            return BigInteger.ONE; // casos basicos = 0! = 1 e 1! = 1
        } else { // passo de recursao
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        for(int count = 0; count <= 50; count++){
            System.out.printf("%d! = %d%n", count, factorial(BigInteger.valueOf(count)));
        }

    }

}
