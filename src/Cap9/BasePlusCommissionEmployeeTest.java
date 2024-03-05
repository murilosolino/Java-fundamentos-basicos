package Cap9;
//Programa de teste para a classe BasePlusCommissionEmployee
public class BasePlusCommissionEmployeeTest { 
    public static void main(String[] args) {
        // instancia um objeto BasePlusCommissionEmployee
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333",
             5000, .04, 300);

        //obtem dados do empregado comissionado com salario base
        System.out.println(
            "Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is",
            employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is",
            employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is",
            employee.getSocialSecurityNumber());    
        System.out.printf("%s %.2f\n", "Gross sales is",
            employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is",
            employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is",
            employee.getBaseSalary());

        employee.setBaseSalary(1000); //configura o salario base

        System.out.printf("\n%s:\n\n%s\n",
            "Updated employee information obtained by toString", employee);

        System.out.println("----------------------------------------");

        // instancia um objeto BasePlusCommissionEmployee2 utilizando melhor pratica de heranca
        BasePlusCommissionEmployee2 employee2 = new BasePlusCommissionEmployee2(
            "Jeff", "Austin", "232-43-3987",
             7000, .04, 200);

             System.out.println(employee2.toString());

             System.out.println();

             System.out.println(employee2.earnings());
    
             System.out.println(employee2.getClass());
    }
    
}
