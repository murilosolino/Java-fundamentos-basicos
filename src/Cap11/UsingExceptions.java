package Cap11;
//mecanismo de tratamento de excecao try..catch... finally
// finally eh executado independente de try catch
public class UsingExceptions {
    public static void main(String[] args) {
        try {
            trhowException();
        } catch (Exception e) {
            System.err.println("Excecao capturada em main");
        }
        doesNotThrowException();
    }

    //demonstra try, catch e finally
    public static void trhowException() throws Exception{
        try {
            System.out.println("Meotodo trhowException");
            throw new Exception(); // gera a excecao
            
        } catch (Exception e) { // captura a excecao lancada em try
            // TODO: handle exception

            System.err.println(e); throw e; //lanca novamente para processamento adicional

        }finally{ // executa independentemente do que ocorre me try catch

            System.err.println("Finally executado em throwException");

        }
    }

    //demonstra finally quando nenhuma excecao ocorrer
    public static void doesNotThrowException(){
        try { // bloco try nao lanca excecao
            System.out.println("Metodo doesNotThrowException");
        } catch (Exception e) { // nao executa
            System.err.println(e);
        }finally{ //executa independente se ocorre try catch
            System.out.println("Finally executado em doesNotThrowException");
        }
    }
}//fim da classe
