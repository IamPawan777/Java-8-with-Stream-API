package com.Function;

import java.util.*;
import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		// 1. string with with length........
//		Function<String, Integer> data = s->s.length();
//		System.out.println(data.apply("Java"));
		
		
		//2. sum of all Employee salary object.....
		Function<Employee, Integer> data = t -> t.getSalary();
		int sum=0;
		
		for(Employee e:getEmp()) {
			sum+=data.apply(e);			// return integer
		}
		System.out.println(sum);
		
		
		
	}
	
	public static List<Employee> getEmp() {
		Employee emp1 = new Employee(11, "Java", 120);
		Employee emp2 = new Employee(12, "CPP", 100);
		Employee emp3 = new Employee(13, "CPP", 200);
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		return list;
	}	
}
