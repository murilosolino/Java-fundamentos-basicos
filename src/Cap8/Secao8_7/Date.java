package Cap8.Secao8_7;

//Declaracao da classe Date
public class Date {

    private int mes; // 1-12
    private int dia; // 1-31 com base no mes
    private int ano; // qualquer ano

    private static final int diaPorMes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int dia, int mes, int ano) {

        // verifica se o dia esta no intervalo
        if (dia <= 0 || (dia > diaPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("Dia especificado fora do intervalo permitido para o mes");
        }

        // verifica se mes esta no intervalo
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("Mes especificado fora do padrao 1-12");
        }

        // verifica se ano esta no intervalo
        if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
            throw new IllegalArgumentException("Ano especificado nao e bissexto");

        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        System.out.printf( "Construtor de objeto Date para data %s%n", this);

    }

    // retorna uma String no formato mes/dia/ano
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }



}// fim da classe Date
