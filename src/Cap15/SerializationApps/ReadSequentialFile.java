package Cap15.SerializationApps;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadSequentialFile {
    private static ObjectInputStream input; // lê os dados do arquivo

    public static void main(String[] args) {
        openFile();
        readRecord();
        closeFile();
    }

    private static void openFile() {
        try {
            input =  new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Erro ao abrir aquivo. Terminando.");
            System.exit(1);
        }
    }
    public static void readRecord(){
        System.out.printf("%-10s%-12s%-12s%10s%n", "Conta", "Primeiro Nome", "Ultimo Nome", "Saldo");

        try {
            while (true){
                Account record = (Account) input.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(),
                 record.getLastName(), record.getBalance());
            }
        } catch (EOFException e) {
            System.err.println("Sem mais garvacoes.");
         } catch (IOException e) {
             System.err.println("Erro ao ler no arquivo. Terminando."); 
             System.exit(1);     
         } catch (ClassNotFoundException e) {
             System.err.println("Objeto invalida. Terminando.");
             System.exit(1);
         }
    }

    private static void closeFile() {
        try {
            if (input != null){
                input.close();
            }
        } catch (IOException ioException) {
            System.err.println("Erro ao fechar arquivo. Terminando.");
            System.exit(1);
        }
    }
}
