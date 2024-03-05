package Cap10.Sessao_10_5;
public class PayrollSystemTest {
    public static void main(String[] args) {
        // cria objetos de subclasse
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith",
         "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
         "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
            "333-33-3333", 10000, .06);

        BasePlusCommisssionEmployee basePlusCommisssionEmployee = new BasePlusCommisssionEmployee("Bob", "Lewis",
            "444-44-4444", 5000, .04, 300);


        // cria um array Employee de quatro elementos
        Employee[] employees = new Employee[4];

        // inicializa o array com Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommisssionEmployee;

        System.out.println("Empregados processados polimorficamente:");
        // processa genericamente cada elemento no array employees

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee.toString()); // invoca toString

            // determina se o elemento é um BasePlusCommisssionEmployee
            if (currentEmployee instanceof BasePlusCommisssionEmployee) {
                // downcast da referência de Employee para BasePlusCommisssionEmployee
                BasePlusCommisssionEmployee employee = (BasePlusCommisssionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("Salario base aumentado em 10%%: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("Ganhos $%,.2f%n%n", currentEmployee.earnings());
        }

        // obtém o nome do tipo de cada objeto no array employees
        for(int i = 0; i < employees.length; i++){
            System.out.printf("Empregado %d é um %s%n", i, employees[i].getClass().getName());
        }

    }
}
