package com.r.method;

//Method with object as return type & without parameter

public class Demo9 {
	Teacher getTeacher() {
		Teacher t = new Teacher();
		t.id = 102;
		t.name = "Monu";
		return t;
  
	}

	public static void main(String[] args) {
		Demo9 d = new Demo9();
		Teacher s = d.getTeacher();
		System.out.println("Id :: " + s.id);
		System.out.println("Name :: " + s.name);
	}

}

class Teacher {
	int id;
	String name;
}
