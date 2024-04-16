package Cap20;

public class GenericMethodTest {
        public static void main(String[] args) {
            
            Integer[] integerArray = { 1,2,3,4,5,6,7};
            Double[] doubleArray = {23.4,23.5, 6.8, 91.26, 1.12};
            Character[] charArray = {'H','E','L','L','O'};


            printArray(integerArray);
            printArray(doubleArray);
            printArray(charArray);
        }

        private static <T> void printArray(T[] data) {

            for (T item : data) {
                System.out.printf("%s ", item);
            }

            System.out.println();

        }
}
