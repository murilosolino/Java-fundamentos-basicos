package Cap4;

import java.util.Scanner;

public class ClassAverageSentinela {
    public static void main(String[] args) {
        
         // cria scanner para obter entrada de dados a partir do prompt
        Scanner input = new Scanner(System.in); 
        
        //inicia as variaveis
        double total = 0.0;
        int contador = 0;

        System.out.println("insira a nota do aluno ou digite -1 para sair");
        double nota = input.nextDouble();

        while (nota != -1){

            total = total + nota;
            contador ++;

             System.out.println("insira a nota do aluno ou digite -1 para sair");
             nota = input.nextDouble();
        }

        if (contador != 0){
            double media = total / contador;
            System.out.println("O total da sala eh: " + total); // imprime total da nota
            System.out.println("A media da sala foi de: " + media); //  imprime media da sala
        } else{
            System.out.println("nenhuma nota foi inserida");
        }

    }
}
