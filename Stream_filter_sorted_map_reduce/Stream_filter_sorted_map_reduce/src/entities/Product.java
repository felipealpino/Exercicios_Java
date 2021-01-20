package entities;

public class Product {

	private String nameProd;
	private Double precoProd;
	
	public Product(String nameProd, Double precoProd) {
		super();
		this.nameProd = nameProd;
		this.precoProd = precoProd;
	}

	public String getNameProd() {
		return nameProd;
	}
	public void setNameProd(String nameProd) {
		this.nameProd = nameProd;
	}

	public Double getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}

	@Override
	public String toString() {
		return nameProd;
	}
	
	
	
	

}
