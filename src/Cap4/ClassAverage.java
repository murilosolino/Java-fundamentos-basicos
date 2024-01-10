package Cap4;
// Resolvendo o problema da media da classe usando repeticao controlada por contador
import java.util.Scanner; //  programa utiliza a classse Scanner

public class ClassAverage { // incio da classe
    public static void main(String[] args) {
        
        // cria scanner para obter entrada de dados a partir do prompt
        Scanner input = new Scanner(System.in); 
        
        //inicia as variaveis
        double total = 0.0;
        int contador = 1;

        
        // Fase de processo que utiliza a repeticao controlada por contador
        while (contador <= 10) { // faz o loop 10 vezes
            System.out.println("insira a nota do usuario");//prompt
            double nota = input.nextDouble();// insere a nota
            total =  total + nota; // adiciona a nota a total
            contador++; // incrementa 1 no contador
        }

        System.out.println("O total da sala eh: " + total); // imprime total da nota
        System.out.println("A media da sala foi de: " + (total / 10)); //  imprime media da sala

    }    
}// fim da classe
