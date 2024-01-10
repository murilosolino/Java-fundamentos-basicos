package Cap4; //4.4 Student.java


// Classe Student que armazena o nome e a media do aluno
public class Student {

    //Variaveis de instancia
    private String name;
    private double average;

    // Construtor que inicializa as variaveis de instancia
    public Student (String name, double average){
        this.name = name;

        //inicia average somente se for um numero entre 0.0 e 100.0
        // se nao a mantem com o valor padrao 0.0
        if (average >0.0 && average <=100.0){
            this.average = average;
        }   
    }

    // recupera o nome de Student
    public String getName (){
        return name;
    }

    // define o nome de Student
    public void setName(){
       this.name = name;
    }

    // recupera a average
    public double getAverage(){
        return average;
    }

    //define a average
    public void setAvarage(){
        
        // Para definicao ser valida o valor deve ser entre 0.0 e 100.0
        if (average >0.0 && average <=100.0){
            this.average = average; // atribui o valor a variavel de instancia
        }   
    }


    // Metodo que define a nota em comparacao com a media.
    public String getLetterGrade(){
        String getLetter = ""; // inicializa a String como Vazia.

        if (average >= 90){
            getLetter = "A";
        } else if (average >= 80){
            getLetter = "B";
        }else if (average >= 70){
            getLetter = "C";
        }else if (average >= 60){
            getLetter = "D";
        } else {
            getLetter = "F";
        }   

        return getLetter; 
    }

}// fim da classe Student
