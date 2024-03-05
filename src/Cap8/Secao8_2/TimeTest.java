package Cap8.Secao8_2;

//Objeto Time1 utilizado em um aplicativo
public class TimeTest {
     public static void main(String[] args) {
        
        Time1 time = new Time1(); // invoca o construtor Time1 padrao

        // gera saida de representacoes de string da data/hora
        displayTime("Objeto eh criado", time);
        System.out.println();

        //altera a data/hora e gera a saida da adata/hora atualizada
        time.setTime(13,27, 6);
        displayTime("Apos alteracao: ", time);
        System.out.println();

        //tenta definir a hora com valores invalidos
        // validando se setTime faz a validacao de valroes 
        try{
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException exception){

            System.out.println("Execao: " + exception.getMessage());
            System.out.println();
        }

        displayTime("Data apos tentativa de valores invalidos: ", time);
     }


     private static void displayTime(String CABECALHO, Time1 t){

        System.out.printf("%s%n Padrao Universal:  %s%n Horario Padrao: %s%n", CABECALHO, t.toUniversalString(), t.toString());

     }
}
