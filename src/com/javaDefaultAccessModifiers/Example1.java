package com.javaDefaultAccessModifiers;

//super class: Example1
public class Example1
{	
	//fields
	String name;//default access modifier://package-level scope
	
	public Example1() {
	
		name="Kumar";
	}
	
	//setters and getters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getYourName()
	{
		return "[Your name=" + name + "]";
	}

	

}
