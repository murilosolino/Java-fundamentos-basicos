package Cap8.Secao8_5;

// Declaração da classe Time2 com construtores sobrecarregados.
public class Time2 {

    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    // construtor sem argumento Time2:
    // inicializa cada variável de instância com zero
    public Time2() {
        this(0, 0, 0);// invoca construtor com 3 argumentos
    }

    // construtor Time2: Hora fornecida, minuto e segundo
    // padronizados como 0
    public Time2(int hour) {
        this(hour, 0, 0); // invoca construtor com 3 argumentos
    }

    // construtor Time2: hora e minuto fornecido, segundo padrinizado como 0.
    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoca contrutor com 3 argumentos
    }

    // construtor Time2: hora, minuto e segundos fornecidos
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hora deve ser entre 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minuto deve ser entre 0-23");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Segundo deve ser entre 0-23");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // Construtor Time2: outro objeto Time2 fornecido
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // get hour value
    public int getHour() {
        return hour;
    }

    // metodo setTime: configura hora, minuto e segundo
    // Configura um novo valor de tempo usando hora universal
    // valida os dados

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hora deve ser entre 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minuto deve ser entre 0-23");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Segundo deve ser entre 0-23");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // set hour value
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hora deve ser entre 0-23");
        }
        this.hour = hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // set minute value
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minuto deve ser entre 0-23");
        }
        this.minute = minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // set second value
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Segundo deve ser entre 0-23");
        }
        this.second = second;
    }

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
