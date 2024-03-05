package Cap9.ExercicioHeranca.Ex9_14;
public class Test {
    public static void main(String[] args) {
        
        CommissionEmployee2 commissionEmployee = new CommissionEmployee2("Sue", "Jones", "222-22-2222",
         10000, .06);

        System.out.println(commissionEmployee.toString());

        System.out.println("Earnings: " + commissionEmployee.earnings());

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "333-33-3333",
         16.75, 40);

         System.out.println(hourlyEmployee.toString());

        System.out.println("Earnings: " + hourlyEmployee.earnings());


    }
}
