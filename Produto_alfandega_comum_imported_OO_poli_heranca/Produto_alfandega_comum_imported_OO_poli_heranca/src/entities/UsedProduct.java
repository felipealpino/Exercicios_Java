package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufacturedDate;

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}


	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}


	@Override
	public String priceTag() {
		return this.name+
				" (used) $ "+
				String.format("%.2f", this.price)+
				" (Manufacture date: "+
				sdf.format(this.manufacturedDate)+
				")";
	}
	
	
	
	
	
	
	
	
	
}
