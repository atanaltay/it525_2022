package beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;

@Model
public class OrderBean {

	
	List<Product> products;
	
	private int selectedProductId;
	private int amount;
	
	private Product selectedProduct;
	
	private double total;
	
	public OrderBean() {
		

		products = new ArrayList<Product>();
		
		products.add(new Product(1, "iphone", 5000));
		products.add(new Product(2, "laptop", 5000));
		products.add(new Product(3, "mouse", 5000));
	}
	
	public String calculate() {
		
		for (Product product : products) {
			if(selectedProductId==product.getId()) {
				selectedProduct = product;
				break;
			}
		}
		
		total = selectedProduct.getPrice()*amount;
		
		return null;
	}
	
	
	public List<Product> getProducts() {
		return products;
	}

	public int getSelectedProductId() {
		return selectedProductId;
	}

	public void setSelectedProductId(int selectedProductId) {
		this.selectedProductId = selectedProductId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	public double getTotal() {
		return total;
	}
	
}
