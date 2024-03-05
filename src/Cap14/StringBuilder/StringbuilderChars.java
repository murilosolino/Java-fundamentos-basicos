package Cap14.StringBuilder;
//Metodos charAt, setCharAt, getChars e reverse de StringBuilder.
public class StringbuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");

        // retorna o caractere na posição especificada
        System.out.printf("buffer = %s\n", buffer.toString());
        System.out.printf("Character at 0: %s\nCharacter at 4: %s\n\n",
            buffer.charAt(0), buffer.charAt(4));

        //copia caracteres de um StringBuilder no array de caractere passado como um argumento.
        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("The characters are: ");
        for (char character : charArray) {
            System.out.print(character);
        }

        // altera o conteúdo de buffer 
        //aceita um argumento inteiro e um argumento caractere e configura o caractere na posição especificada
        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.printf("\n\nbuffer = %s\n", buffer.toString());

        // inverte o conteúdo de buffer
        buffer.reverse();
        System.out.printf("buffer = %s\n", buffer.toString());
    }
}
