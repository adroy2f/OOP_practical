package fastFood;

import java.util.ArrayList;

public class FastFoodCorner {
	private String location ;
	
	public FastFoodCorner(String l)
	{
		this.location=l;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Snack> order(ArrayList<String> snackType) {
		ArrayList<Snack> snacks=new ArrayList<>();
		for (String s: snackType)
		{switch(s)
		 {
			case "vaddaPav": 
				snacks.add(new VaddaPav());
				break;
			case "Shawarma": 
				snacks.add(new Shawarma());
				break;
			case "Cheese Ball":
				snacks.add(new CheeseBall());
				break;
			case "Samossa":
				snacks.add(new Samossa());
				break;
			case "Prawn Pattis":
				snacks.add(new PrawnPattis());
				break;
			case "Panner Pizza":
				snacks.add(new PannerPizza());
				break;
			case "Omlette Pav":
				snacks.add(new OmlettePav());
				break;
			case "French Fries":
				snacks.add(new FrenchFries());
				break;
			case "Fish Roll":
				snacks.add(new FishRoll());
				break;
			case "Fish Cuttlet":
				snacks.add(new FishCuttlet());
				break;
			case "Chutney Sandwich":
				snacks.add(new ChutneySandwich());
				break;
			case "Chicken Pizza":
				snacks.add(new ChickenPizza());
			case "Chicken Burger":
				snacks.add(new ChickenBurger());
				break;
			default:
				System.out.println(s+" Not available");
				
		 }
		}
		return snacks;
	}
	
	

	public String generatebill(ArrayList<Snack> snacks) {
		Integer amount=0;
		for(Snack s : snacks)
		{amount+=s.getSnackPrice();}
		return amount.toString();
	}
}
