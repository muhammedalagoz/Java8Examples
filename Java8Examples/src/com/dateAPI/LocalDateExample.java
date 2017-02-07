package com.dateAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
	public static void main(String[] args) {
		
		LocalDate lDate = LocalDate.of(1988, 07, 16);
//		veya ->
		lDate = LocalDate.of(1988, Month.JULY, 16);

		System.out.println("*******--------------*********");
		LocalDate now = LocalDate.now();
		
		LocalDate editNow = now.withYear(2016);
		System.out.println("Edit Year -> " + editNow);

		System.out.println("*******--------------*********");
		LocalDate editNow2 = now
								.with(ChronoField.YEAR, 2012)
								.with(ChronoField.MONTH_OF_YEAR, 8)
								.with(ChronoField.DAY_OF_MONTH,3);
		System.out.println("Edit Now -> " + editNow2);

		
		System.out.println("*******--------------*********");
		System.out.println("Now -> " + now);
		LocalDate plusNow = now.plusYears(3);
		System.out.println("Plus Year -> " + plusNow);
		LocalDate plusNow2 = now
								.plusWeeks(2)
								.plusDays(3)
								.plusYears(3)
								.plusDays(7);

		System.out.println("Plus Now Date 2 -> " + plusNow2);
		
		LocalDate plusNow3 = now
								.plus(2, ChronoUnit.WEEKS)
								.plus(3, ChronoUnit.YEARS)
								.plus(3, ChronoUnit.DECADES);
		System.out.println("Plus Now Date 3 -> " + plusNow3);
		
		System.out.println("*******--------------*********");
		
		LocalDate minusNow = now
								.minus(2, ChronoUnit.WEEKS)
								.minus(3, ChronoUnit.YEARS)
								.minus(33, ChronoUnit.DAYS);
		System.out.println("minus Now Date -> " + minusNow);
		LocalDate minusNow1 = now.minusDays(5).minusMonths(2);
		System.out.println("minus Now Date 2 -> " + minusNow1);
	}
}
