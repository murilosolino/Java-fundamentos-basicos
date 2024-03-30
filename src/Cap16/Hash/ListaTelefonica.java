package Cap16.Hash;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListaTelefonica {

    public static void main(String[] args) throws FileNotFoundException {

        Map<String,Long> listaTelefonica = new HashMap<>();// nomes sao as chaves e numeros os valores

        System.out.println("Menu de opcoes");
        int opc = 0;
        do {
            System.out.println("\n1 - Cadastrar Contato");
            System.out.println("2 - Consultar Contatos");
            System.out.println("3 - Remover Contato");
            System.out.println("4 - gravar lista em arquivo \n");
            System.out.println("5 - Consultar especifico \n");
            System.out.println("6 - Sair \n");

            Scanner scanner  = new Scanner(System.in);

            System.out.printf("Selecione uma opcao: ");
             opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    cadastrarLista(listaTelefonica);
                    break;
                case 2:
                    consultarContatos(listaTelefonica);
                    break;
                case 3:
                    removerContato(listaTelefonica);
                    break;
                case 4: 
                    gravarListaEmArquivo(listaTelefonica);
                case 5: 
                    consultarExpecifico(listaTelefonica);
                default:
                    break;
            }    
        } while (opc != 6);

    }

    private static void consultarExpecifico(Map<String, Long> listaTelefonica) {
        Scanner scanner = new Scanner(System.in); // inicia objeto scanner para entrada de dados a partir do teclado
        System.out.printf("Entre com o nome que deseja buscar: ");
        String buscandoNome = scanner.nextLine(); //armazena o dado digitado

        String  nomeEncontrado = null; // variavel para verificar se o nome foi encontrado
        for (String key : listaTelefonica.keySet()) { // adquiri as chaves a cada loop

            if (key.equalsIgnoreCase(buscandoNome)){ // se key foi igual ao buscandoNome
                nomeEncontrado = buscandoNome; // nome buscado passa para nome encontrado na lista
                break;
            }

        }

        if (listaTelefonica.containsKey(nomeEncontrado)){ // se lista telefonica possuir o nome
            System.out.println(nomeEncontrado.toString()); // imprime o toString do objeto
        } else {
            System.out.println("\nContato nao existe"); 
        }


    }

    private static void gravarListaEmArquivo(Map<String, Long> listaTelefonica) throws FileNotFoundException {
      
        PrintWriter printWriter = new PrintWriter("ListaTelefonica.txt"); // abre um novo arquivo texto

       printWriter.write("NOME / TELEFONE \n"); // escreve no arquivo

        for (Map.Entry<String, Long> contato : listaTelefonica.entrySet()) { // vare o HashMap
            printWriter.write(contato.getKey() +  " : " + contato.getValue() + "\n"); 
            // enquanto vare o HashMap vai gravando no arquivo
            // a chave e valor dos componetes do HahMap
        }

        printWriter.close(); // fecha e salva arquivo

    }

    private static void removerContato(Map<String, Long> listaTelefonica) {
        Scanner scanner = new Scanner(System.in);

        //Faz a busca por chave(Nome) de quem deseja remover
        System.out.printf("%nEntre com o nome do contato que deseja remover: ");
        String removeKey;
        removeKey = scanner.nextLine(); // adquiri o valor passado via teclado para removeKey

        String keyToRemove = null;
        for (String key : listaTelefonica.keySet()) { // vare as chaver do HashMap
            if (key.equalsIgnoreCase(removeKey)) { // se a chave for igual ao valor passado para removeKey
                keyToRemove = key;// atribui o valor da chave para keyToRemove
                break;
            }
        }

        if(listaTelefonica.containsKey(keyToRemove)){ // se no HasMap possuir um valor igua keyToremove
            listaTelefonica.remove(keyToRemove); // remove o componente
            System.out.println("\n Contato removido com sucesso");
        } else {
            System.out.println("\n Contato inexistente na lista");
        }



    }

    private static void consultarContatos(Map<String, Long> listaTelefonica) {
        // Obtem o conjunto de chaves do HashMap listaTelefonica
        Set<String> keys = listaTelefonica.keySet(); 

        // Cria um TreeSet (que é uma estrutura de dados ordenada) a partir do conjunto de chaves
        TreeSet<String> sortedKey = new TreeSet<>(keys);

        // Imprime o cabeçalho da lista de contatos
        System.out.printf("%nLista contem:%nNome\t\tNumero%n");

        // Itera sobre o conjunto de chaves ordenadas
        for (String key : sortedKey) {
        // Para cada chave, imprime a chave (nome do contato) e o valor correspondente (número do contato)
        System.out.printf("%-10s    %10s%n", key, listaTelefonica.get(key));
        }
    }

    private static void cadastrarLista(Map<String, Long> listaTelefonica) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara variáveis para armazenar o nome e o número do contato
        String nomeContato;
        long numeroContato = 0;

        // Solicita ao usuário que insira o nome do contato
        System.out.printf("Entre com o nome do novo contato: ");
        // Lê a linha de entrada do usuário e a armazena na variável nomeContato
        nomeContato = scanner.nextLine();

        try {
            // Solicita ao usuário que insira o número do contato
            System.out.printf("%nEntre com o numero do novo contato: ");
            // Tenta ler a próxima entrada long do usuário e armazená-la na variável numeroContato
            numeroContato = scanner.nextLong();
        } catch (InputMismatchException argumentException) {
            // Se a entrada do usuário não puder ser convertida para um long, imprime uma mensagem de erro e a pilha de chamadas
            System.err.println("Entre apenas com numeros");
            argumentException.printStackTrace();
        }

        // Adiciona o novo contato à listaTelefonica com o nome do contato como chave e o número do contato como valor
        listaTelefonica.put(nomeContato, numeroContato);
    }
}// fim da classe
