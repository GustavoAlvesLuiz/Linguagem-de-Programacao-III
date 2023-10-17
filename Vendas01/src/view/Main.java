package view;

import model.Product;
import model.Sale;
import model.SaleItem;

public class Main {

	public static void main(String[] args) {
		Product arroz = new Product("Arroz Pileco T1", 15);
		Product feijao = new Product("Feijão Malícia", 20);
		
		SaleItem siArroz = new SaleItem(arroz, 3);
		SaleItem siFeijao = new SaleItem(feijao, 2);
		
		Sale sale = new Sale();
		sale.addSaleItem(siArroz);
		sale.addSaleItem(siFeijao);
		
		System.out.println(String.format("Venda - #1234 - %s", 
				sale.getDate().toLocaleString()));
		
		for (SaleItem saleItem : sale.getSaleItems()) {
			System.out.print(saleItem.getProduct().getDescription() + " - ");
			System.out.print(saleItem.getAmount() + " - ");
			System.out.print("R$"+ saleItem.getProduct().getPrice() + " - ");
			System.out.print("R$"+ saleItem.getSaleItemSubTotal() + "\n");			
		}
		
		System.out.println("Total: R$" + sale.getTotal());
	}
}
