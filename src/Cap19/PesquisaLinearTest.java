package Cap19;

public class PesquisaLinearTest {
    
    public static int PesquisaLinear(int[] array, int chave){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == chave){
                return i;
            }  
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayTest = {10,9,324,23,1,34,55,66,83,95,1020};

        int chave = 34;
        int result = PesquisaLinear(arrayTest, chave);

        if (result == -1){
            System.out.println("Valor nao encontrado");
        } else {
            System.out.printf("Valor %d encontrado no indice %d%n", chave, result);
        }


    }

}
