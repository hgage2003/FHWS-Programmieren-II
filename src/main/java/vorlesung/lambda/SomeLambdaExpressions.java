package vorlesung.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class SomeLambdaExpressions {

    public static void main(String[] args) {
	List<String> bBrothers = Arrays.asList("Burt", "Bronski", "Peter");

	bBrothers //mapping uppercase
		.stream()
		.map(name -> name.toUpperCase())
		.forEach(name -> System.out.println(name));
	
	
	bBrothers //mapping String to int
		.stream()
		.map(name -> name.length())
		.forEach(name -> System.out.println(name));
	
	bBrothers //with method reference
        	.stream()
        	.map(String::length)
        	.forEach(System.out::println);
	
	List<Integer> i = //map to new type
	bBrothers
        	.stream()
        	.map(String::length)
        	.collect(Collectors.toList());
	i.stream().forEach(System.out::println);
	
	final long count = //count number of B-Brothers
	bBrothers 
        	.stream()
        	.filter(name -> name.startsWith("B"))
        	.count();
	System.out.println(count);
    }
}
