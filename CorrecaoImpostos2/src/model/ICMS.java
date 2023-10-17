package model;

public class ICMS extends Tax {

	private static final double INDUSTRIAL_ALIQUOT = 5;
	private static final double NO_INDUSTRIAL_ALIQUOT = 7;
	
	public ICMS() {
		super("ICMS", "Imposto sobre circulação de mercadorias");
	}

	@Override
	protected double calculate(Product p) {
		double icmsCost = p.getCostPrice() * getAliquot();
		return icmsCost;
	}

	@Override
	protected void defineAliquot(Product p) {
		if (p.isIndustrial())
			setAliquot(INDUSTRIAL_ALIQUOT);
		else
			setAliquot(NO_INDUSTRIAL_ALIQUOT);
	}

}
