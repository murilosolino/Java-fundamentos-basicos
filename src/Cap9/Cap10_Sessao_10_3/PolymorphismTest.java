package Cap9.Cap10_Sessao_10_3;
import Cap9.BasePlusCommissionEmployee;
import Cap9.BasePlusCommissionEmployee2;
import Cap9.ComissionEmployee;
// Atribuindo referencias de superclasse e subclasse a variáveis de superclasse e subclasse
public class PolymorphismTest { 
    public static void main(String[] args) {
        
        //atribui uma referência de superclasse à variável de superclasse
        ComissionEmployee comissionEmployee = new ComissionEmployee("Sue",
         "Jones", "222-22-2222", 10000, .06);

        //atribui uma referência de subclasse à variável de subclasse
        BasePlusCommissionEmployee2 basePlusCommissionEmployee = new BasePlusCommissionEmployee2("Bob",
         "Lewis", "333-33-3333", 5000, .04, 300);

        //invoca toString no objeto de superclasse utilizando a variável de superclasse
        System.out.printf("%s %s:%n%n%s%n%n", "Chama ComissionEmployee's toString com referencia de superclasse",
         "para objeto superclasse", comissionEmployee.toString());

        //invoca toString no objeto de subclasse utilizando a variável de subclasse
        System.out.printf("%s %s:%n%n%s%n%n", "Chama BasePlusComissionEmployee's toString com referencia de subclasse",
        "para objeto subclasse", basePlusCommissionEmployee.toString());

        //invoca toString no objeto de subclasse utilizando a variável de superclasse
         ComissionEmployee comissionEmployee2 = basePlusCommissionEmployee;
         System.out.printf("%s %s:%n%n%s%n%n", "Chama BasePlusComissionEmployee's toString com referencia de superclasse",
     "para objeto subclasse", comissionEmployee2.toString());


    }


}

