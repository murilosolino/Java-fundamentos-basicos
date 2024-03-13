package Cap15;
// Gravando os dados em um arquivo de texto sequencial com a classe Formatter

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    private static Formatter output; // envia uma saida de texto para o arquivo

    public static void main(String[] args) throws Exception {

        OpenFile();
        addRerods();
        CloseFile();
        
    }

    //abre aquivo
    private static void OpenFile() throws FileNotFoundException{
        try {
            output = new Formatter("clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permissao negada. Terminando o programa");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo. Terminando o programa");
            System.exit(1);
        }
    }

    private static void addRerods(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
        "Entre com o numero da conta, nome, sobrenome e saldo.", "Tecle Ctrl z para sair");

       while (scanner.hasNext()) {
        try {
            output.format("%d %s %s %.2f %n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Erro ao escrever o arquivo. Terminando...");
           
        } catch(NoSuchElementException elementException){
            System.err.println("Entrada invalida. Por favo tente novamente");
            scanner.nextLine(); // descarta a entrada para  o usuario tentar de novo
        }

       }
            
            System.out.print("?");
      
    } // fim do metodo

    private static void CloseFile(){
        if (output != null) {
            output.close();
        }
    }
}
