package Cap14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// classes Pattern e Matcher
public class RegexMatches {
    public static void main(String[] args) {
        // cria expressao regular
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

        String string1 = "Jone's birthday is 05-12-75\n" + "Dave's birthday is 11-04-68\n" 
        + "John's birthday is 04-28-73\n" + "Joe's birthday is 12-17-77";

        // corresponde expressao regular com string e imprime os resultados
        Matcher matcher = expression.matcher(string1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
    }
}
