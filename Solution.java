package com.leetcode2;

import java.util.Arrays;

public class Solution implements Comparable<Solution> {
	
	private int id;
	private String name;
	private int age;
	private int salary;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 public Solution(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
	
	@Override
	public String toString() {
		return "Solution [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Solution s) {
		// TODO Auto-generated method stub
		return (this.id - s.id);
	}
	
	
	public static void main(String[] args) {
		Solution[] sol = new Solution[4];
		sol[0] = new Solution(10, "Mikey", 25, 10000);
		sol[1] = new Solution(20, "Arun", 29, 20000);
		sol[2] = new Solution(5, "Lisa", 35, 5000);
		sol[3] = new Solution(1, "Pankaj", 32, 50000);
		Sol s = new Sol();
		s.isTrue();
		
		Arrays.sort(sol);
		
		System.out.println(Arrays.toString(sol));
	}
	
	
}
