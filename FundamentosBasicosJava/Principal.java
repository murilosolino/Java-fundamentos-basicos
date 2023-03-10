package Exercicio;

public class Principal {
	public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario01 = new Funcionario("Lucas Camboin", 1500);
        
        System.out.println("Dados do Funcionario: \n" + "Nome: " + funcionario01.getNome() + "\nSalario: "
        					+ funcionario01.getSalario());
        
        
       
        //funcionario01.salario=2000; // Erro de compilação, pois o atríbuto salario é um atríbuto privado, só pode ser acessado via métodos getters e setters.
       // funcionario01.bonus=2000 // Erro de compilação, pois o atríbuto bonus é um atríbuto privado, só pode ser acessado via métodos getters e setters.
        
        funcionario01.setaplicarBonus(1000);
        
        System.out.println("Parabens você ganhou um bonus de: " + funcionario01.getBonus());
        
        System.out.println("Novo Salario:" + funcionario01.atualizarSalario());
    }
}
