package Cap15.ConsultaCredito;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Esse programa le um arivo sequencialmente e exibe um texto
//coneteudo baseado no tipo de conta que o usuario solicitar
//(saldo credor, saldo devedor ou saldo zero)
public class CreditInquiry {
    private final static MenuOption[] opcoes = MenuOption.values();

    public static void main(String[] args) {
        // obtem a solictracao do usuario(saldo zero, credor ou devedor)
        MenuOption tipoConta = getRequest();

        while (tipoConta != MenuOption.END) { 
            switch (tipoConta) {
                case ZERO_BALANCE:
                    System.out.println("Conta possui saldo zerado");
                    break;
                case CREDIT_BALANCE:
                    System.out.println("Conta possui credito");
                    break;
                case DEBIT_BALANCE:
                    System.out.println("Conta possui credito");
                    break;
                default:
                    break;
            }
            readRecords(tipoConta);
            tipoConta = getRequest(); // obtem solcitacao do usuario
        }
    }// fim do main


    private static MenuOption getRequest() {
        int escolha = 4;
        // exibe as opcoes
        System.out.printf("%n%s%n%s%n%s%n%s%n",
                "Digite a opcao desejada",
                "1 - Listar contas com saldo zerado",
                "2 - Listar contas com saldo credor",
                "3 - Listar contas com saldo devedor",
                "4 - Encerrar programa");
        try {
            Scanner scanner = new Scanner(System.in);

                do { // insere solicitacao do usuario
                System.out.printf("Digite a opcao que deseja: ");
                escolha = scanner.nextInt();
                } while ((escolha < 1) || (escolha > 4));

            } catch (NoSuchElementException exception) {
            System.err.println("Argumento invalido. Termiando o programa...");
        }
        return opcoes[escolha - 1]; // retona o valor do enum na opcao
    } // fim de getRequest


    
    private static void readRecords(MenuOption tipoConta){
        // le registro de arquivo e exibe somente registros apropriados 
        // abre oa arquivo
        try {
            Scanner arquivo = new Scanner(Paths.get("clientes.txt"));

            while (arquivo.hasNext()) {
                int numeroConta = arquivo.nextInt();
                String nome = arquivo.next();
                String sobrenome = arquivo.next();
                double saldo = arquivo.nextDouble();

                if(shoudDisplay(tipoConta, saldo)){ // verifica se o tipo de conta eh valido
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", numeroConta, nome, sobrenome, saldo);
                } else {
                    arquivo.nextLine(); // descarta o registro
                }
            } 
        } catch (NoSuchElementException | IllegalArgumentException | IOException exception){
            System.err.println("Erro ao processar arquivo. Terminando o programa...");
            System.exit(1);
        }
    }// fim de readRecords


    private static boolean shoudDisplay(MenuOption tipoConta, double saldo) {
        if ((tipoConta == MenuOption.ZERO_BALANCE) && (saldo == 0)){
            return true;
        } else if ((tipoConta == MenuOption.DEBIT_BALANCE) && (saldo > 0)) {
            return true;
        } else if ((tipoConta == MenuOption.CREDIT_BALANCE) && (saldo < 0)){
            return true;
        } else{
            return false;
        }
    }
} // fim da classe 

