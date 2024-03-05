package Cap9.ExercicioHeranca.Ex9_14;
public class Employee2 {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee2(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public String toString(){
        return String.format("%s %s\nSocial Security Number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

}
