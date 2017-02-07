package com.lambda.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStreamAPI2 {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("ali1", "ahmet2", "burak1", "cemil2", "cevat1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			// CEMIL2
			// CEVAT1
			
			System.out.println("*******--------------*********");
			IntStream.range(1, 5)
		    			.forEach(System.out::println);

			// 1
			// 2
			// 3
			// 4
			
			System.out.println("*******--------------*********");
			Arrays.stream(new int[] {1, 2, 3})
				    .map(n -> 2 * n + 1)
				    .average()
				    .ifPresent(System.out::println);  // 5.0
			
			System.out.println("*******--------------*********");
			IntStream.range(1, 4)
				    .mapToObj(i -> "Size -> " + i)
				    .forEach(System.out::println);
			// Size -> 1
			// Size -> 2
			// Size -> 3
			
			System.out.println("*******--------------*********");
			
			Stream.of("d2", "a2", "b1", "b3", "c")
				    .filter(s -> {
				        System.out.println("filter: " + s);
				        return true;
				    })
				    .forEach(s -> System.out.println("forEach: " + s));
			// filter: d2
			// forEach: d2
			// filter: a2
			// forEach: a2
			// filter: b1
			// forEach: b1
			// filter: b3
			// forEach: b3
			// filter: c
			// forEach: c
			
			System.out.println("*******--------------*********");
			
	        List<Person> persons = new ArrayList<>();
	        persons.add(new Person(678, "Ann", "Lee", LocalDate.of(2007, Month.APRIL, 12)));
	        persons.add(new Person(123, "Jack", "Johnson", LocalDate.now()));
	        persons.add(new Person(345, "Cindy", "Node", LocalDate.of(2011, Month.DECEMBER, 15)));
	        persons.add(new Person(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
	        persons.add(new Person(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
	        persons.add(new Person(435, "Fred", "Shak", LocalDate.of(1988, Month.APRIL, 17)));
			
	        List<Person> filtered = persons
					        	        .stream()
					        	        .filter(p -> p.getFirstName().startsWith("P"))
					        	        .collect(Collectors.toList());

        	System.out.println(filtered); //  [Perry, Pam]
			
			System.out.println("*******--------------*********");
	        	
	        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(Person::getNumber));

	        personsByAge.forEach((no, p) -> System.out.format("no %s: %s\n", no, p));
			// no 435: [Person [number=435, firstName=Fred, lastName=Shak, date=1988-04-17]]
			// no 467: [Person [number=467, firstName=Pam, lastName=Krauss, date=2005-06-07]]
			// no 678: [Person [number=678, firstName=Ann, lastName=Lee, date=2007-04-12]]
			// no 567: [Person [number=567, firstName=Perry, lastName=Node, date=2005-06-07]]
			// no 345: [Person [number=345, firstName=Cindy, lastName=Node, date=2011-12-15]]
			// no 123: [Person [number=123, firstName=Jack, lastName=Johnson, date=2017-02-07]]
			System.out.println("*******--------------*********");	
			
			IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(Person::getNumber));
			System.out.println(ageSummary);
//			IntSummaryStatistics{count=6, sum=2615, min=123, average=435.833333, max=678}
			
			System.out.println("*******--------------*********");	
			
			String phrase = persons
				    .stream()
				    .filter(p -> p.getNumber() >= 400)
				    .map(p -> p.getFirstName())
				    .collect(Collectors.joining(" ve ", "Num 400 den büyük ", " kişiler var."));

			System.out.println(phrase);
//			Num 400 den büyük Ann ve Perry ve Pam ve Fred kişiler var.
			
			System.out.println("*******--------------*********");	
			
	}

}
