package com.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		// Find employee that have 'id' is 33.....
		Predicate<Employee> pre = e->e.getId()==33;
		for(Employee e:setEmp()) {
			if(pre.test(e)) {			// only return boolean
				System.out.println(e.getName());
				break;
			}
		}

	}
	
	public static List<Employee> setEmp(){
		List<Employee> list=List.of(
				new Employee(11, "Pawan", 120),
				new Employee(22, "Harry", 200),
				new Employee(33, "Kamal", 900),
				new Employee(44, "Omcar", 100)
		);
		return list;
	}

}
