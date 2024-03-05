package Cap8.Secao8_15;

import java.math.BigDecimal;
import java.text.NumberFormat;

//Calculos de juros compostos com BigDecimal
public class Interest {
    public static void main(String[] args) {
        
        BigDecimal principal = BigDecimal.valueOf(1000.0); //valor principal inicial antes dos juros
        BigDecimal rate = BigDecimal.valueOf(0.05); //taxa de juros

        //exibe os cabecalhos
        System.out.printf("%s%20s%n", "Ano", "Valor em deposito");

        //calcula o valor do deposito para cada um dos dez anos
        for(int year = 1; year <= 10; year++){
            //calcula o novo valor para o ano especificado
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            //exibe o ano e o valor
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }


    }
}
