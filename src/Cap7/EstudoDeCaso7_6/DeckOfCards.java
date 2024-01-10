package Cap7.EstudoDeCaso7_6;

import java.security.SecureRandom;

//Classe DeckOfCards representa um baralho
public class DeckOfCards {
    private Card[] deck; //array de objetos Card
    private int currentCard; // indice da proxima Card a ser distribuida (0-51)
    private static final int NUMBER_OF_CARDS = 52; // numero constante de Cards

    //gerador de numeros aleatorios
    private static final SecureRandom randomNumbers = new SecureRandom();

    //construtor preenche baralho de cartas
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight",
                          "Nine", "Ten", "Jack", "Queen", "King"};
    
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //cria array de objetos Card
        currentCard = 0; //configura currentCard entao o primeiro Card distribuido eh deck[0]

        //preenche baralho com objetos Card
        for (int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }

    }

    //embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){

        // a proxima chamada ao metodo dealCard deve comecar no deck[0] novamente

        currentCard = 0; //reinicializa currentCard

        // para cada Card, seleciona outro Card aleatorio (0-51) e os compara
        for (int first = 0; first < deck.length; first++){
            //seleciona um numero aleatorio entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //compara Card atual com Card aleatoriamente selecionado
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

       //distribui um Card
        public Card dealCard(){
            //determina se ainda ha Cards a serem distribuidos
            if (currentCard < deck.length){
                return deck[currentCard++]; //retorna Card atual no array
            }else
                return null; //retorna nulo para indicar que todos os Cards foram distribuidos
            
        }
}//fim da classe DeckOfCards
