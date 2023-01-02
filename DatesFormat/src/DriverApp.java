import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utilities.DateProcessor;

public class DriverApp {

	public static void main(String[] args) {
		ArrayList<Date> dates=DateProcessor.readDates("./inputDateFile.txt");
//		for(Date d : dates)
//			System.out.println("# "+d);
		DateProcessor.writeDates(dates, "./outputDateFile.txt");
	}

}
