package model;

public class ISS extends Tax {

	private static final double ALIQUOT = 5;
	
	public ISS() {
		super("ISS", "Imposto Sobre Serviços");
	}

	@Override
	protected double calculate(Product p) {
		double salePrice = ((p.getCostPrice()) + (p.getCostPrice() * p.getProfit())) * getAliquot();
		double iss = salePrice * getAliquot();
		return iss;
	}

	@Override
	protected void defineAliquot(Product p) {
		setAliquot(ALIQUOT);
	}

}
