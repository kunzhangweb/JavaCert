package oca.cert.com;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class DatesAndTime {

	public static void main(String[] args) {
		// local date and time
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		// create data and time objects
		System.out.println("New Objects--------------------");
		LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);
		LocalDate date2 = LocalDate.of(2020, 4, 10);
		System.out.println(date1);
		System.out.println(date2);
		// time 
		LocalTime time1 = LocalTime.of(6, 15);		// hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30);	//  + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);	//  + nanoseconds
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		// combination
		LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.APRIL, 10, 6, 15, 30, 200);	
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);	
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
		// Manipulating Dates and Times
		System.out.println("Manipulating --------------------");
		LocalDate date = LocalDate.of(2014, 1, 20);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.minusDays(3);
		System.out.println(date);
		// ignore the result
		date.plusDays(5);
		System.out.println(date);
		
		// working with period
		System.out.println("period --------------------");
		LocalDate start = LocalDate.of(2015, 1, 1);
		LocalDate end = LocalDate.of(2015, 3, 30);
		performAnimalEnrichment(start, end);
		Period everyOtherDay = Period.ofDays(2);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period quarterly = Period.ofMonths(3);
		Period annually = Period.ofYears(1);
		Period everyYearAndWeek = Period.of(1, 0, 7);
		System.out.println(annually + " " + quarterly + " " + everyThreeWeeks + everyOtherDay);
		System.out.println(everyYearAndWeek);
		
		// Formatting Dates and Times
		DateTimeFormatter shortDateTime = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(date));
		DateTimeFormatter mediumDateTime = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(mediumDateTime.format(date));
	}	// end main
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("Give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
			
		}
	}	// end method
}
