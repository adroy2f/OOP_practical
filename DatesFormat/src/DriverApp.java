import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utilities.DataBaseUtility;
import utilities.DateProcessor;

public class DriverApp {

	public static void main(String[] args) {
		ArrayList<Date> dateObjs=DateProcessor.readDateObjs("./inputDateFile.txt");
		ArrayList<String> dates=DateProcessor.readStringDates("./inputDateFile.txt");
		for(String d : dates)
			System.out.println("# "+d);
		DateProcessor.writeDates(dateObjs, "./outputDateFile.txt");
		
		String url="jdbc:sqlite:./laptopsdb.sqlite";
//		DataBaseUtility.getData(url, "Laptops");
		DataBaseUtility.storeData(url,dates,"BirthDates");
//		DataBaseUtility.getData(url, "BirthDates");
	}
	
}
