package Cap15.SerializationApps;
// Classe Account serializavel para armanzenar registros como objetos
import java.io.Serializable;

public class Account  implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account(int account, String firstName, String lastName, double balance) {

        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        
    }

    Account() {
        this(0, "", "", 0.0); // chama outro construtor
    }

    public int getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }    
}// fim da classe Account
