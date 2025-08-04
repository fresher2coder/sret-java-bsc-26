package exceptionhandling;

import java.util.*;

public class Demo {

	public static void main(String args[]) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Bob", 85));
		list.add(new Student("Charlie", 65));
		list.add(new Student("Alice", 95));
		list.add(new Student("David", 45));
		
		list.sort((stu1, stu2) -> stu1.marks - stu2.marks);
		
		list.sort((stu1, stu2) -> stu1.name.compareTo(stu2.name));
		System.out.println(list);
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(34);
		nums.add(4);
		nums.add(14);
		nums.add(24);
		
		nums.sort((a,b) -> b-a);
		
		System.out.println(nums);
		
		
		
	}
	
}

class Student{
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}
