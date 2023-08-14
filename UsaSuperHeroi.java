package fiap;

import javax.swing.JOptionPane;

public class UsaSuperHeroi {

	public static void main(String[] args) {
		SuperHeroi super1;
		String aux, escolha = "sim", nome, idSecreta;
		String[] poderes, fraquezas;
		int qtde;
		while(escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Nome do herói");
				idSecreta = JOptionPane.showInputDialog("Identidade secreta");
				aux = JOptionPane.showInputDialog("Quantidade de poderes");
				qtde = Integer.parseInt(aux);
				poderes = new String[qtde];
				for (int i = 0; i < poderes.length; i++) {
					poderes[i] = JOptionPane.showInputDialog("Poder " + (i + 1));				
				}
				aux = JOptionPane.showInputDialog("Quantidade de fraquezas");
				qtde = Integer.parseInt(aux);
				fraquezas = new String[qtde];
				for (int i = 0; i < fraquezas.length; i++) {
					fraquezas[i] = JOptionPane.showInputDialog("Fraqueza " + (i + 1));				
				}
				super1 = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
				super1.listaHeroi();
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de Programa. Até breve!");
	}

}
