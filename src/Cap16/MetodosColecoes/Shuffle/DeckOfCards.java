package Cap16.MetodosColecoes.Shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//E mbaralhamento e destribuicao de cartas com o metodo shuffle eCollections
 class Card {
    
    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven,
    Eigth, Nine, Ten, Jack, Queen, King};

    public static enum Suit {Clubs, Diamonds, Hearts, Spedes};

    private final Face face;
    private final Suit suit;

    //construtor
    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }

    public Face getFace(){
        return face;
    }

    public Suit getSuit(){
        return suit;
    }

    public String toString(){
        return String.format("%s of %s", face, suit);
    }// fim da classe;
}
// declaracao da classe deckOfCards
public class DeckOfCards {


    private List<Card>list; // declara list que armazenara cards

    //configura baralho de cartas 
    public DeckOfCards(){
        Card[] deck = new Card[52]; // cria baralho como array com o Tipo Card 
        int count=0; 

        //para cada Face um Suit, apos completar as cartas com o respectivo suit
        // para para o prossimo e assim por diante. Clubs -> Diamonds -> Hearts ->Spedes
        for(Card.Suit suit : Card.Suit.values()){ 
            for (Card.Face face : Card.Face.values()) { //Ace -> Duece -> Three ...King
                deck[count] = new Card(face, suit); // depois de passar por Face e suit armazena no array deck
                                                    // um novo obajeto Card na posicao que estiver count
                count++;
            }
        }

        list = Arrays.asList(deck); // Converte o Array para Lista
        Collections.shuffle(list); // embaralha a lista

    }

    public void printCards(){
        //exibe 52 cartas em duas colunas
        for(int i=0; i < list.size(); i++)
            System.out.printf("%-19s%s", list.get(i),
             ((i + 1) % 4 == 0) ? "\n" : "");
        
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printCards();
    }
    
}
