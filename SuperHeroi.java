package fiap;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome;
	private String idSecreta;
	private String[] poderes;
	private String[] fraquezas;
	
	public SuperHeroi() {}

	public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public String[] getPoderes() {
		return poderes;
	}

	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}

	public String[] getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(String[] fraquezas) {
		this.fraquezas = fraquezas;
	}
	
	public void listaHeroi() {
		String exibe = "Nome do herói: " + nome + "\n";
		exibe += "Identidade secreta: " + idSecreta + "\n";
		int cont = 1;
		for(String i : poderes) {
			exibe += "Poder " + cont + ": " + i + "\n";
			cont++;
		}
		cont = 1;
		for(String i : fraquezas) {
			exibe += "Fraqueza " + cont + ": " + i + "\n";
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe);
	}
}
