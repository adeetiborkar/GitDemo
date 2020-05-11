
import java.time.*;										//Package for date and time
import java.time.format.DateTimeFormatter;				//Package for Date formatter

public class Date_Time
{
	public static void main(String[] args)
	{
		LocalDate myDate = LocalDate.now();					  // Local date class object
		System.out.println("Local Date is :  " +myDate);
		
		LocalTime myTime = LocalTime.now();						// Local time class object
		System.out.println("Local Time is :  " + myTime);
		
		LocalDateTime myDateTime= LocalDateTime.now();			// Local dateTime class object
		System.out.println("Local Date & Time is :  " + myDateTime);
		
		// Class for Date and Time formatter
		
		DateTimeFormatter myFormatter= DateTimeFormatter.ofPattern ("dd/MM/yyyy   HH:mm:ss");
		String formatted =myDateTime.format(myFormatter);
		System.out.println("Formatter Date is :  " + formatted);
	}

}
