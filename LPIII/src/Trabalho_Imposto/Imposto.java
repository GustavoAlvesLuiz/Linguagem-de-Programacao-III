package Trabalho_Imposto;

public class Imposto {
	private String nome;
	private double taxa;
	
	public Imposto(String nome, double taxa) {
		this.nome = nome;
		this.taxa = taxa;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
}
