package Cap15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame{
    
    private final JTextArea outpArea; // exibe conetudo do aqrquivo;

    public JFileChooserDemo() throws IOException{
        super("JfileChooserDemo");
        outpArea = new JTextArea();
        add(new JScrollPane(outpArea)); // ouput Area rolavel
        analyzePath(); // obtem o Path do usuario e exibe as informacoes
    }

    //exibe as informacoes sobre o arquivo que o usuario seleciona
    public void analyzePath() throws IOException{

        //Obtem o Path para o diretorio ou arquivo selecionado pelo usuario
        Path path = getFileOrDirectoryPath();

        // se existir este Path, exibe as informacoes sobre ele
        if (path != null && Files.exists(path)){
            // coleta informacoes sobre o arquivo (ou diretorio)
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", path.getFileName()));
            builder.append(String.format("%s um diretorio%n", Files.isDirectory(path) ? "E" : "Nao e"));
            builder.append(String.format("%s um arquivo normal%n", Files.isRegularFile(path) ? "E" : "Nao e"));
            builder.append(String.format("%s oculto%n", Files.isHidden(path) ? "E" : "Nao e"));
            builder.append(String.format("Ultima modificacao: %s%n", Files.getLastModifiedTime(path)));
            builder.append(String.format("Tamanho: %s bytes%n", Files.size(path)));
            builder.append(String.format("Caminho: %s%n", path));
            builder.append(String.format("Caminho absoluto: %s%n", path.toAbsolutePath()));

            if (Files.isDirectory(path)){ // listagem do diretorio de saida
                builder.append(String.format("%nConteudo do diretorio:%n"));

                // objeto para iterar pelo conteudo do diretorio
                try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
                    for (Path p : directoryStream){
                        builder.append(String.format("%s%n", p));
                    } 
                }
            }
            outpArea.setText(builder.toString()); // exibe o conteudo de Path
        } else { // Path nao existe
            JOptionPane.showMessageDialog(this, path.getFileName() + " nao existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    //permite que o usuario especifique o nome do caminho ou diretorio
    private Path getFileOrDirectoryPath() {
        //congigura o dialogo permitindo a selecao de arquivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = fileChooser.showOpenDialog(this);

        // caso o usuario clique no botao de cancel
        if (result == JFileChooser.CANCEL_OPTION){
            System.exit(1);
        }

        return fileChooser.getSelectedFile().toPath();
    }

}
