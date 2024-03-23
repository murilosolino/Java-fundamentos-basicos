package Cap16.MetodosColecoes.Sort;

import java.util.Comparator;

import Cap8.Secao8_5.Time2;

// classe comparator personalizada que compara dois objetos Time
public class TimeComparator implements Comparator<Time2>{

    @Override
    public int compare(Time2 time1, Time2 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) {
            return hourDifference; // testa a hora
                            // se as horas nao forem iguais retorna a diferenca 
        }

        int minuteDifference = time1.getMinute()-time2.getMinute();

        if (minuteDifference != 0){
            return minuteDifference; // berifica minuto
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference; // se hora e minuto forem iguais, apenas segundo pode ser diferente
    }
    
}// fim da classe
