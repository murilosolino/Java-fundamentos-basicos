package Cap7.EstudoDeCaso7_6;
//Classe Card representa uma carta de baralho
public class Card {
    
    //variaveis de instancia
    private final String face; // face da carta ("Ace", "Deuce", ...)
    private final String suit; // naipe da carta ("Hearts", "Diamonds", ...)

    //construtor de dois argumentos inicializa face e naipe da carta
    public Card(String face, String suit){
        this.face = face; // inicializa face da carta
        this.suit = suit; // inicializa naipe da carta
    }

    //toString retorna representacao String de Card
    public String toString(){
        return face + " of " + suit;
    }

}//fim da classe Card
