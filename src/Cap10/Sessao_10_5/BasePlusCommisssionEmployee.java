package Cap10.Sessao_10_5;
// classe BasePlusCommisssionEmployee estende CommissionEmployee
public class BasePlusCommisssionEmployee extends CommissionEmployee{
    
    private double baseSalary; // salario base por semana

    // construtor
    public BasePlusCommisssionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salario base deve ser >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    //metodo set e get para baseSalary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salario base deve ser >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //Calcula os ganhos; sobrescreve o método earnings em CommissionEmployee
    @Override   
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação de string de BasePlusCommisssionEmployee
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f", 
            "Empregado com salário base", 
            super.toString(), 
            "Salário base", 
            getBaseSalary());
    }

}
