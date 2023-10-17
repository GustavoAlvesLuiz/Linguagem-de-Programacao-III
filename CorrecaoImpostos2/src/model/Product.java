package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double profit, costPrice;
	private boolean foreing;
	private boolean industrial;
	private List<Tax> taxes;
	
	public Product(String name, double costPrice, double profit) throws Exception {
		this.foreing = false;
		this.industrial = false;
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		this.taxes = new ArrayList<>();
	}
	
	public void setIndustrial(boolean industrial) {
		this.industrial = industrial;
	}

	public boolean isIndustrial() {
		return this.industrial;
	}

	public void setForeing(boolean foreing) {
		this.foreing = foreing;
	}

	public boolean isForeing() {
		return this.foreing;
	}

	public boolean addTax(Tax tax) throws Exception{
		if(tax == null)
			throw new Exception("Imposto não pode ser nulo");
		if(taxes.contains(tax))
			return false;
		else {
			tax.defineAliquot(this);
			taxes.add(tax);
		}
		
		return true;
	}
	
	public double calculateSalePrice() {
		//Calcular os impostos
		double taxesSum =0;
		for(Tax tax : taxes) {
			taxesSum += tax.calculate(this);
		}
		
		double finalCost = this.costPrice + taxesSum;
		
		//Calcular o valor final
		double finalPrice = finalCost+(finalCost * profit);
		return finalPrice;
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected double getProfit() {
		return this.profit;
	}

	private void setProfit(double profit) throws Exception {
		if(profit <=0)
			throw new Exception("Margem de lucro está inválida");
		

		this.profit = profit/100;
	}

	
	private void setCostPrice(double costPrice) throws Exception {
		if(costPrice<=0)
			throw new Exception("Preço de custo está inválido");
		
		this.costPrice = costPrice;	
	}

	private void setName(String name) throws Exception {
		if(name == null || name.equals("")) 
			throw new Exception ("Nome inválido");
		
		this.name = name;
	}
	
	
}
