package model;

public class Tax {
	private String abbr;
	private String name;
	private double aliquot;
	
	public Tax(String abbr, String name, double aliquot) {
		this.abbr = abbr;
		this.name = name;
		setAliquot(aliquot);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Tax)) {
			return false;
		}
		
		Tax tax = (Tax) obj;
		
		return this.abbr.equals(tax.abbr);
		
	}
	

	public double calculate(Product p) {
		if(this.abbr.equals("IPI")) {
			if(p.getIsnational()) 
				return p.getCostPrice() * 0.08;
			else 
				return p.getCostPrice()*0.1;
		}
		
		if(this.abbr.equals("ICMS")) {
			if(p.getIndustrialized())
				return p.getCostPrice()*0.05;
		else 
			return p.getCostPrice()*0.07;
		
		}
		
		if(this.abbr.equals("ISS")){
			double totalPrice = p.getCostPrice() + (p.getCostPrice() * p.getProfit());
	        return 0.05 * totalPrice;
	       }
		
			return p.getCostPrice() * aliquot;
	}

	
	public void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}

	
	public Object getAbbr() {
		
		return this.abbr;
	}
}