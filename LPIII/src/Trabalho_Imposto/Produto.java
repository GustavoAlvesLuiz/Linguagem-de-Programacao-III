package Trabalho_Imposto;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private double precoCusto, precoVenda, margemLucro;
	List<Imposto> listImposto = new ArrayList<>();
	
	public Produto(String nome, double precoCusto, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
	}
	
	public void calculaPrecoVenda() {
		 double totalTaxas = 0.0;
	        for (Imposto imposto : listImposto) {
	            totalTaxas += imposto.getTaxa();
	        }
	        double valorTaxas = precoCusto * totalTaxas;
	        precoVenda = precoCusto + valorTaxas + (precoCusto + valorTaxas) * margemLucro;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public void VisualizarDados() {
		System.out.println("Produto: "+getNome());
		System.out.print("Impostos: ");
		for (Imposto imposto : listImposto) {
			System.out.print(imposto.getNome()+"; ");
		}
		System.out.println();
		System.out.println("Margem de Lucro: "+ (getMargemLucro() * 100) + "%");
		System.out.println("Preço de Custo: R$ "+getPrecoCusto());
		System.out.printf("Preço de Venda: R$ %.2f\n",getPrecoVenda());
		System.out.println("------------------------------------------------------------------");
	}
	
}
