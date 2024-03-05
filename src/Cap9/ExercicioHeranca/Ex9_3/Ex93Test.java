package Cap9.ExercicioHeranca.Ex9_3;

import Cap9.ComissionEmployee;

public class Ex93Test {
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = new ComissionEmployee("Raul","Silva",
         "424-23-2312", 899.0, 0.5);

         BasePlusCommissionEmployee3 employee3 = new 
         BasePlusCommissionEmployee3(comissionEmployee, 2000.0);

         System.out.println(employee3.earnings());

         System.out.println(employee3.toString());
         
    }
}
