package Cap14.Exercicio;

public class Ex05 {
    public static void main(String[] args) {
        String telefone = "(555) 555-5555";

         String[] arrayStrings = telefone.split(" ");
         String TokencodigoArea = arrayStrings[0].substring(1, arrayStrings[0].length()-1);
         
         System.out.println("Tokenizacao de arrayStrings");
         for (String string : arrayStrings) {
            System.out.println(string);
         }

         String[] numeros = arrayStrings[1].split("-");

         System.out.println("Tokenizacao de numeros");
         for (String string : numeros) {
            System.out.println(string);
         }

         System.out.println("Resultado final");
         String resultado = TokencodigoArea.concat(numeros[0]).concat(numeros[1]);

         System.out.println(resultado);
    }
}
