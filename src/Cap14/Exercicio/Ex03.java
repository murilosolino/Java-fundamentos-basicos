package Cap14.Exercicio;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
            String [] article = {"the","a","one","some","any"};
            String[] noun = {"boy","girl","dog","town","car"};
            String[] verb = {"drove","jumped","ran","walked","skipped"};
            String[] preposition = {"to","from","over","under","on"};

            Random random = new Random();

            int count =0;
            do{

                String randomArticle = article[random.nextInt(article.length)];
                String randomNoun = noun[random.nextInt(noun.length)];
                String randomVerb = verb[random.nextInt(verb.length)];
                String randomPrep = preposition[random.nextInt(verb.length)];

                 String finaString = randomArticle.concat(" " + randomNoun + " ").concat(randomVerb + " ").concat(randomPrep);
                 finaString = finaString.substring(0,1).toUpperCase() + finaString.substring(1).toLowerCase();
                 finaString = finaString.concat(".");
                 
                 System.out.println(finaString);
                  
                count++;
            }while(count != 20);
    }
}
