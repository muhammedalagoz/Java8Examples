package com.lambda.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(678, "Ann", "Lee", LocalDate.of(2007, Month.APRIL, 12)));
        persons.add(new Person(123, "Jack", "Johnson", LocalDate.now()));
        persons.add(new Person(345, "Cindy", "Node", LocalDate.of(2011, Month.DECEMBER, 15)));
        persons.add(new Person(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
        persons.add(new Person(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
        persons.add(new Person(435, "Fred", "Shak", LocalDate.of(1988, Month.APRIL, 17)));
		
        //****** Sort
        persons.stream()
        		.sorted((e1, e2) -> Integer.compare(e1.getNumber(),e2.getNumber()))
        		.forEach(e -> System.out.println(e));

		System.out.println("*******--------------*********");
		
        //****** Person Name List
        persons.stream().map(Person::getFirstName).collect(Collectors.toList())
        				.forEach(e -> System.out.println(e));

		System.out.println("*******--------------*********");
		
        //****** Person Id List
        persons.stream().map(Person::getNumber).collect(Collectors.toList())
        				.forEach(e -> System.out.println(e));

		System.out.println("*******--------------*********");
		
        //****** Person Id Map create
        List<Person> lastNameNodes =persons.stream().filter(e -> "Node".equals(e.getLastName())).collect(Collectors.toList());//LastName = "Node"
        Map<Integer, List<Person>> map = lastNameNodes.stream().collect(Collectors.groupingBy(Person::getNumber));//map create
        
        map.forEach((k,v) -> System.out.println("key: "+k+" value: "+v));//Map out with lambda

		System.out.println("*******--------------*********");
        
        
        
	}
}
