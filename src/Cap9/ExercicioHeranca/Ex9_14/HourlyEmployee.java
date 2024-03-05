package Cap9.ExercicioHeranca.Ex9_14;

public class HourlyEmployee extends Employee2 {
        
    private double wage;
    private double hours;

    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber,
    double wage, double hours){

        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0){
            throw new IllegalArgumentException("Wage nao recebe valor negativo");
        }

        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours deve estar entre 0 e 168");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage(){
        return wage;
    }

    public void setWage(double wage){
        this.wage =wage;
    }

    public double getHours(){
        return hours;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public double earnings(){
        return getHours() * getWage();
    }

    //metodos toString
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f", "Hourly Employee", super.toString(),
         "Wage", getWage(), "Hours", getHours());
    }

}
