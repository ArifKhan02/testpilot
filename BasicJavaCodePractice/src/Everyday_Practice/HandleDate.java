package Everyday_Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


import javax.swing.text.DateFormatter;

public class HandleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String dateString = "10-MAR-2023";

        // Define the formatter for the input format
        //DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);

        // Parse the input date string
       //// LocalDate date = LocalDate.parse(dateString, inputFormatter);

        // Define the formatter for the desired output format
       // DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy", Locale.ENGLISH);

        // Format the date to the desired output format
        //String formattedDate = date.format(outputFormatter);

        // Print the result
        //System.out.println("Original Date: " + dateString);
       //System.out.println("Formatted Date: " + formattedDate);
        
        //Date with Time
       
        //Date ldate=new Date();
        //System.out.println(ldate);
        //Date without time
        
        //LocalDate date1=LocalDate.now();
        //System.out.println(date1);
        
        //LocalDate currentDate = LocalDate.now(); // For date without time
        //LocalDateTime currentDateTime = LocalDateTime.now(); // For date and time

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //String formattedDateTime = currentDateTime.format(formatter);

        //System.out.println(formattedDateTime);
        
        String input_date="04/06/2025";
        
        
        SimpleDateFormat input_format=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat out_format=new SimpleDateFormat("dd-MMM-yyyy");
        
        try {
			Date idate=input_format.parse(input_date);
			String expected_date=out_format.format(idate);
			System.out.println(expected_date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}


}
