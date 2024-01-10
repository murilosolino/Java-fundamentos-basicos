package Cap7.EstudoDeCaso7_10;

public class GradeBookTest {
    public static void main(String[] args) {

        int [] notas = {65,78,70,83,60,55,95};

        GradeBook gradeBook  = new GradeBook("Java", notas);

        gradeBook.processGrade();


    }
}
