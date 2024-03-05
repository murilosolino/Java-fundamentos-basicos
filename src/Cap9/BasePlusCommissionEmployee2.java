package Cap9;
//Membros private da superclasse BasePlusCommissionEmployee nao sao acessiveis
public class BasePlusCommissionEmployee2 extends ComissionEmployee {
    
    private double baseSalary; // salario base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee2(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        
        // chamada explicita para o construtor CommissionEmployee da superclasse
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        // se baseSalary e invalido, lanca uma excecao
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // configura o salario-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // retorna o salario-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override
    public double earnings() {
        
        return getBaseSalary() + super.earnings();// super faz referencia ao metodo da superclass
    }

    // retorna a representacao String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
       
        return String.format(
                "%s  %s%n%s: %.2f",
                "base-salaried commission employee", super.toString(),
                "base salary", getBaseSalary());
    }
}
