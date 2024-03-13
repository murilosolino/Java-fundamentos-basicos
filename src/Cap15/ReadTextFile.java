package Cap15;
// este programa le um arquivo de texto e exibe seus registros 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        OpenFile();   
        readRecords();
        CloseFile();
    }

 

    private static void OpenFile() {
       try {
        scanner = new Scanner(Paths.get("clientes.txt"));
       } catch (IOException ioException) {
        System.err.println("Problemas ao abrir aquivo. Terminando o programa...");
        System.exit(1); // Qualquer valor diferente de 0 signfica que o programa sera finalizado por conta de erro
       }
    }

    // le e exibe os registros
    private static void readRecords() {
        // exibe o cabeçalho
        System.out.printf("%-10s%-12s%-12s%10s%n", "Conta", "Primeiro Nome", "Sobrenome", "Saldo");

        while (scanner.hasNext()) {
            try {
                while (scanner.hasNext()) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                }        
            } catch (NoSuchElementException elementException) {
                System.err.println("Arquivo com formato incorreto. Terminando o programa...");
                System.exit(1);
            } catch (IllegalStateException stateException) {
                System.err.println("Erro ao ler o arquivo. Terminando o programa...");
                System.exit(1);
            }       
        }
    }

    private static void CloseFile(){
        if(scanner != null){
            scanner.close();
        }
    }

    

}
