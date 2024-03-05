package Cap14.Character;

public class OtherCharMethods {
    public static void main(String[] args) {
         
        Character c1 = 'a';
        Character c2 = 'A';

        System.out.printf("c1 = %s%n c2= %s%n", c1.charValue(), c2.toString());

        if (c1.equals(c2)) {
            System.out.println("igual");
        } else{
            System.out.println("diferente");
        }
    }
}
