package item;

import java.io.Serializable;

public class ShoppingItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productName;
	private int amount;
	private double unitprice;
	
	
	public ShoppingItem() {
		// TODO Auto-generated constructor stub
	}


	public ShoppingItem(String productName, int amount, double unitprice) {
		super();
		this.productName = productName;
		this.amount = amount;
		this.unitprice = unitprice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public double getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	
	@Override
	public String toString() {
		return "ShoppingItem [productName=" + productName + ", amount=" + amount + ", unitprice=" + unitprice + "]";
	}
	
	


}
