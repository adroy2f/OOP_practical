package fastFood;

public abstract class Snack {
	protected String snackName;
	protected Integer price;
	
	public Snack()
	{
		
	}
	
	public String getSnackName() {
		return snackName;
	}
	
	public void beingEaten()
	{
		System.out.println(".... being Eaten");
	}
	
	public Integer getSnackPrice() {
		return price;
	}
	
	public void setSnackPrice(Integer Price) {
		this.price=price;
	}
}
