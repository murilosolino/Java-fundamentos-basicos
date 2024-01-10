package Cap7;

public class StudentPoll {
    public static void main(String[] args) {
        // array de respostas dos alunos (mais tipicamente, inserido em tempo de execucao)
        int[] responses = {1,0,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};

        int[]frequency = new int[6]; // array de contadores de frequencia

        // para cada resposta, seleciona o elemento de respostas e usa esse valor
        // como indice de frequencia para determinar o elemento a incrementar
        for (int answer = 0; answer < responses.length; answer++){  // answer eh o contador
            try{
                //reposnse[answer] eh o indice de frequencia (1-5) para a resposta
                //++frequency incrementa 1 para posicao de frequency
                // que eh especificada pelo respectivo numero guardado em responses[answer]
                // o array frequency possui 6 elementos; o primeiro elemento eh ignorado sendo assim, o indice de 0-5
                // 0-5 eh a escala de notas
                ++frequency[responses[answer]]; // incrementa a frequencia
                
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e); // invoca o metodo toString
                System.out.printf("    responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
        for (int rating = 0; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
