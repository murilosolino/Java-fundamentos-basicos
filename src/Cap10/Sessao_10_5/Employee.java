package Cap10.Sessao_10_5;
//Superclasse abstrata Employee.
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor com três argumentos
    // Construtor eh usado apenas nas subclasses concretas
    //como Emplyee é abstrata, não pode ser instanciada
    Employee(String firstname, String lastName, String socialSecurityNumber) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //repete a regra do coonstrutor
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s %s %n social cecurity number: %s", getFirstName(), getLastName(), 
        getSocialSecurityNumber());
    }

    // método abstrato sobrescrito por subclasses concretas
    public abstract double earnings(); // sem implementação aqui
}
