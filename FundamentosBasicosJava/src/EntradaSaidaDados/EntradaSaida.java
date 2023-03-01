package EntradaSaidaDados;

import javax.swing.JOptionPane;

public class EntradaSaida {
	public static void main(String[] args) {
		/*
		 * JOptionPane.showInputDialog maneira de ENTRADA de dados via java desktop,
		 * diferentemente do Scanner que faz a ENTRADA no console..
		 */
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

		/* Convertendo String para Double */

		double carroNumero = Double.parseDouble(carro);
		double pessoaNumero = Double.parseDouble(pessoa);

		/* conversão para int */
		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		/* CAIXA DE CONFIRMAÇÃO */
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resulatdo da divisão?");

		if (resposta == 0) {
			/*
			 * JOptionPane.showMessageDialo maneira de SAÍDA de dados via java desktop,
			 * diferentemente do Scanner que faz a SAÍDA no console.
			 */
			JOptionPane.showMessageDialog(null,
					"Divisão para pessoas deu " + divisao);
		}
		 resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		 
		 if (resposta == 0) {
			 JOptionPane.showMessageDialog(null,
						"carros e sobraram " + resto + " carros.");
		 }
	}
}
