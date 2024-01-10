package Cap7.Sessao711;
//Classe GradeBook utilizando um array bidimensional para armazenar notas
public class GradeBook2 {
    //variáveis de instância
    private String courseName; //nome do curso que essa GradeBook representa
    private int[][] grades; //array bidimensional de notas de aluno

    //construtor de dois argumentos inicializa courseName e array de notas
    public GradeBook2(String courseName, int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    //metodo para configurar o nome do curso
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    //metodo para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }

    //realiza varias operações nos dados
    public void processGrades(){
        //gera saída de array de notas
        outputGrades();

        //chama os métodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
            "A nota mais baixa no livro de notas é", getMinimum(),
            "A nota mais alta no livro de notas é", getMaximum());

        //gera a saída de gráfico de distribuição de notas de todas as notas em todos os testes
        outputBarChart();
    }

    //localiza nota mínima
    //metodo getMinimum
    public int getMinimum(){
        //supoe que o primeiro elemento de array de notas é o menor
        int lowGrade = grades[0][0];

        //faz um loop pelas linhas do array de notas
        for (int[] studentGrades : grades){
            //faz um loop pelas colunas da linha atual
            for (int grade : studentGrades){
                //se a nota for menor que lowGrade, atribui essa nota a lowGrade
                if (grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    //localiza nota máxima
    //metodo getMaximum
    public int getMaximum(){
        //supoe que o primeiro elemento de array de notas é o maior
        int highGrade = grades[0][0];

        //faz um loop pelas linhas do array de notas
        for (int[] studentGrades : grades){
            //faz um loop pelas colunas da linha atual
            for (int grade : studentGrades){
                //se a nota for maior que highGrade, atribui essa nota a highGrade
                if (grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    //determina média para o teste

    //metodo getAverage
    public double getAverage(int[] setOfGrades){
        int total = 0;

        //soma notas de um aluno
        for (int grade : setOfGrades){
            total += grade;
        }

        //retorna média de notas
        return (double) total / setOfGrades.length;
    }

    //gera a saída do gráfico de barras para exibir distribuição total de notas
    public void outputBarChart(){
        System.out.println("Distribuição de notas:");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        //para cada nota em GradeBook, incrementa a frequencia apropriada
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                ++frequency[grade / 10];
            }
        }

        //para cada frequencia de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++){
            //gera saída do rótulo de barra ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ",
                    count * 10, count * 10 + 9);
            }

            //imprime a barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //gera a saída do conteúdo do array de notas
    public void outputGrades(){
        System.out.printf("As notas são:%n%n");
        System.out.print("            "); //alinha títulos de coluna

        //cria um título de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++){
            System.out.printf("Teste %d  ", test + 1);
        }

        System.out.println("Média"); //título da coluna de médias do aluno

        //cria linhas/colunas de texto que representam notas de array
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Aluno %2d", student + 1);

            for (int test : grades[student]){ //gera saída de notas do aluno
                System.out.printf("%8d", test);
            }

            //chama o método getAverage para calcular a nota média do aluno;
            //passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
