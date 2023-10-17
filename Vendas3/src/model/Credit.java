package model;

public class Credit implements Payment {

	private double interest;
	
	public Credit(double interest) {
		this.interest = interest/100;
	}
	
	@Override
	public String description() {
		return "Cartão de crédito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue + (this.interest * saleValue);
		return value;
	}

}
