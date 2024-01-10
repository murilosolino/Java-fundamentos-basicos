// Adiciona o pacote
package Cap7;

// Declaração da classe PassArray
public class PassArray {

    // Método principal que será executado quando o programa for iniciado
    public static void main(String[] args) {

        // Declaração e inicialização de um array de inteiros
        int array[] = {1,2,3,4,5};

        // Loop for-each que percorre cada elemento do array e imprime seu valor
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println();

        // Chama o método modifyArray passando o array como argumento
        modifyArray(array);

        System.out.println();

        // Chama o método modifyElement passando o terceiro elemento do array como argumento
        modifyElement(array[2]);
    }

    // Método que recebe um array de inteiros como parâmetro e multiplica cada elemento por 2
    public static void modifyArray(int[] array2){
        for (int i = 0; i < array2.length; i++){
            array2[i] *=2;
            System.out.println(array2[i]);
        }
    }

    // Método que recebe um inteiro como parâmetro e multiplica seu valor por 2
    public static void modifyElement(int element){
        element *=2;
        System.out.println(element);
    }
}
