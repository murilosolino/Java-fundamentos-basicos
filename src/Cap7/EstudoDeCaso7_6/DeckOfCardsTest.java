package Cap7.EstudoDeCaso7_6;
//embaralamento de distribuicao de cartas
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); //coloca Cards em ordem aleatoria .

        //imprimir as cartas
        for(int i =0; i <= 52; i++){

            //distribui e exibe uma Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i % 4 == 0) //gera uma nova linha apos cada quarta carta
                System.out.println();
        }
    }
}
