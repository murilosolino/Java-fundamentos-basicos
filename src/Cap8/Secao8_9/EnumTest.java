package Cap8.Secao8_9;

import java.util.EnumSet;

//Testando a enum Book
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Todos os livros: ");

        //imprime todos os livros em enum Book
        for(Book book: Book.values()){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getYear());
        }

        System.out.printf("%nExibindo um intervalo especifico de constantes:%n");

        //imprime os primeiros quatro livros
        for(Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getYear());
        }
    }
}
