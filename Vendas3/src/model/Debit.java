package model;

public class Debit implements Payment {

	private double discout;
	
	public Debit(double discout) {
		this.discout = discout/100;
	}
	
	@Override
	public String description() {
		return "Cartão de Débito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (this.discout * saleValue);
		return value;
	}

}
