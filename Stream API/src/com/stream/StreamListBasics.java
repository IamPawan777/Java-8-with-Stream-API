package com.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamListBasics {

	public static void main(String[] args) {
///////////// Source.......		
//		List<Integer> num = List.of(3,5,12,99,34,3,86);
//		 // 1..stream() | Stream.of().... -> Create a stream object
//		Stream<Integer> st=num.stream();
//		Stream<Object> st = Stream.of(num, "hARRY");
//		st.forEach(System.out::println);					// method reference
		
		
		
//		// 2. Arrays.stream(..) ......-> Create a stream object
//		int[] arr = {12,34,54,3};
//		IntStream st = Arrays.stream(arr);
//		st.forEach(n->System.out.print(n+" "));				// lambda expression
		
		
		
/////////////// Intermediate.........
//		//  3.1 .map() -> modify/transform or same | size remains same
//		// .map(), mapToDouble(), mapToInt(), mapToLong()
//		List<Integer> num = List.of(3,5,12,99,34,3,86);
//		num.stream()
//			.map(n->n*2)
//			.forEach(m->System.out.print(m+" "));	                 // 6 10 24 198 68 6 172
		
		
		
//		//3.2 .map(), -> with String (character)......
//		String str="Pawan bisht";
//		str.chars()
//			.map(ch->Character.toUpperCase(ch))
//			.forEach(n->System.out.print((char)n));						// PAWAN BISHT
		
		
		
		
//		//3.3 map() => with String..(String).....
//		String str="Harry Sam";
//		String collect = str.chars()
//			.mapToObj(ch -> String.valueOf((char)ch).toLowerCase())
//			.collect(Collectors.joining());
//		System.out.println(collect);								// harry sam
		
		
		
		
//		// 3.4 .mapToDouble() -> int to double		
//		List<Integer> num = List.of(3,5,12,99,34,3,86);
//		num.stream()
//			.mapToDouble(n->Double.valueOf(n)+1)						//	.mapToDouble(Integer::valueOf)
//			.forEach(n->System.out.print(n+"  "));						// 4.0  6.0  13.0  100.0  35.0  4.0  87.0 
		
		
		
//		// 3.4.1   .flapmap() -> to flatten nested structures
//		List<List<Integer>> listOfList = List.of(
//				List.of(1,2,3),
//				List.of(4,5),
//				List.of(6,7,8,9)
//		);
//		listOfList.stream()
//					.flatMap(l->l.stream())							 //   .flatMap(List::stream)  
//					.forEach(n->System.out.print(n+" "));			 // 1 2 3 4 5 6 7 8 9
		
		
		
		
//		// 4. .filter() -> condition | size may reduce
//		List<Integer> list=List.of(23,4,12,88,55,66);
//		list.stream()
//			.filter(n->n%2==0)
//			.sorted()
//			.forEach(n->System.out.print(n+" "));					// 4 12 66 88 
		
		
		
		
		// 5. .peek() -> inspect element(check ) || (map() + filter())
		List<Integer> list=List.of(33,1,77,12,24,10);
		List<Integer> list2=list.stream()
								.map(n -> n*2)
								.peek(n->System.out.print(n+" "))
								.filter(n -> n>30)
								.toList();
		System.out.println();
		list2.forEach(n->System.out.print(n+" "));					// 66 154 48
		
		
		
		
//		// 6. count() -> to count elements
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		long count=list.stream()
//						.filter(n -> n>40)
//						.count();
//		System.out.println(count);									// 2
		
		
		
		
		
//		// 7. .sorted() -> reverse order......
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		list.stream()
//			.sorted(Collections.reverseOrder())
////			.sorted((a,b) -> b.compareTo(a))
////			.sorted((a,b) -> Integer.compare(b, a))        //  try to use with *Employee class......
////			.sorted((a,b)->b-a)                            // not use->Risky
//			.forEach(n->System.out.print(n+" "));                    // 99 56 33 23 12 3 
		
		
		
		
//		// 8. .min(),   .max(),  .ifPresent()  ->  max/min value
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		Integer orElse = list.stream()
//			.sorted(Collections.reverseOrder())
//			.findFirst()
//			.orElse(null);
//		System.out.println(orElse);				             // 99
//// ...or.............		
////		list.stream()
////			.max((a,b) -> Integer.compare(a, b))
////			.ifPresent(n->System.out.print(n));			// 99

		
		
		
//		// 9. .limit(n) -> 0 to n element......
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		List<Integer> list2=list.stream()
//								.limit(2).toList();
//		System.out.println(list2);						   // [23, 56]
		
		
		
		
		
//		// 10. .skip(n) -> skip n element
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		List<Integer> list2=list.stream()
//								.skip(4)
//								.toList();
//		System.out.println(list2);                         //[99, 33]
		
		
		
		
//		// 11. .findFirst() => find first (second height value?)
//		List<Integer> list=List.of(23,56,12,3,99,33);
//        int integer = list.stream()
//                         .sorted(Collections.reverseOrder())
//                         .skip(1)
//                         .findFirst()
//                         .get();
//         System.out.println(integer);                   // 56
		
		
		
		
////////// Terminal Operation............
//		// 1. .collect() || .toList() -> to convert stream to collection
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		List<Integer> collect = list.stream()
//									.map(n->n*2)
//									.collect(Collectors.toList());
//		System.out.println(collect);                              // [46, 112, 24, 6, 198, 66]
		
		
		
		
//		// 2. .toArray() -> convert into Array 
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		Integer[] arr=list.stream()
//							.toArray(Integer[]::new);
//		System.out.println(Arrays.toString(arr));				 // [23, 56, 12, 3, 99, 33]
		
		
		
		
//		// 3. reduce() -> Calculation, produce single value from multiple values
//		List<Integer> list=List.of(23,56,12,3,99,33);
//		int reduce = list.stream()
//						.reduce(0, (a,b)->a+b);				// initial value , accumulator 
//		System.out.println(reduce);							// 226	
		
	}
}
