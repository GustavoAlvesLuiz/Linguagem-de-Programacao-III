package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
	private Date date;
	private List<SaleItem> items;
	
	public Sale() {
		this.date = Calendar.getInstance().getTime();
		this.items = new ArrayList<>();
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public List<String> getSaleItems(){
		List<String> saleitemsString = new ArrayList<>();
		
		for(SaleItem si : this.items) {
			String item = String.format("%s - %d - R$%.2f -  R$%.2f", 
					si.getProduct().getDescription(), si.getAmount(),
					si.getProduct().getPrice(),  si.getSaleItemSubTotal()); 
			
			saleitemsString.add(item);
		}
		return saleitemsString;
	}
	
	public void addItem(String productCode, int amount) {
		SaleItem item = new SaleItem(productCode, amount);
		this.items.add(item);
	}
	
	public double getTotal() {
		double total = 0;
		
		for (SaleItem saleItem : items) {
			total = total + saleItem.getSaleItemSubTotal();
		}
		
		return total;
	}	
}
