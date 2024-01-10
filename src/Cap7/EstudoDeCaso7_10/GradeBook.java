package Cap7.EstudoDeCaso7_10;
// Classe GradeBook para representar um livro de notas.
public class GradeBook {
    
    // Variáveis de instância para o nome do curso e o array de notas
    private String courseName;
    private int[] grade;

    // Construtor que recebe o nome do curso e um array de notas
    public GradeBook(String courseName, int[] grade){
        this.courseName = courseName;
        this.grade = grade;
    }

    // Método que recebe o nome do curso como parâmetro e atribui o valor ao atributo courseName
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    // Método que retorna o nome do curso
    public String getCourseName(){
        return courseName;
    }

    // Método que processa as notas: imprime as notas, a nota mais baixa, a nota mais alta e a média
    public void processGrade(){

        // Imprime as notas
        OutPutGrades();

        // Imprime a nota mais baixa e a nota mais alta
        System.out.printf("A nota mais baixa é %d%nA nota mais alta é %d%n%n", getMinium(), getMaximum());

        // Imprime a média das notas
        System.out.printf("A média da classe é %d%n%n", getAvarege());

        // Imprime o gráfico de barras das notas
        OutPutBarChart();
    }

    // Método que retorna a menor nota do array
    public int getMinium(){

        // Inicializa a menor nota com a primeira nota do array
        int lowGrade = grade[0];

        // Itera sobre o array de notas
        for (int i : grade) {
            // Se a nota atual é menor que a menor nota, atualiza a menor nota
            if (i < lowGrade){
                lowGrade = i;
            }
        }

        // Retorna a menor nota
        return lowGrade;
    }

    // Método que retorna a maior nota do array
    public int getMaximum(){

        // Inicializa a maior nota com a primeira nota do array
        int highGrade = grade[0];

        // Itera sobre o array de notas
        for (int i : grade) {
            // Se a nota atual é maior que a maior nota, atualiza a maior nota
            if (i > highGrade){
                highGrade = i;
            }
        }

        // Retorna a maior nota
        return highGrade;
    }

    // Método que retorna a média das notas do array
    public int getAvarege(){

        // Inicializa o total das notas com 0
        int total=0;

        // Itera sobre o array de notas
        for (int i : grade) {
            // Adiciona a nota atual ao total
            total +=  i;
        }

        // Retorna a média das notas
        return total / grade.length;
    }

    // Método que imprime o gráfico de barras das notas
    public void OutPutBarChart(){

        // Imprime a distribuição das notas
        System.out.println("Distribuicao da Grade:");

        // Inicializa o array de frequências com 11 elementos
        int [] frequencia = new int[11];

        // Itera sobre o array de notas
        for (int nota : grade) {
            // Incrementa a frequência da nota atual
            ++frequencia[nota/10];
        }

        // Itera sobre o array de frequências
        for (int i = 0; i < frequencia.length; i++) {

            // Se i é igual a 10, imprime 100, caso contrário, imprime o intervalo de notas
            if (i == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            // Para cada frequência de nota, imprime um asterisco
            for (int j = 0; j < frequencia[i]; j++) {
                System.out.print("*");
            }

            // Imprime uma nova linha
            System.out.println();
        }
    }

    // Método para imprimir as notas de cada aluno
    public void OutPutGrades(){

        // Itera sobre o array de notas
        for (int i =0; i < grade.length; i++){
            // Imprime o número do aluno e a nota correspondente
            System.out.printf("Student %2d: %3d%n", i + 1, grade[i]);
        }
    }
}
