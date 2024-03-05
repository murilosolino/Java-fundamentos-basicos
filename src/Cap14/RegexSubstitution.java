package Cap14;
//metodos string replaceFirst e replaceAll e split
public class RegexSubstitution {
    public static void main(String[] args) {
        
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original String 1: %s%n", firstString);

        //substitui* por ^
        firstString =  firstString.replaceAll("\\*", "^");
        System.out.println(firstString);

        firstString = firstString.replaceAll("stars", "carets");
        System.out.println(firstString);

        //substitui palavra por word
        firstString = firstString.replaceAll("\\w+", "word");
        System.out.println(firstString);

        System.out.printf("Original String 2: %s%n", secondString);
        for (int i = 0; i < 3; i++){
            secondString = secondString.replaceFirst("\\d", "digit");

            System.out.printf("First 3 digits replaced by \"digit\" : %s%n", secondString);

            System.out.println("String split at commas: ");
            String[] results = secondString.split(",\\s*");
            for (String string : results) {
                System.out.println(string);
            }
        }



    }
}
