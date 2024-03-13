package Cap15.SerializationApps;
// gravando objetos sequencialmente em um arquivo com a classe ObjectOutputStream

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequencialFile {
    private static ObjectOutput output; // gera a saida de dados no arquivo

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    private static void openFile() {
        try {
            output =  new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Erro ao abrir aquivo. Terminando.");
            System.exit(1);
        }
    }

    private static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ", "Digite o numero da conta, primeiro nome, ultimo nome e saldo.",
         "Para encerrar a entrada, digite o indicador de fim de arquivo (no windows, Ctrl + z; no linux, Ctrl + d)");

        while (input.hasNext()) {
            try {
                Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());
                //serializa o objeto do registro para o arquivo
                output.writeObject(record);

            } catch (NoSuchElementException e) {
               System.err.println("Entrada invalida. Tente novamente.");
                input.nextLine(); // descarta a entrada para o usuario tentar de novo
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo. Terminando.");
                break;
            }
           System.out.println("? ");
        }

    }

    private static void closeFile() {
        try {
            if (output != null){
                output.close();
            }
        } catch (IOException ioException) {
            System.err.println("Erro ao fechar arquivo. Terminando.");
            System.exit(1);
        }
    }
}
