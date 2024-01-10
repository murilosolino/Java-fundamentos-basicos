package Cap6;
// A classe Craps simula o jogo de dados Craps
import java.security.SecureRandom;

public class Craps {

    //cria um gerador seguro de numeros aleatorios para o uso do metodo rollDice
    private static final SecureRandom randomNumber = new SecureRandom();

    // constantes tipo enum para identificar o satus do jogo
    private enum Status {CONTIUE, WON, LOST};

    //constantes que representam lancamento comum dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARDS = 12;

    public static void main(String[] args) {
         
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice(); //variavel sumOfDice atribui o retonro do metodo rollDice

        //verificacao para saber se Ganhou, perdeu ou jogo continua
        switch (sumOfDice) {

            case SEVEN: case YO_ELEVEN: // caso seja as constantes SEVEN ou YO_ELEVEN
            gameStatus = Status.WON; // gameStatus vai para WON
                break;

            case SNAKE_EYES: case TREY: case BOX_CARDS: // caso seja SKANE_EYES, TREY ou BOX_CARDS
            gameStatus = Status.LOST;// gameStatus vai para Lost
            break;

            default: // caso nao seja nenhum nem outro
            gameStatus = Status.CONTIUE; // jogo continua
            myPoint = sumOfDice; // soma dos dados eh atribuido a variavel myPoint
            System.out.println("Pontuacao: " + myPoint); // exibe os valores
                break;
        }

        // Enquanto o Status for CONTINUE
        while (gameStatus==Status.CONTIUE) { // nem WON nem LOST

            sumOfDice = rollDice(); // rola os dados

            if (sumOfDice == myPoint){ // se a sofa for igual a pontuacao
                gameStatus = Status.WON; // jogador ganha;
            } else if (sumOfDice == SEVEN) { // se a soma for igual a SEVEN 
                gameStatus = Status.LOST; // jogador perde
            }

        }

        if (gameStatus == Status.WON){ // se jogador ganha
            System.out.println("Player WiNS"); // imprime jogador ganhou
        } else {
            System.out.println("Player LOSES");// senao jogador perdeu
        }


    }

    
    private static int rollDice() { // rollDice gera dois numeros aleatorios e os soma

        int dice1 = 1 + randomNumber.nextInt(6);
        int dice2 = 1 + randomNumber.nextInt(6);
        int sum = dice1 + dice2;
        System.out.println("jogador tirou " + dice1  + " e " + dice2 + " que somados = " + sum);

        return sum;
    }
}
