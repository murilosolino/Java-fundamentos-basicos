package Cap7.Secao711;

public class InitArray2 {
    // Classe para manipular arrays bidimensionais

    //metodo main inicia a execução de programa
    
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{3,4,5}};
        int[][] array2 =  {{1,2}, {3}, {3,4,5}};

        //imprime array
        outPutArray(array1);

        System.out.println();

        outPutArray(array2);

        
    }

    // metodo que percorre o array  bidimensional e imprime seus valores com base na linha / coluna
    public static void outPutArray(int[][] array){
        for (int linha = 0; linha < array.length; linha++){
            for (int coluna =0; coluna < array[linha].length; coluna++){
                System.out.printf("%d ", array[linha][coluna]);
                
            }
            System.out.println();
        }
    }
}
