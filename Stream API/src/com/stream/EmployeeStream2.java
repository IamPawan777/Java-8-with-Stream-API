package com.stream;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream2 {

	public static void main(String[] args) {
		List<Employee2> employees = employeeList();

        // Stream operations...
        // // 1. map() -> list of employee 'names'
//         List<String> empName = employees.stream()
        //                                 // .map(emp -> emp.getName())
        //                                 .map(Employee2::getName)
        //                                 .toList();
        // System.out.println(empName);



        // // 2. filter() -> employees 'name' from 'IT' department
        // List<String> empIT = employees.stream()
        //                             .filter(emp -> emp.getDepartment().equals("IT"))
        //                             .map(n -> n.getName())
        //                             .toList();
        // System.out.println(empIT);



        // // 3 .count() -> number of employees who age>30
        // int count = (int)employees.stream()
        //                         .filter(age -> age.getAge()>30)
        //                         .count();
        // System.out.println(count);



        // //  print names and ages, who age between 25 and 30
        // List<Pair> empAge = employees.stream()
        //                         .filter(age -> age.getAge()>=25 && age.getAge()<=30)
        //                         .map(n -> new Pair(n.getName(), n.getAge()))
        //                         .toList();        
        // System.out.println(empAge);



        // // 4 .limit(n) -> n beginning elements
        // employees.stream()
        //             .limit(3)
        //             .map(n -> new Pair(n.getName(), n.getAge()))
        //             .forEach(val -> System.out.println(val+" "));



        // // 5 .skip(n) -> skip n elements
        //  employees.stream()
        //              .skip(5)
        //              .forEach(System.out::println);


        // // 6. .allMatch() -> all elements match the condition  | 
        //  //  .anyMatch() -> any elements match the condition
        //  //  .nonematch() -> no any elements match the condition
        // boolean match = employees.stream()
        //                             .allMatch(n -> n.getSalary()>40000);
        // System.out.println(match);                                           // true



        // // 7. .findAny() -> get one any element matching the condition
        // employees.stream()
        //             .findAny()
        //             .ifPresent(n -> System.out.println(n));                    // Employee [ID=6.....]


        // // 8. findFirst() -> first element from stream
        // Employee2 emp = employees.stream()
        //                         .findFirst()
        //                         .get();
        // System.out.println(emp);                                            // Employee [ID=6.....].


        // // 9. sorted() -> sort employees based on ID in reverse order
        // employees.stream()
        //             .sorted((a,b) -> Integer.compare(b.getId(), a.getId()))         // -> {return b.getId()-a.getId();}
        //             .forEach(n -> System.out.println(n));



        // // 10. .min(), max() salary employee
        // Employee2 maxSalary = employees.stream()
        //                                 .min((a,b) -> Double.compare(a.getSalary(), b.getSalary()))
        //                                 .get();
        // System.out.println("Min Salary Employee: "+maxSalary);                    // Min Salary Employee: Employee [ID=8, Name=Eight, City=Ahmedabad



        // // 11. IntegerStream -> .mapToInt(), .mapToDouble(), | .average(), .getAsDouble() -> average age of employees
        // int avgSalary = (int)employees.stream()
        //                             .mapToInt(n -> n.getAge())
        //                             .average()                              // double
        //                             .getAsDouble();
        // System.out.println("Average Salary: "+avgSalary);                          // Average Salary: 61222.22222222222


        // *12. toMap() -> Map<name, salary> or can solve using 'Pair' class
        // Map<String, Double> empNameAndSalaries = employees.stream()
                                                            // .collect(Collectors.toMap(n->n.getName(), m->m.getSalary()));
        // // or
        // List<Pair> empNameAndSalaries = employees.stream()
        //                                             .map(n -> new Pair(n.getName(), n.getAge()))
        //                                             .toList();                                            
        // System.out.println(empNameAndSalaries);


        
//         // *13 .groupingBy() -> group employees by department
//        Map<String, Long> empByDept = employees.stream()
//                                                .collect(Collectors.groupingBy(
//                                                    n->n.getDepartment(), 
//													  Collectors.counting()
//                                                ));
//        System.out.println(empByDept);



         // *13.1 .summingDouble() -> sum salary by gender
         employees.stream()         
                     .collect(Collectors.groupingBy(
                         n -> n.getGender(), Collectors.summingDouble(m -> m.getSalary())
                     )).
                     forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		// 13.2  all departement averag salary.....
//		Map<String, Double> collect = employees.stream()
//				.collect(Collectors.groupingBy(
//						Employee2::getDepartment, 
//						Collectors.averagingDouble(Employee2::getSalary)
//				));
//		System.out.println(collect);







	}

	
	public static List<Employee2> employeeList() {
        List<Employee2> empList = List.of(
            new Employee2(6, "Six", "Delhi", 21, "Male", "HR", 2011, 50000),
            new Employee2(2, "Two", "Mumbai", 25, "Female", "Finance", 2015, 60000),
            new Employee2(3, "Three", "Bangalore", 30, "Male", "IT", 2010, 75000),
            new Employee2(4, "Four", "Chennai", 28, "Female", "Marketing", 2013, 52000),
            new Employee2(5, "Five", "Kolkata", 35, "Male", "Sales", 2008, 80000),
            new Employee2(1, "One", "Hyderabad", 29, "Female", "IT", 2014, 72000),
            new Employee2(7, "Seven", "Pune", 32, "Male", "Finance", 2009, 68000),
            new Employee2(8, "Eight", "Ahmedabad",  26, "Female", "HR", 2016, 48000),
            new Employee2(9, "Nine", "Jaipur", 31, "Male", "IT", 2012, 55000)
        );
        return empList;
    }


    static class Pair{
        String name;
        int age;
        Pair(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' + " age=" + age ;
        }
    }
}
