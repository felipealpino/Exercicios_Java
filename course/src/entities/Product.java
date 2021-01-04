package entities;

public class Product {
	
	public String name; 
	public double price;
	public int quantity;
	
	
	public double TotalValueInStock() {
		return price*quantity;
	}
	
	public void AddProducts(int qt) {
		quantity+=qt;
	}
	
	public void RemoveProducts(int qt) {
		quantity-=qt;
	}
	

}
