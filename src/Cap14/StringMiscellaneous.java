package Cap14;
//Esse aplicativop demonstra os metodos da classe String
//Length, charArt e get Chars
public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "Hello There";
        char [] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        //testa o metodo length
        System.out.printf("%n Length of s1: %s", s1.length());

        //faz um loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.printf("%n The String reversed is: ");

        for (int count = s1.length() -1; count >=0; count --){
            System.out.printf("%c ", s1.charAt(count));
        }

        //Copia caracteres a partir de string para charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%n The caracter array is: ");

        for (char c : charArray) {
            System.out.print(c);
            
        }
    }
}
