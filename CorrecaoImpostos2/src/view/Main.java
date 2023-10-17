package view;

import model.ICMS;
import model.IPI;
import model.ISS;
import model.Product;
import model.Tax;

public class Main {

	public static void main(String[] args) throws Exception {
		Product arroz = new Product("Arroz Pileco", 100, 30);
		arroz.setIndustrial(true);
		arroz.setForeing(true);
		
		Tax ipi = new IPI();
		Tax icms = new ICMS();
		arroz.addTax(ipi);
		arroz.addTax(icms);
		
		System.out.println(arroz.getName() + " R$: " + arroz.calculateSalePrice());
		
		Product estratoTomate = new Product("Estrato Heinz", 100, 20);
		estratoTomate.setIndustrial(true);
		estratoTomate.setForeing(true);
		
		Tax ipiTomate = new IPI();
		estratoTomate.addTax(ipiTomate);
		
		System.out.println(estratoTomate.getName() + " R$: " + estratoTomate.calculateSalePrice());
		
		Product servico = new Product("Serviço 1", 100, 50);
		Tax iss = new ISS();
		Tax icmss = new ICMS();
		servico.addTax(iss);
		servico.addTax(icmss);
		System.out.println(servico.getName() + " R$: " + servico.calculateSalePrice());
		
	}
}