package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DateProcessor {

	public static ArrayList<Date> readDates(String fileName)
	{
		Date d;
		SimpleDateFormat parser= new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Date> dates=new ArrayList<Date>();
		try {
			File fp=new File(fileName);
			Scanner fileScanner=new Scanner(fp);
			while(fileScanner.hasNextLine())
			{
				d=parser.parse(fileScanner.nextLine());
				dates.add(d);
			}
		}
		catch(Exception e){
			System.out.println("Error ocured -- "+ e.getMessage());
		}
		return dates;
	}
	
	public static void writeDates(ArrayList<Date> dates, String fileName)
	{
		SimpleDateFormat formatter= new SimpleDateFormat("MMM dd,yyyy");
		try {
			FileWriter fwrite  = new FileWriter(fileName);
			for(Date d : dates)
			{	String strDate =formatter.format(d);
				fwrite.write(strDate+"\n");
			}
			fwrite.close();
		} 
		catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
}
