package model;

public abstract class Tax {
	private String name, abbr;
	private double aliquot;
	
	public Tax(String abbr, String name) {
		this.abbr = abbr;
		this.name = name;
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
	
	protected double getAliquot() {
		return this.aliquot;
	}

	protected abstract double calculate(Product p); 
		
	protected void setAliquot(double aliquot) {
		this.aliquot = aliquot/100;
	}
	
	protected abstract void defineAliquot(Product p);
	
	
}
