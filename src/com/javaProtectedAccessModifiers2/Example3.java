package com.javaProtectedAccessModifiers2;

import com.javaProtectedAccessModifiers1.Example1;

public class Example3 extends Example1
{
	public Example3() {
		name = "Harish";//The field Example1.name is not visible
	}
	
	public String getName120()
	{
		return name;
	}
}
