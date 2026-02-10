package com.Suppier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		
		Supplier<Integer> otp=() -> new Random().nextInt(1000, 9999);
		System.out.println(otp.get());
	}
}
