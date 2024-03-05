package Cap8.Secao8_5;
//construtores sobrecarregados utilizados para inicializar objetos Time2
public class TimeTest2 {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21,34, 0);
        Time2 t4  = new Time2(12,25,42);
        Time2 t5 = new Time2(t4);

        System.out.println("Construidos com:");
        displayTime("t1: todos os argumentos padrão", t1);
        displayTime("t2: hora especificada; minuto e segundo padrão", t2);
        displayTime("t3: hora e minuto especificados; segundo padrão", t3);
        displayTime("t4: hora, minuto e segundo especificados", t4);
        displayTime("t5: objeto Time2 especificado", t5);

        // tenta inicializar t6 com valores inválidos
        try{
            Time2 t6 = new Time2(99,88,99);
        } catch(IllegalArgumentException e){
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }

    }

    // exibe um objeto Time2 nos formatos de 24 horas e 12 horas
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}
