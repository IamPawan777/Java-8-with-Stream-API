 package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
	public static void main(String[] args) {
//       //1.employee who earn more that 2000 without Stream......
//		List<String> ans=new ArrayList<>();
//		for(Employee x: getEmpInfo()) {
//			if(x.getSalary()>2000)
//				ans.add(x.getName());
//		}
//		System.out.println(ans);
           
		
		
		
//		//2.filter(), map() -> employee who earn more that 2000 with Stream.......
//		List<Employee> emp=getEmpInfo();
//		emp.stream()
//			.filter(e->e.getSalary()>2000)
//			.map(e->e.getName())
//			.forEach(e->System.out.println(e));
		
		
		
		
//		//3. .count() -> count Female....
//		List<Employee> emp=getEmpInfo();
//		long totalF=emp.stream()
//						.filter(e->e.getGender()=='F')
//						.count();
//		System.out.println(totalF);
		

		
		
//		//4.1 collect(), .toList() -> only female employee list....
//		List<Employee> list=getEmpInfo();
//		List<Employee> ans=list.stream()
//								.filter(e->e.getGender()=='F')
//								.toList();							//collect(Collectors.toList());
//		ans.forEach(e->System.out.println(e));					// System.out.println(ans); -> .toString()
		
		
		
//		// 4.2 .toMap() -> employee id with name......
//		List<Employee> list=getEmpInfo();
//		Map<Integer, String> collect = list.stream()
//											.collect(Collectors.toMap(e->e.getId(), e->e.getName()));
//		System.out.println(collect);
		
		
		
//		// 5. .max(), comparator -> maximum salary employee.....
//		List<Employee> list=getEmpInfo();
//		Employee employee = list.stream()
//								.max((a,b)->Integer.compare(a.getSalary(), b.getSalary()))    // comparator
//								.get();
//		System.out.println(employee.getName()+" -> "+employee.getSalary());
		
		
		
		
//		//6.1 groupingBy() -> based on gender: count employee.
//		List<Employee> list=getEmpInfo();
//		Map<Character, Long> collect = list.stream()
//										.collect(Collectors.groupingBy(e->e.getGender(), Collectors.counting()));
//		System.out.println(collect);
		
		
		
//		//6.2 groupingBy(), averageInt(), -> both gender average age
//		List<Employee> list=getEmpInfo();
//		Map<Character, Double> collect = list.stream()
//											.collect(Collectors.groupingBy(e->e.getGender(), 
//																			Collectors.averagingLong(e->e.getAge())));
//		System.out.println(collect);
		
		
		
		
//		//*6.3 groupingBy(), summingInt() -> both gender salary...
//		List<Employee> list=getEmpInfo();
//		Map<Character, Integer> collect = list.stream()
//			.collect(Collectors.groupingBy(e->e.getGender(), Collectors.summingInt(e->e.getSalary())));
//		System.out.println(collect);
		
		
		
		
		
		// 7 .joining() -> use same string/character among values.
		List<Employee> list=getEmpInfo();
		String collect = list.stream()
							.map(e->e.getName())
							.collect(Collectors.joining(", "));
		System.out.println(collect);

		
		
		
		
		
    }
	
	
	
	
	public static List<Employee> getEmpInfo(){
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee(11, "Harry", 21, 1000, 'M');
		Employee e2=new Employee(22, "Komal", 40, 2000, 'F');
		Employee e3=new Employee(33, "Naveen", 56, 1500, 'M');
		Employee e4=new Employee(44, "Lokesh", 34, 9000, 'M');
		Employee e5=new Employee(55, "Apple", 90, 5000,'M');
		Employee e6=new Employee(66, "Raavi", 20, 3000,'F');
		Employee e7=new Employee(77, "Gita", 80, 6100,'F');
		Employee e8=new Employee(88, "Anapurna", 20, 900,'F');
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		return list;		
	}
}
