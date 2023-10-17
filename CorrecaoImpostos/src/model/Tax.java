package model;

public class Tax {
	private String name, abbr;
	private double aliquot;
	
	public Tax(String abbr, String name, double aliquot) {
		this.abbr = abbr;
		this.name = name;
		setAliquot(aliquot);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(!(obj instanceof Tax))
			return false;
		//Cast
		Tax tax = (Tax)obj;
		
		return this.abbr.equals(tax.abbr);
	}

	public double calculate(Product p) {
		double taxValue = p.getCostPrice() * aliquot;
		return taxValue;
	}
	
	
	
	private void setAliquot(double aliquot) {
		this.aliquot = aliquot/100;
	}
	
	
}
