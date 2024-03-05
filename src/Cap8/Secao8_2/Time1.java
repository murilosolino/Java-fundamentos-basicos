package Cap8.Secao8_2;

// Declaracao de Classe Time1 mantem a data/hora no formato 24 horas
public class Time1 {

    private int hora; // 0-23
    private int minuto; // 0-59
    private int segundo; // 0-59

    //construto padrao
    public Time1(){
        // Cada variável de instância recebe implicitamente o valor int padrão.
    }

    // metodo set Verifica se se hora mantem o padrao de 0-23 
    // e minutos e segundos 0-59, caso nao lanca a Execao
    // caso mantenha o padrao os valores sao atribuidos as variaveis de instancia
    public void setTime(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 ||
                segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("Hora Minuto ou segundo fora do padrao estipulado");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    // converte String no formato de data universal (hh:mm:ss)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // converte String para formato padrao AM ou PM
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

}// fim da classe Time1
