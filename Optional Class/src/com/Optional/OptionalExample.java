package com.Optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
//		// 1. without Optional.......
//		String value= withoutOptional();
//		if(value!=null)
//			value=value.toUpperCase();
//		System.out.println(value);
		
		
		
//		 2. with Optional..........
		Optional<String> value = withOptional();
		
		if(value.isPresent()) {
			String str = value.get();
			System.out.print(str.toUpperCase());
		}
		else {
			System.out.println("No-> "+value.orElseThrow());
		}
	}
	
	
	public static String withoutOptional(){
		return null;
	}
	
	public static Optional<String> withOptional(){
		return Optional.of("JAVA Language");
//		return Optional.empty();
	}
	
}
