package Cap8.Secao8_7;
//Demosntra a composicao de objetos com referencias a outros objetos
public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Joao", "Silva",
                new Date(1, 1, 1990), new Date(1, 1, 2010));

        System.out.println(employee.toString());

    }

}//final da classe EmployeeTest
