package POO.classes;
/*Classe/Objeto que representa o Aluno*/
public class Aluno {
	/*Atributos do Aluno*/
	public String nome;
	public int idade;
	public String aniversario;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula; 
	private String nomeEscola;
	private String serieMatriculado; 
	
	public Aluno() { /*Cria os dados na memoria - Sendo padrão Java*/
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nomePadrao) {
		nomePadrao = nome;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nomePadrao =nome;
		idadePadrao=idade;
	}
	
	/*Metodos SETTERS e GETTERS do Objeto*/
	/*SET para adicionar ou receber dados para os atríbutos*/
	/*GET para resgatar e obter o valor do atributo*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	}
