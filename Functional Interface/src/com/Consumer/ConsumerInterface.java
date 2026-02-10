package com.Consumer;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(10);
		
		Consumer<List<Integer>> con = s->{
			System.out.println("Example of Consumer interface: ");
			int ans=s.get(0)*s.get(1);
			System.out.println("Answer: "+ans);
		};
		con.accept(list);			// return nothing
	}
}
