package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double costPrice;
	private double profit;
	private boolean isnational;
	private boolean industrialized = false;
	private List<Tax> taxes;
	
	public Product(String name, double costPrice, double profit, boolean isnational) throws Exception {
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		this.isnational = isnational;
		this.taxes = new ArrayList<>();
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addTax(Tax tax) throws Exception{
		
		if(tax == null) {
			throw new Exception("Imposto não pode ser nulo.");
		}
		
		if(taxes.contains(tax)) {
			return false;
		}else {
			if(tax.getAbbr().equals("IPI"))
				industrialized = true;
			taxes.add(tax);
		}
		
		return true;
	}
	
	public double calculateSalePrice() {
		double taxesSum = 0;
		
		for(Tax tax : taxes) {
			taxesSum += tax.calculate(this);
		}
		
		double finalCost = costPrice + taxesSum;
		
		double finalPrice = finalCost + (finalCost * profit);
		
		return finalPrice;
	}

	private void setProfit(double profit) throws Exception{
		if(profit <= 0) {
			throw new Exception("Margem está inválida.");
		}
		this.profit = profit / 100;
	}

	private void setCostPrice(double costPrice) throws Exception{
		if(costPrice <= 0) {
			throw new Exception("Preço de custo inválido.");
		}
		this.costPrice = costPrice;
	}

	private void setName(String name) throws Exception {
		if(name == null || name.equals("")) {
			throw new Exception("Nome inválido.");
		}
		this.name = name;
	}

	public boolean getIsnational() {
		return this.isnational;
	}

	public boolean getIndustrialized() {
		return this.industrialized;
	}

	public double getProfit() {
		return this.profit;
	}
	
	
	
}