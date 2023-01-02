package practical2;

public class Phone {
	String brand;
	String model;
	Integer ram;
	Integer storage;
	String os;
	Double rating;
	
	void showRatings()
	{
		System.out.println(this.rating);
	}
	
	void displayDetails()
	{
		System.out.println("This is "+this.brand+" "+this.model+" with "+this.ram+"gb ram and "+this.storage+"gb storage space");
	}
}
