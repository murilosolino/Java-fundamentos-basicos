package variaveis;

public class OperacoesComVariaveis {
	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 40;
		int nota4 = 70;
		
		System.out.println("Soma total =" + (nota1 + nota2 + nota3 + nota4) + "\n");
		System.out.println("Media de Notas = " + (nota1 + nota2 + nota3 + nota4) / 4 + "\n");
		
		/*TIPO DOUBLE DE VARIÁVEIS*/
		
		double nota5 = 90.50;
		double nota6 = 85.66;
		double nota7 = 44.52;
		double nota8 = 79.37;
		
		System.out.println("Soma total =" + (nota5 + nota6 + nota7 + nota8) + "\n");
		System.out.println("Media de Notas = " + (nota5 + nota6 + nota7 + nota8) / 4);
		
		
		/*CHAR REPRESENTA APENAS UMA LETRA*/
		
		char pessoaFisica = 'F';
		char pessoaMasculina = 'M';
		
		System.out.println(pessoaFisica + "\n" + pessoaMasculina);
		
		/*STRING NO JAVA É USADO PARA TEXTO*/
		
		String qualquerTexto = "ASHSAKJSAJKHAJHSAJSBA";
		String nome = "Murilo";
		String cpf = "123.456.789-10";
		
		System.out.println(qualquerTexto + "\n" + nome  + "\n" + cpf);
		
		}
}
