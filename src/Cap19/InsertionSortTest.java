package Cap19;
// Classificando um array com InsertionSort
// Algoritmo ineficiente para classificar arrays grandes
// big O notation: O(n^2)
// melhor caso: O(n)
// pior caso: O(n^2)
// caso medio: O(n^2)
// melhor usar o metodo sort da classe Arrays
public class InsertionSortTest {
    
    public static void insertionSort(int[] data){

        // fazz o loop sobre data.length -1 elementos
        for (int i = 1; i < data.length; i++) {

            int insert = data[i]; //valor para inserir 
            int moveIten = i; // local da insercao

            //procura o local para colocar o numero
            while (moveIten > 0  && data[moveIten -1] > insert) {
                //desloca o elemento direito 1 slot
                data[moveIten] = data[moveIten -1];
                moveIten--;
            }

            data[moveIten] = insert;
            printPass(data, i, moveIten);
            
        }
    }

    private static void printPass(int[] data, int i, int moveIten) {
        System.out.printf("after pass %2d: ", i);

        //saida de elementos ate o item selecionado
        for (int j = 0; j < moveIten; j++) {
            System.out.printf("%d ", data[j]);
        }

        System.out.printf("%d* ", data[moveIten]); //indicador de troca

        //termina a saida do array
        for (int j = moveIten + 1; j < data.length; j++) {
            System.out.printf("%d ", data[j]);
        }

        System.out.printf("%n");

        for (int j = 0; j < i; j++) {
            System.out.print("-- ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {7, 4, 3, 5, 6, 2, 1};

        insertionSort(data);
    }

}
