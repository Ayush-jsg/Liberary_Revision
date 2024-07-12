package com.r.method;
//Method with onject as parameter & without return type 

public class Demo8 {
	void print(Student s) {
		System.out.println("Id :: " + s.id);
		System.out.println("Name :: " + s.name);
		
	}
	public static void main(String[] args) {
		Demo8 d = new Demo8();
		Student s = new Student();
		s.id= 101;
		s.name="Monu";
		
		d.print(s);
	}

}

class Student{
	int id;
	String name;
}
