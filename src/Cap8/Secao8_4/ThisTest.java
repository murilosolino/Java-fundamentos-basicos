package Cap8.Secao8_4;

//this utilizado implicitamente e explicitamente para referenciar membros de um objeto corrente
public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

//classe SimpleTime demonstra o uso implicito e explicito de 'this' para referenciar membros de um objeto corrente
class SimpleTime {
    private int hour; //0-23
    private int minute; //0-59
    private int second; //0-59

    //se o construtor utilizar nomes de parametros identicos aos nomes de variaveis de instancia
    //a palavra-chave 'this' e necessaria para distinguir entre os nomes
    // this se refere a variavel de instancia 
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour; //configura a hora do objeto 'this'
        this.minute = minute; //configura o minuto do objeto 'this'
        this.second = second; //configura o segundo do objeto 'this'
    }

    //utiliza explicitamente 'this' para chamar o metodo toUniversalString
    public String buildString() {
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    //converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        //this nao e requerido aqui para acessar variaveis de instancia, porque o metodo nao tem variaveis locais
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}