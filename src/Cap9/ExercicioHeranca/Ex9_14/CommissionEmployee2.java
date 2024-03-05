package Cap9.ExercicioHeranca.Ex9_14;

public class CommissionEmployee2 extends Employee2 {

    private double grossSales; 
    private double commissionRate;

    public CommissionEmployee2 (String firstName, String lastName, String socialSecurityNumber,
    double grossSales, double commissionRate){

           super(firstName, lastName, socialSecurityNumber);
           
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("GrossSales deve ser maior ou igual a 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Comissao deve ser maior que 0.0 ou menor igual a 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    //metodos toString
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f", "Comission Employee", super.toString(),
         "Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate());
    }


}
