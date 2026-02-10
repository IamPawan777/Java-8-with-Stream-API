package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamString {

	public static void main(String[] args) {
		
/////		.chars()			    // convert to ASCII
		
//		// 1. with String -> No array/collection....
//		String str="12345";
//		int reduce = str.chars()			    // convert to ASCII
//						.map(n->n-'0')		    // transform into no.....
//						.reduce(0, (a,b) -> a+b);
//		System.out.println(reduce);				// Sum: 156		
		
		
		
//		// 2. *reverse each word in a string....
//        String str = "Pawan Kumar Singh";
//        String collect = Arrays.stream(str.split(" "))
//        						.map(n -> new StringBuilder(n).reverse())
//        						.collect(Collectors.joining(" "));
//        System.out.println(collect);					// nawaP ramuK hgniS
		
		
		
//        // 3. two String anagram or not..........
//        String str1 = "abc";
//        String str2 = "bca";       
//        boolean equals=str1.chars()
//			                .sorted()
//			                .mapToObj(ch -> String.valueOf(ch)).toList()        // again into String...
//			                .equals(str2.chars()
//			                            .sorted()
//			                            .mapToObj(ch -> String.valueOf(ch)).toList());
//		System.out.println(equals);
		
		
		
		
//		// sum of 10 natural number.....
//		int sum = IntStream.rangeClosed(1, 10)
//							.sum();
//		System.out.println(sum);
		
		
		
		
////      each string in list is palimdrome or not....
//      List<String> words = List.of("apple", "level", "madam", "grape", "apricot");
//      Map<String, Boolean> data = words.stream()
//                                      .collect(Collectors.toMap(
//                                          str->str, str->str.contentEquals(new StringBuilder(str).reverse())
//                                      ));
//      System.out.println(data);
		
		
		
		
//		// count of each words....
//		List<String> words = List.of("apple", "level", "madam", "grape", "apricot");
//		Map<String, Integer> collect = words.stream()
//											.collect(Collectors.toMap(str->str, str->str.length()));
//		System.out.println(collect);
		
	
		
		
		

	}

}
