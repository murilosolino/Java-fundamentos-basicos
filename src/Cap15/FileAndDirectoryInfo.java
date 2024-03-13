package Cap15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o arquivo ou nome do diretorio");

        // cria o objeto Path com base na entrada do usuário
        Path path = Paths.get(input.nextLine()); 
        /*  A interface Path é usada para representar e manipular 
        caminhos de arquivos e diretórios em um sistema de arquivos.*/

        /* A classe Paths é uma classe utilitária que fornece métodos estáticos para obter instâncias de Path.*/

        // se o caminho existe, exibe informações sobre ele
        if (Files.exists(path)) {
            //exibe informações sobre o arquivo (ou diretório)

            /*A classe Files é uma classe utilitária que fornece métodos para 
            operações de leitura, escrita e manipulação de arquivos e diretórios. */

            System.out.printf("%n%s existe%n", path.getFileName());
            System.out.printf("%s eh um direitorio%n", Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s ah absoluto path%n", path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Ultima modificacao: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("tamanho: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            // exibe o conteúdo do diretório
            // verifica se o caminho é um diretório
            if (Files.isDirectory(path)) {
                System.out.printf("%nDirectory contents:%n");

                /* DirectoryStream é uma interface que representa um fluxo (stream) de objetos Path, 
                que você pode usar para iterar sobre as entradas em um diretório.*/

                // objeto para iteração pelo conteúdo de um diretório
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                // itera pelo conteúdo do diretório
                //imprime o conteúdo do diretório
                for (Path p : directoryStream) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.printf("%s does not exist%n", path);
        }
            
            




        
    }
}
