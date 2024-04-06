package Cap17;

import java.util.stream.IntStream;

//Demonstrando operacaos IntStream
//Esta seção demonstra como lambdas e fluxos podem ser usados para simplificar as tarefas
//  de programação aprendidas no Capítulo 7, “Arrays e ArrayLists”.]
public class IntStreamOperations {
        public static void main(String[] args) {
        
            int[] values = {3,10,6,1,4,8,2,5,9,7};

            //exibe valores originais
            System.out.printf("Original Values ");
                IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
            System.out.println();

            
            System.out.printf("%nCount: %d%n", IntStream.of(values).count());
            System.out.printf("%nMin: %d%n", IntStream.of(values).min().getAsInt());
            System.out.printf("%nMax: %d%n", IntStream.of(values).max().getAsInt());
            System.out.printf("%nAvarege: %.2f%n", IntStream.of(values).average().getAsDouble());
            System.out.printf("%nSum: %d%n", IntStream.of(values).sum());

            //soma os valores com o metodod reduce 
            System.out.printf("Sum via reduce method", IntStream.of(values).reduce(0, (x,y) -> x + y));

            //soma das raizes quadradas via  metodo redude
            System.out.printf("Sum of squares via reduce method", IntStream.of(values).reduce(0, (x,y) -> x + y * y));
            
            //produto dos valores com metodo reduce
            System.out.printf("Product via reduce method", IntStream.of(values).reduce(0, (x,y) -> x * y));

            //valores pares para serem exibidos em ordem classificada
            System.out.println("\n Even values displayed in sorted order: ");
            IntStream.of(values).filter(value-> value % 2 == 0).sorted().forEach(value->System.out.println(value));

            // soma os intervalos dos numeros de 1 a 10 exclusivos
            System.out.printf("%nSum of integers from 1 to 9: %d%n", IntStream.range(1, 10).sum());

            // soma os intervalos dos numeros de 1 a 10 inclusos
            System.out.printf("%nSum of integers from 1 to 10: %d%n", IntStream.rangeClosed(1, 10).sum());
            
            //valores impares multiplicados por 10 exibidos em ordem classificada
            System.out.println("\nOdd values multiplied by 10 displayed in sorted order: ");
            IntStream.of(values).filter(value-> value % 2 != 0).map(value -> value * 10).sorted().forEach(value->System.out.println(value));
        }
}
