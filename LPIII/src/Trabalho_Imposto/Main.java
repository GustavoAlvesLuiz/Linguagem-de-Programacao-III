package Trabalho_Imposto;

public class Main {

	public static void main(String[] args) {
		Imposto icms = new Imposto("ICMS", 0.07);
		Imposto confins = new Imposto("Confins", 0.12);
		Imposto ipi = new Imposto("IPI", 0.08);
		Imposto iss = new Imposto("ISS", 0.05);
		Imposto cide = new Imposto("Cide", 0.10);
		Imposto csll = new Imposto("CSLL", 0.04);
		
		Produto arroz = new Produto("Arroz", 7.00, 0.20);
	    	arroz.listImposto.add(confins);
	    	arroz.listImposto.add(icms);
	        arroz.listImposto.add(iss);
	        arroz.calculaPrecoVenda();
	        arroz.VisualizarDados();
	        
	    Produto feijão = new Produto("Feijão", 7.00, 0.25);
	    	feijão.listImposto.add(confins);
	    	feijão.listImposto.add(icms);
	        feijão.listImposto.add(iss);
	        feijão.calculaPrecoVenda();
	        feijão.VisualizarDados();
	        
	    Produto carne = new Produto("Carne", 7.00, 0.35);
	    	carne.listImposto.add(confins);
	    	carne.listImposto.add(icms);
	        carne.listImposto.add(ipi);
	        carne.calculaPrecoVenda();
	        carne.VisualizarDados();
	        
	    Produto cerveja = new Produto("Cerveja", 7.00, 0.30);
	    	cerveja.listImposto.add(confins);
	    	cerveja.listImposto.add(icms);
	        cerveja.listImposto.add(iss);
	        cerveja.listImposto.add(ipi);
	        cerveja.calculaPrecoVenda();
	        cerveja.VisualizarDados();
	        
	    Produto gas = new Produto("Gás", 7.00, 0.15);
	    	gas.listImposto.add(confins);
	    	gas.listImposto.add(icms);
	        gas.listImposto.add(ipi);
	        gas.calculaPrecoVenda();
	        gas.VisualizarDados();
	        
	    Produto gasolina = new Produto("Gasolina", 7.00, 0.15);
	    	gasolina.listImposto.add(confins);
	    	gasolina.listImposto.add(icms);
	        gasolina.listImposto.add(cide);
	        gasolina.calculaPrecoVenda();
	        gasolina.VisualizarDados();
	}

}
