package com.javaProtectedAccessModifiers1;

public class ProtectedTestClass {

	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		System.out.println(example1.getYourName());

		System.out.println("--------------------------------");
		
		Example2 example2 = new Example2();
		example2.setName("Raj");
		System.out.println(example2.getName());
		
	}

}
