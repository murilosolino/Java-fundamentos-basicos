package Cap10.Sessao_10_5;
// A classe concreta SalariedEmployee estende a classe abstrata Employee.
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //conastructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumbeString,
    double weeklySalary){
        super(firstName, lastName, socialSecurityNumbeString);
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Salario semanal deve ser >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //metodo set e get para weeklySalary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Salario semanal deve ser >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    //metodo to String
    @Override
    public String toString(){
        return String.format("Empregado Assalariado: %s %s%n Seguro Social: %s%n Salario Semanal: %f", 
        getFirstName(),getLastName(),getSocialSecurityNumber(),getWeeklySalary());
    }

    //Calcula os ganhos; sobrescreve o método earnings em Employee
    // earnings é abstrato em Employee, portanto, a classe concreta SalariedEmployee deve fornecer uma implementação
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
}
