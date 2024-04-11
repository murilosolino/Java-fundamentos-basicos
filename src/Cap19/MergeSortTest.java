package Cap19;

public class MergeSortTest {
    
        //chama o metodo split recursivo para comecar a classificacao
        public static void mergeSort(int[] data) {
            sortArray(data, 0, data.length - 1); //chama o metodo sortArray recursivo
        }

        //divide o array, classifica os dois subarrays e mescla os resultados
        private static void sortArray(int[] data, int low, int high) {
            //testa o caso base: o tamanho do array e maior que 1
            if ((high - low) >= 1) {
                int middle1 = (low + high) / 2; //calcula o meio do array
                int middle2 = middle1 + 1; //calcula o proximo elemento

                //exibe a divisao do array
                System.out.printf("split:   %s%n", subarrayString(data, low, high));
                System.out.printf("         %s%n", subarrayString(data, low, middle1));
                System.out.printf("         %s%n%n", subarrayString(data, middle2, high));

                //divide o array pela metade; classifica a primeira metade
                sortArray(data, low, middle1); //primeira metade do array
                //divide o array pela metade; classifica a segunda metade
                sortArray(data, middle2, high); //segunda metade do array

                //mescla dois arrays classificados depois que eles retornam
                merge(data, low, middle1, middle2, high);
            }
        }

        //mescla dois arrays classificados em um array classificado
        private static void merge(int[] data, int left, int middle1, int middle2, int right) {
            int leftIndex = left; //indice do primeiro array
            int rightIndex = middle2; //indice do segundo array
            int combinedIndex = left; //indice do array temporario
            int[] combined = new int[data.length]; //array de trabalho

            //exibe os dois arrays antes da mesclagem
            System.out.printf("merge:   %s%n", subarrayString(data, left, middle1));
            System.out.printf("         %s%n", subarrayString(data, middle2, right));

            //mescla os arrays ate alcancar o final de um deles
            while (leftIndex <= middle1 && rightIndex <= right) {
                //coloca o menor dos dois elementos no array temporario
                //este passo e feito varias vezes
                //ate que um dos arrays esteja vazio
                if (data[leftIndex] <= data[rightIndex]) {
                    combined[combinedIndex++] = data[leftIndex++];
                } else {
                    combined[combinedIndex++] = data[rightIndex++];
                }
            }

            //se o primeiro array esta vazio
            if (leftIndex == middle2) {
                //copia o restante do segundo array
                while (rightIndex <= right) {
                    combined[combinedIndex++] = data[rightIndex++];
                }
            } else { //o segundo array esta vazio
                //copia o restante do primeiro array
                while (leftIndex <= middle1) {
                    combined[combinedIndex++] = data[leftIndex++];
                }
            }

            //copia os valores de volta para o array original
            for (int i = left; i <= right; i++) {
                data[i] = combined[i];
            }

            //exibe o array mesclado
            System.out.printf("         %s%n%n", subarrayString(data, left, right));
        }

        //metodo para exibir certos valores no array
        private static String subarrayString(int[] data, int low, int high) {
            StringBuilder temporary = new StringBuilder();

            //exibe espacos para alinhamento
            for (int i = 0; i < low; i++) {
                temporary.append("   ");
            }

            //exibe elementos que estao no array
            for (int i = low; i <= high; i++) {
                temporary.append(" " + data[i]);
            }

            return temporary.toString();
        }

        public static void main(String[] args) {
            int[] data = {7, 4, 3, 5, 6, 2, 1};

            System.out.printf("Unsorted array:%n%s%n%n", subarrayString(data, 0, data.length - 1));

            mergeSort(data); //classifica o array

            System.out.printf("Sorted array:%n%s%n", subarrayString(data, 0, data.length - 1));
        }

}
