import fastFood.FastFoodCorner;
import fastFood.Snack;


import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FastFoodCorner shop1 =new FastFoodCorner("Margao");
		
		ArrayList<String> odr=new ArrayList<>()
		{	{	add("vaddaPav");
		        add("Shawarma");
		        add("momos");
			}
		};
		
		ArrayList <Snack> snacks=shop1.order(odr);
		for (Snack s: snacks )
		{if(s!=null) 
		 {
			  System.out.printf(s.getSnackName());
			  s.beingEaten();
		 }
		}
		System.out.println("Your bill is Rs "+shop1.generatebill(snacks));
		System.out.println("Thank you visit again");
    }

	
	
}
