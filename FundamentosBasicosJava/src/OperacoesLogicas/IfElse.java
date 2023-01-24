package OperacoesLogicas;

public class IfElse {

	public static void main(String[] args) {
		int mediaAluno = 50;
		String nome = "Murilo";

		/* Condições com IF e ELSE */

		if (mediaAluno >= 70 && nome.equals(nome)) {
			System.out.println("Aluno Aprovado" + " " + "NOTA = " + mediaAluno);
		} else if (mediaAluno < 70) {
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Aluno não encontrado");
		}

		/* Operadores ternários são para micro validações */

		String saidaResultado;

		saidaResultado = mediaAluno >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";

		System.out.println(saidaResultado);

	}
}
