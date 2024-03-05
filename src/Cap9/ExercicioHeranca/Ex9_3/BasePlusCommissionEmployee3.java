package Cap9.ExercicioHeranca.Ex9_3;

import Cap9.ComissionEmployee;

public class BasePlusCommissionEmployee3 {

    private ComissionEmployee comissionEmployee;
    private double baseSalary; // salario base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee3(ComissionEmployee comissionEmployee, double baseSalary) {
        
        // chamada explicita para o construtor CommissionEmployee da superclasse
        

        // se baseSalary e invalido, lanca uma excecao
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
        this.comissionEmployee = comissionEmployee;
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
    public double earnings() {
        
        return getBaseSalary() + comissionEmployee.earnings();// super faz referencia ao metodo da superclass
    }

    // retorna a representacao String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
       
        return String.format(
                "%s  %s%n%s: %.2f",
                "base-salaried commission employee", comissionEmployee.toString(),
                "base salary", getBaseSalary());
    }

}
