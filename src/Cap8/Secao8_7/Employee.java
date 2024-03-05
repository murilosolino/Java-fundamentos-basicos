package Cap8.Secao8_7;

//calsse employee com referncia a outros objetos
public class Employee {
    
    private String nome; //variavel de instancia que referencia o objeto String
    private String sobrenome; //variavel de instancia que referencia o objeto String
    private Date dataNascimento; // objeto Date
    private Date dataContratacao; // objeto Date

    //construtor para inicializar nome, sobrenome, dataNascimento e dataContratacao
    public Employee (String nome, String sobrenome, Date dataNascimento, Date dataContratacao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
    }

    //converte Employee em formato de String
    public String toString(){
        return String.format("%s %s Contradado: %s Aniversario: %s", nome, sobrenome, dataContratacao, dataNascimento);
    }

}//fim da classe Employee
