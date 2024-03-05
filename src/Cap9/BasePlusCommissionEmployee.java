package Cap9;
//Classe reoresenta um empregado que recebe um salario base alem da comissao.

public class BasePlusCommissionEmployee {// extende implicitamente Object

        // variaveis de instancia 
        //declaradas como final pois depois que inicializadas nao podem ser alteradas
        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;
        private double grossSales;
        private double commissionRate;
        private double baseSalary;
        
        // construtor com 6 argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
        double grossSales, double commissionRate, double baseSalary){

            // a chamada implicita ao construtor padrao de Object ocorre aqui

            // verifica se o vavlor de grossSales eh valido
            if (grossSales <0.0){
                throw new IllegalArgumentException("Nao eh permitido grossSales em valores negativos");
            }

            //verifica se o valor de commissionRate eh valido
            if (commissionRate <=0.0 || commissionRate >= 1.0){
                throw new IllegalArgumentException(
                    "CommissionRate deve estar entre um falor maior igual a 0.1 e menor igual a 1.0");
            }

            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
            this.baseSalary = baseSalary;
        }

        //retorna o nome
        public String getFirstName(){
            return firstName;
        }

        //retona o sobrenome
        public String getLastName(){
            return lastName;
        }

        // retorna o numero do seguro social
        public String getSocialSecurityNumber(){
            return socialSecurityNumber;
        }

        // configura a quantidade de vendas brutas
        public void setGrossSales(double grossSales){
            if (grossSales < 0.0) {
                throw new IllegalArgumentException("Nao eh permitido grossSales em valores negativos");
            }

            this.grossSales = grossSales;

        }

        //retorna vendas brutas
        public double getGrossSales(){
            return grossSales;
        }

        // configura a comissao
        public void setCommissionRate(double comissionRate){
            if (commissionRate <=0.0 || comissionRate >=1.0){
                throw new IllegalArgumentException(
                    "CommissionRate deve estar entre um falor maior igual a 0.1 e menor igual a 1.0");
            }

            this.commissionRate = comissionRate;
        }

        //retorna comissao
        public double getCommissionRate(){
            return commissionRate;
        }

        //configura salario base
        public void setBaseSalary(double baseSalary){
            if (grossSales <= 0.0) {
                throw new IllegalArgumentException(
                    "Nao eh permitido Salario em valores negativos ou iguais a zero");
            }

            this.baseSalary = baseSalary;
        }

        //retorna salario base 
        public double getBaseSalary(){
            return baseSalary;
        }

        //calcula os lucros 
        public double earnings(){
            return baseSalary = (grossSales * commissionRate);
        }

        // retorna representacao de Strind da classe
        @Override
        public String toString(){

            return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
        }

}
