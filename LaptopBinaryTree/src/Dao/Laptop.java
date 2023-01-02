package Dao;

public class Laptop {
	private String moldel;
	private Double price;
	
	public Laptop(String moldel, Double price) {
		super();
		//System.out.println("in laptop constr");
		this.moldel = moldel;
		this.price = price;
	}

	public String getMoldel() {
		return moldel;
	}

	public void setMoldel(String moldel) {
		this.moldel = moldel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
