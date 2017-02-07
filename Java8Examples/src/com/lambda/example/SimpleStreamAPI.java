package com.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamAPI {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 1, 1, 1);

		// **** forEach
		integers.forEach(System.out::println);

		System.out.println("*******--------------*********");

		// **** filter
		List<Integer> ones = integers.stream().filter(i -> i.equals(1)).collect(Collectors.toList());
		ones.forEach(System.out::println);

		System.out.println("*******--------------*********");

		int sum = integers.stream().mapToInt(i -> i).sum();
		double avarage = integers.stream().mapToInt(i -> i).average().getAsDouble();
		int max = integers.stream().max(Integer::compare).get();
		int min = integers.stream().min(Integer::compare).get();

		System.out.println("toplam: "+sum);
		System.out.println("ort: "+avarage);
		System.out.println("max: "+max);
		System.out.println("min: "+min);

		System.out.println("*******--------------*********");
		
		// **** distinct
		List<Integer> distincts = integers.stream().distinct().collect(Collectors.toList());
		distincts.forEach(System.out::println);

		System.out.println("*******--------------*********");
		
		// ***** count
		long count = integers.stream().filter(i -> i.equals(1)).count();
		System.out.println("Birlerin Sayısı: " + count);
		
	}
}
