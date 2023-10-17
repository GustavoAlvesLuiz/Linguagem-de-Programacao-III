package model;

public class IPI extends Tax {

	private static final double FOREING_ALIQUOT = 10;
	private static final double LOCAL_ALIQUOT = 8;
	
	public IPI() {
		super("IPI", "Imposto sobre produtos Industrializados");
	}
	
	@Override
	public double calculate(Product p) {
		double ipiCost = p.getCostPrice() * this.getAliquot();
		return ipiCost;
	}

	@Override
	public void defineAliquot(Product p) {
		if(p.isForeing())
			setAliquot(FOREING_ALIQUOT);
		else
			setAliquot(LOCAL_ALIQUOT);
	}
}
