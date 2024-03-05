package Cap14.StringBuilder;
// StringBuilder constructors.
public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder(); // default capacity 16
        StringBuilder buffer2 = new StringBuilder(10); // capacity 10
        StringBuilder buffer3 = new StringBuilder("hello"); // capacity 16 + 5 = 21

        System.out.printf("buffer1 = \"%s\"\n", buffer1.toString()); // explicit call to toString
        System.out.printf("buffer2 = \"%s\"\n", buffer2.toString());
        System.out.printf("buffer3 = \"%s\"\n", buffer3); // implicit call to toString
    }
}
