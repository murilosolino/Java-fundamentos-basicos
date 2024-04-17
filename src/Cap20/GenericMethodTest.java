package Cap20;

public class GenericMethodTest {
        public static void main(String[] args) {
            
            Integer[] integerArray = { 1,2,3,4,5,6,7};
            Double[] doubleArray = {23.4,23.5, 6.8, 91.26, 1.12};
            Character[] charArray = {'H','E','L','L','O'};
            String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eigth"};


            printArray(integerArray);
            printArray(doubleArray);
            printArray(charArray);
            printArray(stringArray);
        }

        private static <T> void printArray(T[] data) {

            for (T item : data) {
                System.out.printf("%s ", item);
            }

            System.out.println();

        }

        private static void printArray(String[] data){

            System.out.println("Array stringArray contains:");
            int count = 0;
            for (String s : data) {
                
                System.out.printf(" %-10s", s);
                count++;

                if (count == 4) {
                    System.out.println();
                }

            }

            System.out.println();
        }

      
}
