package Cap4; //  4.5 StudentTest
// Cria e testa objetos Student

public class StudentTest {
    public static void main(String[] args) { // metodo que executa o aplicativo

        //Criando Objetos 
        Student account1 = new Student("Jane Green", 93.5);
        Student account2 =  new Student("John Blue", 72.75);
        
        //chamando os metodos e imprimindo os dados
        System.out.println("nota do aluno " + account1.getName() + " : " + account1.getLetterGrade());
        System.out.println("nota do aluno " + account2.getName() + " : " + account2.getLetterGrade());
    }
}// fim da classe StudentTest