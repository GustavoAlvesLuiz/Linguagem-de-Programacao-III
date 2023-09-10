package view;

import model.Tax;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product arroz = new Product("Arroz", 7, 20, true);

        Tax IPI = new Tax("IPI", "Imposto Prod. Industrializado", 8);
        Tax ISS = new Tax("ISS", "ISS", 5);
        Tax ICMS = new Tax("ICMS", "ICMS", 5);

        arroz.addTax(ICMS);
        arroz.addTax(ISS);

        double totalPrice = arroz.calculateSalePrice();

        System.out.printf("Preço Total do %s: R$%.2f\n",arroz.getName(), totalPrice);

	}

}