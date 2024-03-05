package Cap14;
// Metodos String replace e toLowerCase e toUpperCase,trim e toCharArray
// nenhum dos quais modifica a string em que eles são chamados
public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces   ";

        System.out.printf("s1: %s%ns2: %s%ns3: %s%n%n", s1, s2, s3);

        // testa o metodo replace
        System.out.printf("Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

        // testa toLowerCase e toUpperCase
        System.out.printf("s1.toUpperCase(): %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase(): %s%n%n", s2.toLowerCase());

        // testa trim method
        System.out.printf("s3 after trim: %s%n", s3.trim());

        // testa toCharArray method
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array: ");
        System.out.println();

        int i = 0;
        for (char character : charArray) {
            System.out.println(character + " - index " + i);
            i++;
        }

    }
}
