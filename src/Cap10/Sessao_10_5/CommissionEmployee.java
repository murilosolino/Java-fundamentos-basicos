package Cap10.Sessao_10_5;
// classe CommissionEmployee estende Employee
public class CommissionEmployee extends Employee{

    private double grossSales = 0.0; // vendas semanais
    private double commissionRate = 0.0; // porcentagem da comissão

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve ser > 0.0 e < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }   

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve ser > 0.0 e < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
public String toString(){
        return String.format("%s: %s%n%s: %,.2f%n%s: %.2f", 
        "Empregado por comissão", 
        super.toString(), 
        "Vendas brutas", getGrossSales(), 
        "Taxa de comissão", getCommissionRate());
}

    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    
}
