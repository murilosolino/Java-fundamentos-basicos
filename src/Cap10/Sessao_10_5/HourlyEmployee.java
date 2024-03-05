package Cap10.Sessao_10_5;
public class HourlyEmployee extends Employee{

    private double wage; // salario por hora
    private double hours; // horas trabalhadas durante a semana

    // construtor
    public HourlyEmployee(String fname, String lName, String sSN, double wage, double hours){
        //invoca o construtor da superclasse com argumentos
        super(fname, lName, sSN);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Salario por hora deve ser >= 0.0");
        }

        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0.0 e <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    //metodo set e get para wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Salario por hora deve ser >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    //metodo set e get para hours

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0.0 e <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    //metodo toString sobreescrito
@Override
public String toString() {
    return String.format("Empregado horista: %s%n%s: $%,.2f; %s: %.2f", 
        super.toString(), 
        "Salário por hora", getWage(), 
        "Horas trabalhadas", getHours());
}

    //Calcula os ganhos; sobrescreve o método earnings em Employee
    // earnings é abstrato em Employee, portanto, a classe concreta HourlyEmployee deve fornecer uma implementação
    @Override
    public double earnings(){
        if (getHours() <= 40){ // não há horas extras
            return getWage() * getHours();
        }
        else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
}
