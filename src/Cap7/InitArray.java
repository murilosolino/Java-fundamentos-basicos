package Cap7;

import java.security.SecureRandom;

//Classe para inicializacao de um array
public class InitArray { // inicio da classe
    public static void main(String[] args) {

        int [] array = new int[10]; // inicializando uma array int de 10 posicoes
        SecureRandom randomNumber = new SecureRandom(); // inicia um objeto para gerar numeros ale atorios

        for (int counter = 0; counter < array.length; counter++){ // for para percorer o array

            // atribui a cada indice que counter percorre um inteiro aleatorio de 0 a 9
            array[counter] = randomNumber.nextInt(9); 

            // imprime o indice e seu respectivo numero
            System.out.printf("%5d%8d%n", counter, array[counter]); 
        }

        System.out.println(); // pulando uma linha

        // Criando um array com numeros ja definidos
        int[] array2 = {32,27,46,55,11,12,68,93};
         int sum = 0;

        //for para percorrer o array de elementos e tamanho pre-definido
        for (int counter = 0; counter < array2.length; counter++){ 
            
            // imprime o indice e seu respectivo numero
             System.out.printf("%5d%8d%n", counter, array2[counter]);
            
            //somando os valores do arrays
            sum += array2[counter];
             
        }

        System.out.println("Soam dos valores = " + sum); // imprimindo a soma
    }
}// fim da classe InitArray
