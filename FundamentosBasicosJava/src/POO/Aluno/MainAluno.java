package POO.Aluno;
 

public class MainAluno {
	public static void main(String[] args) {
		/* Objeto real na memória*/
		Aluno aluno1 = new Aluno("Maria");
		
		Aluno aluno2 = new Aluno("Pedro", 10);
		
		/*new Aluno(); - é uma instancia (Criação de objeto na memoria) */
		
		/*aluno3 - é uma referencia ao objeto Aluno. Obs: atributos necessitam estar publicos*/
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Luisa";
		aluno3.aniversario = "03/03/2012";
		aluno3.idade = 11;
		
		
	/*================================================================================================*/
		/*metodos getters e setters podem acessar atributos privados*/
		
		Aluno aluno4 = new Aluno();
		/*Stenado os dados do aluno*/
		aluno4.setNome("Miguel");
		aluno4.setIdade(10);;
		aluno4.setAniversario("17/07/2013");
		aluno4.setRegistroGeral("444.444.444-44");
		aluno4.setNumeroCpf("555.555.555-55");
		aluno4.setNomePai("Raul");
		aluno4.setNomeMae("Juliana");
		aluno4.setNomeEscola("Escola ABC");
		aluno4.setSerieMatriculado("6 ano");
		aluno4.setDataMatricula("09/01/2023");
		aluno4.setNota1(9.5);
		aluno4.setNota4(10);
		aluno4.setNota3(8);
		aluno4.setNota2(9);
		
		/*recuperando os dados e imprimindo eles*/
		System.out.println("Nome do aluno: " + aluno4.getNome());
		System.out.println("Idade: " + aluno4.getIdade());
		System.out.println("Aniversário: " + aluno4.getAniversario());
		System.out.println("Data da matricula: " + aluno4.getDataMatricula() + "\n");
		
		System.out.println("Media do aluno: " + aluno4.getMediaNotas());
		
		System.out.println("Resultado: " + (aluno4.getSituacaoAprovamento() ? "Aprovado" : "Reprovado"));
		
		
		
		
	}
}
