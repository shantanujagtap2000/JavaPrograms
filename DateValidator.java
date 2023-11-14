package codingQue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
public static void main(String[] args) {
	String date = "32-02-2023";
	String pattern = "dd-MM-yyyy";

DateTimeFormatter df= DateTimeFormatter.ofPattern(pattern);
try
	{

		LocalDate lc = LocalDate.parse(date, df);
		System.out.println("valid date");
	}catch(DateTimeParseException e)
	{
		System.out.println("invalid date");
	}


}

}