package com.stream;

import java.time.Year;

public class Employee2 {
	 // Attributes
    private int id;
    private String name;
    private String city;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoin;
    private double salary;
    
    // Parameterized Constructor
    public Employee2(int id, String name, String city, int age, String gender, String department, int yearOfJoin, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoin = yearOfJoin;
        this.salary = salary;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getYearOfJoin() {
        return yearOfJoin;
    }
    
    public void setYearOfJoin(int yearOfJoin) {
        this.yearOfJoin = yearOfJoin;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Calculate years of experience
    public int getYearsOfExperience() {
        return Year.now().getValue() - yearOfJoin;
    }
    
    // toString() method for displaying employee information
    @Override
    public String toString() {
        return String.format(
            "Employee [ID=%d, Name=%s, City=%s, Age=%d, Gender=%s, " +
            "Department=%s, YearOfJoin=%d, Salary=%.2f]",
            id, name, city, age, gender, department, yearOfJoin, salary
        );
    }
}
