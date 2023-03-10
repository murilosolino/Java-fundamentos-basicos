package POO.Pessoa;

/* Uso de setters e getters com entrada de dados via teclado*/
public class Pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String dadosUsuario() {
		return "Nome: " + nome + "Idade: " + idade;
	}
}
